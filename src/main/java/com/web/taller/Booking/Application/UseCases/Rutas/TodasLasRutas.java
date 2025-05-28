package com.web.taller.Booking.Application.UseCases.Rutas;

import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.RutasRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodasLasRutas {
    private RutasRepositorio repositorio;

    public TodasLasRutas(RutasRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Ruta> todasLasRutas() {
        return repositorio.findAll();
    }
}
