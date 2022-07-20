package uz.jl.domains;

import lombok.Getter;


//@ToString
@Getter

public class Book {
    private Long id;
    private String name;
    private String author;


    public void initBean() {
        System.out.println("Init Method called");
    }

    public Book() {
    }

    public Book(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static Book getInstance() {
        System.out.println("Hello from factory method");
        return new Book(2L, "Me book", "ME");
    }

    public void destroyMethod() {
        System.out.println("destroy method called");
    }
}
