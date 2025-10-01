package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements Notificador {

    @Override
    public void notificar(Pedido pedido) {
        System.out.println("📧 Enviando EMAIL para " + pedido.getCliente());
    }
}

