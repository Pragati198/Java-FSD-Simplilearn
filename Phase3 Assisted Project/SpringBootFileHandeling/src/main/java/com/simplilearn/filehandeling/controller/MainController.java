package com.simplilearn.filehandeling.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index.html";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@ResponseBody
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		String result = "File was uploaded successfully";
		
		try {
			File convertFile = new File("scr/main/" + file.getOriginalFilename());
			convertFile.createNewFile();
			FileOutputStream fout = new FileOutputStream(convertFile);
			fout.write(file.getBytes());
			fout.close();
		} catch (IOException iex) {
			result = "Error " + iex.getMessage();
		} finally {
			return result;
		}
	}
	
	@RequestMapping(value = "/download", method = RequestMethod.GET)
    public ResponseEntity<Object> downloadFile() throws IOException  {
            String fileName = "static/DemoFile.txt";
    ClassLoader classLoader = new MainController().getClass().getClassLoader();

    File file = new File(classLoader.getResource(fileName).getFile());
            
       InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
       HttpHeaders headers = new HttpHeaders();
          
       headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
       headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
       headers.add("Pragma", "no-cache");
       headers.add("Expires", "0");
          
       ResponseEntity<Object>
       responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length()).contentType(
          MediaType.parseMediaType("application/txt")).body(resource);
          
       return responseEntity;
    }

}