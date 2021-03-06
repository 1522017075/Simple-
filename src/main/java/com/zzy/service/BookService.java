package com.zzy.service;

import com.zzy.model.po.Book;

import java.util.List;

public interface BookService {
    public List<Book> list();

    public void addOrUpdate(Book book);

    public void deleteById(int id);

    public List<Book> listByCategory(int cid);

    public List<Book> Search(String keywords);
}
