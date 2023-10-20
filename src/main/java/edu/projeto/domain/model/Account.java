package edu.projeto.domain.model;

public class Account {
    private Long id;
    private String email;
    private String registrationDate;

    //GET and SET: ID
    public Long getId() {
      return this.id;
    }
    public void setId(Long id) {
      this.id = id;
    }

    //GET and SET: EMAIL
    public String getEmail() {
      return this.email;
    }
    public void setEmail(String email) {
      this.email = email;
    }

    //GET and SET: REGISTRATION_DATE
    public String getRegistrationDate() {
      return this.registrationDate;
    }
    public void setRegistrationDate(String registrationDate) {
      this.registrationDate = registrationDate;
    }
}
