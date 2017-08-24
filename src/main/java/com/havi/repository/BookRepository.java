package com.havi.repository;

import com.havi.domain.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by KimYJ on 2017-08-21.
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
}
