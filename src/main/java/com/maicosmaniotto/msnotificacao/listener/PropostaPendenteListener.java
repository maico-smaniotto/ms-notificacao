package com.maicosmaniotto.msnotificacao.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.maicosmaniotto.msnotificacao.constant.MensagemConstant;
import com.maicosmaniotto.msnotificacao.domain.Proposta;
import com.maicosmaniotto.msnotificacao.service.NotificacaoSnsService;

public class PropostaPendenteListener {

    private NotificacaoSnsService notificacaoSnsService;

    @RabbitListener(queues = "${rabbitmq.queue.proposta.pendente}")
    public void propostaPendente(Proposta proposta) {
        String mensagem = String.format(MensagemConstant.PROPOSTA_EM_ANALISE, proposta.getUsuario().getNome());
        notificacaoSnsService.enviarSms(mensagem, proposta.getUsuario().getTelefone());
    }

}
