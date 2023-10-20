package edu.projeto.domain.model;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private Account account;
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
