package com.web.taller.Booking.Infrastructure.repositorio.RepositoriesImpl;

import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.ReservaRepositorio;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaPasajero;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaReserva;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaRutas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservaRepositorioImpl implements ReservaRepositorio {

    @Autowired
    private SpringDataJpaReserva repositorio;

    @Autowired
    private SpringDataJpaPasajero repositorioPasajero;

    @Autowired
    private SpringDataJpaRutas repositorioRuta;


    @Override
    public Reserva save(Reserva reserva) {
        return repositorio.save(reserva);
    }

    @Override
    public List<Reserva> findAll() {
        return repositorio.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public Pasajero buscarPorIdPasajero(Long id) {
        List<Pasajero> lista = repositorioPasajero.findAll();

        if (!lista.isEmpty() && lista != null) {
            for (Pasajero pasajero : lista) {
                if (pasajero.getId().equals(id)) {
                    return pasajero;
                }
            }
        }

        return null;
    }

    @Override
    public Ruta BuscarPorIdRuta(Long id) {

        List<Ruta> lista = repositorioRuta.findAll();

        if (!lista.isEmpty() && lista != null) {
            for (Ruta ruta : lista) {
                if (ruta.getId().equals(id)) {
                    return ruta;
                }
            }
        }

        return null;
    }
}

