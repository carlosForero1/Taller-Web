package com.web.taller.Booking.Application.UseCases.Email;

import com.web.taller.Booking.Domain.Entities.EmailEntity;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.EmailRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListarTodosLosEmail {
    private final EmailRepositorio repositorio;

    public ListarTodosLosEmail(EmailRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<EmailEntity> todosLosEmail() {
        return repositorio.findAll();
    }

    public Optional<EmailEntity> BuscarPorId(Long id) {
        return repositorio.findById(id);
    }
}
