package com.bookvault.vault.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("ADMIN") // Define o tipo de usuário no banco
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends User {
    // Aqui você pode adicionar funcionalidades específicas para administradores no futuro
}
