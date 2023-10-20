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
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CollectionBooks> collections;

    public Long getId() {
      return this.id;
    }
    public void setId(Long id) {
      this.id = id;
    }

    public String getName() {
      return this.name;
    }
    public void setName(String name) {
      this.name = name;
    }

    public Account getAccount() {
      return this.account;
    }
    public void setAccount(Account account) {
      this.account = account;
    }

    public List<CollectionBooks> getCollections() {
      return this.collections;
    }
    public void setCollections(List<CollectionBooks> collectionBooks) {
      this.collections = collectionBooks;
    }
}
