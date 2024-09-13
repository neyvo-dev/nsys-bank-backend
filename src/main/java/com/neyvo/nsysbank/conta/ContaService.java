package com.neyvo.nsysbank.conta;

import com.neyvo.nsysbank.notificacao.NotificacaoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContaService {

  private final ContaRepository contaRepository;
  private final NotificacaoService notificacaoService;


  public Conta cadastrar(Conta conta) {
    var contaSalva = contaRepository.save(conta);

    //notificar no kafka
    notificacaoService.notificar(conta);

    return contaSalva;
  }

  public List<Conta> listar() {
    return contaRepository.findAll();
  }
}
