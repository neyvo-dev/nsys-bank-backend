package com.neyvo.nsysbank.notificacao;

import com.neyvo.nsysbank.conta.Conta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificacaoService {

  private NotificacaoProducer notificacaoProducer;

  public void notificar(Conta conta) {

    notificacaoProducer.enviarNotificacao(conta);

  }

}
