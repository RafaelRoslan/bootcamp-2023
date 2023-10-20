package edu.projeto.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_collectionBooks")
public class CollectionBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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
