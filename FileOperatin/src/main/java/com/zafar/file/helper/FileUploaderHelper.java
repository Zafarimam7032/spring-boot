package com.zafar.file.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class FileUploaderHelper {
//private final String File_Dir="D:\\GreatWits SpringBoot\\FileOperatin\\src\\main\\resources\\static\\images";
	public final String File_Dir=new ClassPathResource("/static/images/").getFile().getAbsolutePath();
	public FileUploaderHelper() throws IOException
	{
		//File_Dir=new ClassPathResource("/satatic/images/").getFile().getAbsolutePath();
	}
	public boolean upload(MultipartFile multipartFile) throws IOException {
		// TODO Auto-generated method stub
		boolean check=false;
		InputStream inputStream=multipartFile.getInputStream();
		byte filesize[]=new byte[inputStream.available()];
		inputStream.read(filesize);
		FileOutputStream outstream=new FileOutputStream(File_Dir+File.separator+multipartFile.getOriginalFilename());
			outstream.write(filesize);
			outstream.flush();
			outstream.close();
			check =true;
		return check;
	}

}
