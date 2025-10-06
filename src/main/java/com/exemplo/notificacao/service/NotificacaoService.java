package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.List;  

@Service
public class NotificacaoService {

    private final List<Notificador> notificadores;

    public NotificacaoService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void notificar(Pedido pedido) {
        for (Notificador notificador : notificadores) {
            notificador.notificar(pedido);
        }
    }
}
