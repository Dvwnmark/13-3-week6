package com.example.demo.reponse;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ERole;
import com.example.demo.entity.Role;


public interface RoleReponsitory extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(ERole name);
}

