package com.web.taller.Booking.Application.UseCases.Rutas;

import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.RutasRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CrearRuta {

    private RutasRepositorio repositorio;

    public CrearRuta(RutasRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean crearRuta(Ruta ruta){
        if (ruta != null && ruta.getCupo() <= ruta.getLimiteDelCupo()){
            repositorio.save(ruta);
            return true;
        }
        return false;
    }

}
