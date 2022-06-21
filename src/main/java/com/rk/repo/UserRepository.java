package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rk.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
