package com.luistrindade.projetociet.repositories;

import com.luistrindade.projetociet.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long> {
}
