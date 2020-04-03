package io.shcmsa.springboot.service;

import java.util.Optional;

import io.shcmsa.springboot.domain.Book;

public interface BookService {

	Optional<Book> findById(Long Id);
}