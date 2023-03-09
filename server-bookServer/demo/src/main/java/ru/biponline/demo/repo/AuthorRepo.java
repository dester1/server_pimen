package ru.biponline.demo.repo;

import org.springframework.data.repository.CrudRepository;
import ru.biponline.demo.entity.BookEntity;

public interface AuthorRepo extends CrudRepository<BookEntity, Long> {
}