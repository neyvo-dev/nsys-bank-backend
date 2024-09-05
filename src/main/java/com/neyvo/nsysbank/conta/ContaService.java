package com.neyvo.nsysbank.conta;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContaService {

  private final ContaRepository contaRepository;
  public Conta cadastrar(Conta conta) {
    var contaSalva = contaRepository.save(conta);
    return contaSalva;
  }

}
