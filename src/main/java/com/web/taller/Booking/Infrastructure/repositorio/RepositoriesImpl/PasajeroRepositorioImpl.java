package com.web.taller.Booking.Infrastructure.repositorio.RepositoriesImpl;

import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.PasajeroRepositorio;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.ReservaRepositorio;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaPasajero;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PasajeroRepositorioImpl implements PasajeroRepositorio {

    @Autowired
    private SpringDataJpaPasajero repositorio;


    @Override
    public List<Pasajero> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Pasajero save(Pasajero pasajero) {
        return repositorio.save(pasajero);
    }
}
