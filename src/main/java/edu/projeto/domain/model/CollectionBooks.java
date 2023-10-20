package edu.projeto.domain.model;

import java.util.List;

public class CollectionBooks {
    private Long id;
    private String name;
    private List<Book> books;

    //GET and SET: ID
    public Long getId() {
      return this.id;
    }
    public void setId(Long id) {
      this.id = id;
    }

    //GET and SET: NAME
    public String getNome() {
      return this.name;
    }
    public void setNome(String name) {
      this.name = name;
    }

    //GET and SET: BOOKS
    public List<Book> getBooks() {
      return this.books;
    }
    public void setBooks(List<Book> books) {
      this.books = books;
    }
}
