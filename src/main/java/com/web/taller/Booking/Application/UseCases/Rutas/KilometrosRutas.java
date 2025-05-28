package com.web.taller.Booking.Application.UseCases.Rutas;

import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.RutasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KilometrosRutas {

    private RutasRepositorio repositorio;

    public KilometrosRutas(RutasRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Ruta> KilometrosNecesario(double km) {
        List<Ruta> rutas = repositorio.findAll();
        List<Ruta> resultado = new ArrayList<>();
        if (rutas != null) {
            for (Ruta ruta : rutas) {
                if (ruta.getKilometrosRuta() >= km) {
                    resultado.add(ruta);
                    return resultado;
                }
            }
        }
        return resultado;
    }

}
