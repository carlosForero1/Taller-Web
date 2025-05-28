package com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa;

import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Domain.ValueObjects.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaPasajero extends JpaRepository<Pasajero,Long> {
}
