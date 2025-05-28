package com.web.taller.Booking.Infrastructure.repositorio.Repositories;


import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Domain.Entities.Ruta;

import java.util.List;

public interface ReservaRepositorio  {
    Reserva save(Reserva reserva);
    List<Reserva> findAll();
    void deleteById(Long id);
    Pasajero buscarPorIdPasajero(Long id);
    Ruta BuscarPorIdRuta(Long id);
}
