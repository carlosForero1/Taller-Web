package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.Domain.Entities.Email;
import com.web.taller.Booking.Infrastructure.Repositories.EmailRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailServicio {
    @Autowired
    private EmailRepositorio repositorio;


    public List<Email> todosLosEmail(){
        return repositorio.findAll();
    }

    public Optional<Email> BuscarPorId(Long id){
        return repositorio.findById(id);
    }

    public boolean crearEmail(Email email) {
        if (email != null) {
            repositorio.save(email);
            return true;
        }
        return false;
    }
}
