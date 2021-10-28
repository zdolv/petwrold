package com.petworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.petworld.command.NoticeVO;
import com.petworld.service.NoticeService;



@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	@Qualifier("NoticeService")
	private NoticeService noticeService;
	
	@RequestMapping("/detail")
	public void detail() {}
	
	@RequestMapping("/modify")
	public void modify() {}
	
	@RequestMapping("/notice")
	public void notice() {}
	
	@RequestMapping("/question")
	public void question() {}
	
	@RequestMapping("/regist")
	public void regist() {}
	
	@RequestMapping("registForm")
	public String registForm(NoticeVO vo,RedirectAttributes RA) {
		 System.out.println(vo.toString());
		 
		boolean result = noticeService.regist(vo);
		
		System.out.println(result + "작성완료");

		 
		return "redirect:/notice/question";
	}
	
}
