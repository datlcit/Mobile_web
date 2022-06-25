package com.dat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dat.entities.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer>{

}
