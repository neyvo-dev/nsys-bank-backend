package com.neyvo.nsysbank.conta;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contas")
@AllArgsConstructor
public class ContaController {

  private final ContaService contaService;

  @PostMapping
  public Conta cadastrar(@RequestBody ContaDTO conta) {
    var novaConta = new Conta(UUID.randomUUID(), conta.numero(), conta.cpf(), conta.nome(), new BigDecimal("0.0"));
    return contaService.cadastrar(novaConta);

  }

  @GetMapping
  public List<Conta> listar() {
    return contaService.listar();
  }

}
