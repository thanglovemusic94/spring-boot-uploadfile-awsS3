package com.example.demo.model;

public class S3File {
	private String fileName;
	private String linkDownload;

	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getLinkDownload() {
		return linkDownload;
	}
	public void setLinkDownload(String linkDownload) {
		this.linkDownload = linkDownload;
	}
	public S3File(String fileName, String linkDownload) {
		super();
		this.fileName = fileName;
		this.linkDownload = linkDownload;
	}
	public S3File() {
		super();
	}
	
	
	
	
}