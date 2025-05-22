package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.Domain.Entities.Reserva;
import com.web.taller.Booking.Infrastructure.Repositories.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservaServicio {
    @Autowired
    private ReservaRepositorio repositorio;


    public List<Reserva> BuscarPorNombrePasajero(String nombre) {
        List<Reserva> lista = repositorio.findAll();
        List<Reserva> resultado = new ArrayList<>();

        for (Reserva reserva : lista) {
            if (reserva.getPasajero().getNombre().equals(nombre)) {
                resultado.add(reserva);
            }
        }
        return resultado;
    }


    public boolean borrarReserva(Long id) {
        List<Reserva> reserva = repositorio.findAll();

        if (id != null) {
            repositorio.deleteById(id);
            return true;
        }
        return false;
    }
}
