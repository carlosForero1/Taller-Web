package com.web.taller.Booking.Infrastructure.repositorio.Repositories;

import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Domain.Entities.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RutasRepositorio {

    Ruta save(Ruta ruta);
    List<Ruta> findAll();
}
