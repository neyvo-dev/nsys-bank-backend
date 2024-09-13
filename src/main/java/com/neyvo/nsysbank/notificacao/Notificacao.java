package com.neyvo.nsysbank.notificacao;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notificacao")
public record Notificacao(
    @Id UUID id, String notificacao, LocalDateTime dataHora
    ) {

}
