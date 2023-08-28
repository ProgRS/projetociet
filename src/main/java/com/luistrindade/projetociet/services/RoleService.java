package com.luistrindade.projetociet.services;

import com.luistrindade.projetociet.models.Role;

import java.util.List;

public interface RoleService {

   public List<Role> findAll();
   public Role create(Role role);
   public Boolean delete(Long id);

}
