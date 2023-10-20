package edu.projeto.domain.model;

public class Book {
    private Long id;
    private String title;
    private String author;
    private int    yearPublished;
    private String genre;
    private String publisher;

    //GET and SET: ID
    public Long getId() {
      return this.id;
    }
    public void setId(Long id) {
      this.id = id;
    }

    //GET and SET: TITLE
    public String getTitle() {
      return this.title;
    }
    public void setTitle(String title) {
      this.title = title;
    }

    //GET and SET: AUTHOR
    public String getAuthor() {
      return this.author;
    }
    public void setAuthor(String author) {
      this.author = author;
    }

    //GET and SET: YEARPUBLISHER
    public int getYearPublished() {
      return this.yearPublished;
    }
    public void setYearPublished(int yearPublished) {
      this.yearPublished = yearPublished;
    }

    //GET and SET: GENRE
    public String getGenre() {
      return this.genre;
    }
    public void setGenre(String genre) {
      this.genre = genre;
    }

    //GET and SET: PUBLISHER
    public String getPublisher() {
      return this.publisher;
    }
    public void setPublisher(String publisher) {
      this.publisher = publisher;
    }

}
