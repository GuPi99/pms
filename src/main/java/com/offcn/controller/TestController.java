package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.offcn.bean.Book;
import com.offcn.bean.User;
import com.offcn.service.BookService;
import com.offcn.service.UserService;


@Controller
public class TestController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	@RequestMapping("/msg")
	public String getMsg(){
		return "index.jsp";
	}

	@ResponseBody
	@RequestMapping("/find")
	public PageInfo<Book> find(){
		return bookService.getBookList();
	}
	@RequestMapping("/login")
	public String deng(User user){
		User emp = userService.selectUser(user);
		if(emp!=null){
			return "/WEB-INF/success.jsp";
		}else {
			return "index.jsp";
		}
	}
}
