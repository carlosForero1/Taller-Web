package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.Repositories.RutasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RutasService {

    @Autowired
    private RutasRepositorio repositorio;

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


    public List<Ruta> todasLasRutas() {
        return repositorio.findAll();
    }

    public boolean crearRuta(Ruta ruta){
        if (ruta != null){
            repositorio.save(ruta);
            return true;
        }
        return false;
    }

}
