package com.guigu.instructional.payment.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.guigu.instructional.po.DataDictionary;

@RequestMapping("/downdown/")
@Controller
public class UploadController {
	
	@RequestMapping("down.action")
				public void down(HttpServletRequest request,HttpServletResponse response)throws Exception{
					String fileName = request.getSession().getServletContext().getRealPath("others")+"/jiaowu.pdm";
				
				InputStream bis = this.getClass().getResourceAsStream("/others/create_table.sql");
				
				response.addHeader("Content-Disposition", "attachment;filename=" + "create_table.sql");
				response.setContentType("multipart/form-data");
				BufferedOutputStream oout =new BufferedOutputStream(response.getOutputStream());
				 int len = 0; 
			while((len = bis.read())!=-1){ 
			 oout.write(len); 
			 oout.flush(); 
			} 
			oout.close();
			}
	
	@RequestMapping("down2.action")
	public void down2(HttpServletRequest request,HttpServletResponse response)throws Exception{
		String fileName = request.getSession().getServletContext().getRealPath("others")+"/jiaowu.pdm";
	
	InputStream bis = this.getClass().getResourceAsStream("/others/jiaowu.pdm");
	
	response.addHeader("Content-Disposition", "attachment;filename=" + "jiaowu.pdm");
	response.setContentType("multipart/form-data");
	BufferedOutputStream oout =new BufferedOutputStream(response.getOutputStream());
	 int len = 0; 
while((len = bis.read())!=-1){ 
 oout.write(len); 
 oout.flush(); 
} 
oout.close();
}

	
	
	@RequestMapping("down1.action")
	public void down1(HttpServletRequest request,HttpServletResponse response)throws Exception{
		String fileName = request.getSession().getServletContext().getRealPath("others")+"/table.png";
	System.out.println(fileName);
	InputStream bis = this.getClass().getResourceAsStream("/others/table.png");
	
	response.addHeader("Content-Disposition", "attachment;filename=" + "table.png");
	response.setContentType("multipart/form-data");
	BufferedOutputStream oout =new BufferedOutputStream(response.getOutputStream());
	 int len = 0; 
while((len = bis.read())!=-1){ 
 oout.write(len); 
 oout.flush(); 
} 
oout.close();
}


	@RequestMapping("show1.action")
	public String list( Model model) {
		return "system/datadictionary/datadictionary_showtable";
	}
	

}
	
	
	