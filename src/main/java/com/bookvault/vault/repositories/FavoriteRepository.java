package com.bookvault.vault.repositories;

import com.bookvault.vault.models.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}
