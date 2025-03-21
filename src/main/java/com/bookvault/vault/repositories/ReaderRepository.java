package com.bookvault.vault.repositories;

import com.bookvault.vault.models.Reader;
import com.bookvault.vault.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReaderRepository extends JpaRepository<Reader, Long> {
    Optional<User> findByEmail(String email);
}
