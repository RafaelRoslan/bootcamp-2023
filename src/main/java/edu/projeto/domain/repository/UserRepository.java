package edu.projeto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.projeto.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
