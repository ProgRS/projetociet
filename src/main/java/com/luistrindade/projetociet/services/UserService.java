package com.luistrindade.projetociet.services;

import com.luistrindade.projetociet.models.Role;
import com.luistrindade.projetociet.models.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public User create(User user);
    public Boolean delete(Long id);
    public  Boolean update(Long id, User user);

}
