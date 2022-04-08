package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;	
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.example.demo.service.AmazonUploadService;

@Controller
public class MainController {	
	
	@Autowired
	private AmazonUploadService amazonUploadService;

	@PostMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file, Model model) {
		String linkDownload = this.amazonUploadService.uploadFile(file);
		System.out.println(linkDownload);
		model.addAttribute("linkDownload", linkDownload);
		return "successPage";
	}
	
	@GetMapping("/listFile")
	public String showListFile(Model model) {
		model.addAttribute("listFile", amazonUploadService.listFile());
		return "listFile";
	}
}