package uz.jl;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookController {
    public BookService bookService;


    public BookController() {
    }

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
}
