package ru.levchugov.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import lombok.AllArgsConstructor;
import ru.levchugov.model.Book;
import ru.levchugov.service.BookService;


@Controller("/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;


    @Get
    public HttpResponse<Iterable<Book>> allBooks() {
        System.out.println("fsd");
        return HttpResponse.ok().body(bookService.findAll());
    }

    @Get("/{id}")
    public HttpResponse<Book> findBookById(@PathVariable long id) {
        System.out.println("fsd");
           return HttpResponse.ok().body(bookService.findById(id));
    }

}
