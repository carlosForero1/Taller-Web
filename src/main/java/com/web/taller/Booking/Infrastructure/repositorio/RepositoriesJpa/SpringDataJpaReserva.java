package com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa;

import com.web.taller.Booking.Domain.Aggregate.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaReserva extends JpaRepository<Reserva, Long> {
}