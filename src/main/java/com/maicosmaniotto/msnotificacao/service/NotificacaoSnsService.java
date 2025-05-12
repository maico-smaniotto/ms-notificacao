package com.maicosmaniotto.msnotificacao.service;

import org.springframework.stereotype.Service;

@Service
public class NotificacaoSnsService {

    public void enviarSms(String mensagem, String telefone) {
        // Implementar a lógica para enviar a notificação via SNS
        System.out.println("Enviando notificação para " + telefone + ": " + mensagem);
    }
}
