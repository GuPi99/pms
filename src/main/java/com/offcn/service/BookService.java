package com.offcn.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.offcn.bean.Book;
import com.offcn.dao.BookMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public PageInfo<Book> getBookList() {
        // TODO Auto-generated method stub
    	PageHelper.startPage(1,2);
         List<Book> list = bookMapper.getBookList();
         PageInfo<Book> pageInfo=new PageInfo<Book>(list);
		return pageInfo;
         
    }

}
