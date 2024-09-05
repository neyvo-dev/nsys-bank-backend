package com.neyvo.nsysbank.conta;

import java.math.BigDecimal;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "conta")
public record Conta(
    @Id UUID id,
    Long numero,
    String cpf,
    String nome,
    BigDecimal saldo) {

}
