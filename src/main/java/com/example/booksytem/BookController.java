package com.example.booksytem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")

public class BookController {

    @Autowired
    private BookService bookService;

  /*  public BookController(BookService bookService){
        this.bookService = bookService;
    }*/

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping ("/{id}")
    private ResponseEntity<Book> findById (@PathVariable int id){
        Book book = bookService.findId(id);
        if (book != null)
            return ResponseEntity.ok(book);
        else
            return ResponseEntity.notFound().build();
    }
    @PostMapping
    private ResponseEntity<Book> add(@RequestBody Book book){
        if (bookService.addBook(book))
               return new ResponseEntity<>(book, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(book, HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("/{id}")
    private ResponseEntity<Book> delete(@PathVariable int id){
        if (bookService.deleteBook(id))
            return ResponseEntity.ok().build();
        else
            return ResponseEntity.badRequest().build();
    }

}
