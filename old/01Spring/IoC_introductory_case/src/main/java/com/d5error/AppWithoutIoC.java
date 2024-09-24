package com.d5error;

import com.d5error.service.impl.BookServiceImpl;
import com.d5error.service.BookService;

public class AppWithoutIoC {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
