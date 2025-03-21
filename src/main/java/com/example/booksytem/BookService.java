package com.example.booksytem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    List<Book> listOfBooks;

    public BookService (){
        this.listOfBooks = MockBooks.getBooks();
    }

    public List<Book> getAllBooks(){
        return listOfBooks;
    }

    public Book findId (int id){
        for (Book book : listOfBooks){
            if (book.getId() == id)
                    return book;
        }
        return null;
    }
    public boolean addBook(Book book){
       // int latestBookId = listOfBooks.size();

        if (!book.getAuthor().isEmpty() && !book.getTitle().isEmpty())
            return this.listOfBooks.add(book);
        else
            return false;

    }
    public boolean deleteBook(int id){
        Book book = findId(id);
        return listOfBooks.remove(book);




    }

}
