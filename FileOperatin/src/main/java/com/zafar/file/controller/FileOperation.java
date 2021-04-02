package com.zafar.file.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zafar.file.helper.FileUploaderHelper;

@RestController
public class FileOperation {
	@Autowired
	private FileUploaderHelper filehelper;
	@PostMapping(path = "/file")
	public ResponseEntity<String> upload(@RequestParam("file") MultipartFile multipartFile) throws IOException
	{
		String result=null;
		boolean chek= filehelper.upload(multipartFile);
		if(chek)
		{
			result="Successfully uploaded";
		}
		
		return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(multipartFile.getOriginalFilename()).toUriString());
	}

}
