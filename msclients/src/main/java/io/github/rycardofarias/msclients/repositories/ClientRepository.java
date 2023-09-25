package io.github.rycardofarias.msclients.repositories;

import io.github.rycardofarias.msclients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
