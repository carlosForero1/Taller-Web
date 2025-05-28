package com.web.taller.Booking.Infrastructure.repositorio.RepositoriesImpl;

import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.ReservaRepositorio;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.RutasRepositorio;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaReserva;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaRutas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RutasRepositorioImpl implements RutasRepositorio {

    @Autowired
    private SpringDataJpaRutas repositorio;

    @Override
    public Ruta save(Ruta ruta) {
        return repositorio.save(ruta);
    }

    @Override
    public List<Ruta> findAll() {
        return repositorio.findAll();
    }
}
