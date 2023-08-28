package com.luistrindade.projetociet.repositories;

import com.luistrindade.projetociet.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
