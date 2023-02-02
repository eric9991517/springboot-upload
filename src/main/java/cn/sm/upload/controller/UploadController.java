package cn.sm.upload.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
	Map<String,Object> result = new HashMap<String,Object>();
	/*
	 * 接收文件
	 */
	@PostMapping("/uploadAttach")
	public Map<String,Object> upload(@RequestParam("attach") MultipartFile file)throws Exception{
		//處理文件區塊
		System.out.println("文件原文名:"+ file.getOriginalFilename());
		System.out.println("文件類型:"+ file.getContentType());
		
		String home = System.getProperty("user.home"); // 取得Mac Home目錄 
		
		//將檔案儲存到本機
		file.transferTo(new File(home + "/Documents/"+file.getOriginalFilename()));
		result.put("success", true);
		return result;
	}
}
