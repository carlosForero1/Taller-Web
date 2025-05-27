package com.web.taller.Booking.Infrastructure.RepositoriesJpa;

import com.web.taller.Booking.Domain.Entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaReserva extends JpaRepository<Reserva, Long> {
}