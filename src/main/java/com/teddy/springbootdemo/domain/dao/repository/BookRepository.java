package com.teddy.springbootdemo.domain.dao.repository;

import com.teddy.springbootdemo.domain.dao.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
