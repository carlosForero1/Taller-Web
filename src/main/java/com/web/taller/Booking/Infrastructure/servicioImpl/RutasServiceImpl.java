package com.web.taller.Booking.Infrastructure.servicioImpl;

import com.web.taller.Booking.Application.UseCases.Rutas.CrearRuta;
import com.web.taller.Booking.Application.UseCases.Rutas.KilometrosRutas;
import com.web.taller.Booking.Application.UseCases.Rutas.TodasLasRutas;
import com.web.taller.Booking.Application.interfaces.RutasService;
import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.RutasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RutasServiceImpl implements RutasService {
    private final CrearRuta rutas;
    private final KilometrosRutas kilometrosRutas;
    private final TodasLasRutas todasLasRutas;

    public RutasServiceImpl(CrearRuta ruta, KilometrosRutas kilometrosRutas, TodasLasRutas todasLasRutas) {
        this.rutas = ruta;
        this.kilometrosRutas = kilometrosRutas;
        this.todasLasRutas = todasLasRutas;
    }

    @Override
    public List<Ruta> KilometrosNecesario(double km) {
        return kilometrosRutas.KilometrosNecesario(km);
    }

    @Override
    public List<Ruta> todasLasRutas() {
        return todasLasRutas.todasLasRutas();
    }

    @Override
    public boolean crearRuta(Ruta ruta) {
        return rutas.crearRuta(ruta);
    }
}
