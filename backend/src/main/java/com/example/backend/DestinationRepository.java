package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
