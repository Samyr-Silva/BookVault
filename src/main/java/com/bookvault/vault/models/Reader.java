package com.bookvault.vault.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("READER") // Define o tipo de usuário no banco
@NoArgsConstructor
@AllArgsConstructor
public class Reader extends User {
    // Aqui você pode adicionar funcionalidades específicas para leitores no futuro
}
