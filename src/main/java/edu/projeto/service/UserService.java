package edu.projeto.service;

import edu.projeto.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

    
    
}
