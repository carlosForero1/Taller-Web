package com.web.taller.Booking.Infrastructure.RepositoriesImpl;

import com.web.taller.Booking.Domain.Entities.Reserva;
import com.web.taller.Booking.Infrastructure.Repositories.ReservaRepositorio;
import com.web.taller.Booking.Infrastructure.RepositoriesJpa.SpringDataJpaReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservaRepositorioImpl implements ReservaRepositorio {

    @Autowired
    private SpringDataJpaReserva repositorio;

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
}
