package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.RutasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public interface RutasService {


    List<Ruta> KilometrosNecesario(double km);

    List<Ruta> todasLasRutas();

    boolean crearRuta(Ruta ruta);

}
