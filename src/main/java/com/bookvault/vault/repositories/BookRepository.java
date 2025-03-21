package com.bookvault.vault.repositories;

import com.bookvault.vault.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
