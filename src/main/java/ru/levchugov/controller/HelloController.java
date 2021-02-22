package ru.levchugov.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get("/hello")
    public HttpResponse<String> hello() {
        return HttpResponse.ok().body("hello");
    }

    @Get
    public HttpResponse<String> first() {
        return HttpResponse.ok().body("first page");
    }

}
