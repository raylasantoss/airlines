package br.com.smartweb.airlines;

import java.util.Objects;
import java.util.Optional;

public class ServicoDeBagagem {

    private ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem(ServicoDeReserva servicoDeReserva) {
        this.servicoDeReserva = Objects.requireNonNull(servicoDeReserva, "Serviço de reserva não pode ser nulo");
    }

    public void contratar(String codigoReserva, int quantidadeBagagens) {
        if (quantidadeBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens inválida");
        }

        Optional<Reserva> reservaOptional = servicoDeReserva.buscar(codigoReserva);

 
        Reserva reserva = reservaOptional.orElseThrow(() -> 
            new IllegalArgumentException("Reserva não encontrada para o código: " + codigoReserva)
        );

     
        reserva.adicionarBagagens(quantidadeBagagens);
    }
}