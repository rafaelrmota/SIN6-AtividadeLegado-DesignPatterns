package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements Notificador {

    @Override
    public void notificar(Pedido pedido) {
        System.out.println("📱 Enviando SMS para " + pedido.getCliente());
    }
}
