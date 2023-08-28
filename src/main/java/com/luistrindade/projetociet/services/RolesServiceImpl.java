package com.luistrindade.projetociet.services;

import com.luistrindade.projetociet.models.Role;
import com.luistrindade.projetociet.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RoleService{

    @Autowired
    private RolesRepository repository;

    public RolesServiceImpl(RolesRepository repository){
        this.repository =repository;
    }
    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Role create(Role role) {
      role.setName(role.getName().toUpperCase());
      Role roleCreated =  this.repository.save(role);
      return  roleCreated;
    }
}
