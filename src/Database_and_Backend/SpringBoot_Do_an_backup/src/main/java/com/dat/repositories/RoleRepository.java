package com.dat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dat.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
