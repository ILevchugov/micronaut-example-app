package ru.levchugov.model;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@MappedEntity
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private final Long id;

    private final String name;

    private final String author;

}
