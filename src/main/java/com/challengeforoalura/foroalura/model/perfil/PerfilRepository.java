package com.challengeforoalura.foroalura.model.perfil;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    Perfil findByNombre(String nombre);
}
