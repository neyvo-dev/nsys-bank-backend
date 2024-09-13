package com.neyvo.nsysbank.notificacao;

import com.neyvo.nsysbank.conta.Conta;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificacaoProducer {

  private final KafkaTemplate<String, Conta> kafkaTemplate;

  public void enviarNotificacao(Conta conta) {
    kafkaTemplate.send("conta-notification", conta);
  }
}
