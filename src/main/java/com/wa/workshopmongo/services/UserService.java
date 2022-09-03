package com.wa.workshopmongo.services;

import com.wa.workshopmongo.domain.User;
import com.wa.workshopmongo.dto.UserDTO;
import com.wa.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UserService implements Serializable {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
