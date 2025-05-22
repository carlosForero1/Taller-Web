package com.web.taller.Booking.Infrastructure.Repositories;

import com.web.taller.Booking.Domain.Entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva,Long> {
}
