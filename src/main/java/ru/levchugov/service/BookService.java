package ru.levchugov.service;

import lombok.AllArgsConstructor;
import ru.levchugov.model.Book;
import ru.levchugov.repository.BookRepository;

import javax.inject.Singleton;
import java.util.Optional;

@Singleton
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book findById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}

