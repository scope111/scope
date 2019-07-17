package com.scope.BookManager.service;

import com.scope.BookManager.dao.BookDAO;
import com.scope.BookManager.model.Book;
import com.scope.BookManager.model.enums.BookStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//将DAO层封装
@Service
public class BookService {
    @Autowired //自动注入bookDAO
    private BookDAO bookDAO;
    public List<Book> getAllBooks()
    {
       return  bookDAO.selectAll();
    }

    public int addBooks(Book book)
    {
        return  bookDAO.addBook(book);
    }
    public  void deleteBooks(int id)
    {
        bookDAO.updateBookstatus(id, BookStatusEnum.DELETE.getValue());
    }
    public  void recoverBooks(int id)
    {
        bookDAO.updateBookstatus(id,BookStatusEnum.NORMAL.getValue());
    }
}
