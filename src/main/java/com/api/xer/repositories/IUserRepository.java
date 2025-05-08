package com.api.xer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.xer.models.Usuario;

@Repository
public interface IUserRepository extends JpaRepository<Usuario,Long> {

}
 