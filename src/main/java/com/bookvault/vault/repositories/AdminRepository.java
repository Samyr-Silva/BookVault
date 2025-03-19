package com.bookvault.vault.repositories;

import com.bookvault.vault.models.Admin;
import com.bookvault.vault.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<User> findByEmail(String email);

}
