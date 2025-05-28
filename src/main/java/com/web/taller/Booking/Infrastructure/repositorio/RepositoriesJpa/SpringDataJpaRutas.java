package com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa;

import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Domain.ValueObjects.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaRutas extends JpaRepository<Ruta,Long> {
}
