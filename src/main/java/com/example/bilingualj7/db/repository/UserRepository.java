package com.example.bilingualj7.db.repository;

import com.example.bilingualj7.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.email = :email")
    Optional<User> findByEmail(String email);

    @Query("select case when count(u) > 0 then true else false end from User u where u.email=:email")
    boolean existsByEmail(@Param("email") String email);

}
