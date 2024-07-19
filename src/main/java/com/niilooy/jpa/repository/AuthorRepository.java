package com.niilooy.jpa.repository;

import com.niilooy.jpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
//    select * from author where first_name = '';
    List<Author> findAllByFirstName(String fn);

    List<Author> findAllByFirstNameIgnoreCase(String fn);

    //    select * from author where lower(first_name) like '%il%';
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    //    select * from author where lower(first_name) like 'ni%';
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);

    //    select * from author where lower(first_name) like '%oy';
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

    //    select * from author where first_name in ('niloy', 'whatever');
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
