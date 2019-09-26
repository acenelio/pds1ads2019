package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
