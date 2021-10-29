package com.petworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.petworld.command.NoticeVO;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@RequestMapping("/question")
	public void question() {}
	
	@RequestMapping("/detail")
	public void detail() {}
	
	@RequestMapping("/modify")
	public void modify() {}
	
	@RequestMapping("/notice")
	public void notice() {}
	
	@RequestMapping("/regist")
	public void regist() {}
	
}
