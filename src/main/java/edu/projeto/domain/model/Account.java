package edu.projeto.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String email;

    @Column(length = 8)
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
