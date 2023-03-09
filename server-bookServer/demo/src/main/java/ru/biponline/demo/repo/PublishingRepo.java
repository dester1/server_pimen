package ru.biponline.demo.repo;

import org.springframework.data.repository.CrudRepository;
import ru.biponline.demo.entity.BookEntity;

public interface PublishingRepo extends CrudRepository<BookEntity, Long> {
}