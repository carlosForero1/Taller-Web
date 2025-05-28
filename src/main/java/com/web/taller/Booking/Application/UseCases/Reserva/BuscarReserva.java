package com.web.taller.Booking.Application.UseCases.Reserva;

import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.ReservaRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuscarReserva {
    private final ReservaRepositorio repositorio;

    public BuscarReserva(ReservaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

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

}
