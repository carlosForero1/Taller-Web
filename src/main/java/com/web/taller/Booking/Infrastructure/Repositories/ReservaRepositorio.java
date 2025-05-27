package com.web.taller.Booking.Infrastructure.Repositories;


import com.web.taller.Booking.Domain.Entities.Reserva;

import java.util.List;

public interface ReservaRepositorio  {
    Reserva save(Reserva reserva);
    List<Reserva> findAll();
    void deleteById(Long id);
}
