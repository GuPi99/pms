package com.offcn.dao;



import java.util.List;

import com.github.pagehelper.PageInfo;
import com.offcn.bean.Book;



public interface BookMapper {

    public List<Book> getBookList();

}
