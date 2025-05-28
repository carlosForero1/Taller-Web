package com.web.taller.Booking.Infrastructure.repositorio.RepositoriesImpl;

import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Domain.Entities.EmailEntity;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.EmailRepositorio;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.ReservaRepositorio;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaEmail;
import com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa.SpringDataJpaReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmailRepositorioImpl implements EmailRepositorio {

    @Autowired
    private SpringDataJpaEmail repositorio;


    @Override
    public EmailEntity save(EmailEntity email) {
        return repositorio.save(email);
    }

    @Override
    public List<EmailEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<EmailEntity> findById(Long id) {
        return repositorio.findById(id);
    }
}
