package com.neyvo.nsysbank.notificacao;

import com.neyvo.nsysbank.conta.Conta;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class NotificacaoConsumer {

  private final NotificacaoRepository notificacaoRepository;

  @KafkaListener(topics = "conta-notification", groupId = "nsys-bank-conta")
  public void receberNotificacao(Conta conta) {

    if(Objects.nonNull(conta))
      notificacaoRepository.save(new Notificacao(
          UUID.randomUUID(),
          "Conta criada com sucesso: "+conta,
          LocalDateTime.now()));

  }

}
