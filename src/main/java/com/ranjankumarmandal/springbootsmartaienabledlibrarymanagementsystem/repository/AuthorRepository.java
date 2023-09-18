package com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.repository;

import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findByEmail(String email);

    @Query("select  a from Author a where a.email = ?1")
    Author getAuthorWithEmailAddressWithoutNative(String email);

    @Query(value = "select * from author where email =: email", nativeQuery = true)
    Author getAuthorWithEmailAddressWithNative(String email);
}
