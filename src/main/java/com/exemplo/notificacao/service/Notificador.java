package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

public interface Notificador {
    void notificar(Pedido pedido);
}
