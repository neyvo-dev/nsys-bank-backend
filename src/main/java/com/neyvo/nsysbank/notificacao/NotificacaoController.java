package com.neyvo.nsysbank.notificacao;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notificacoes")
@AllArgsConstructor
public class NotificacaoController {

  private final NotificacaoRepository notificacaoRepository;

  @GetMapping
  public Page<Notificacao> listar(Pageable pageable) {

    return notificacaoRepository.findAll(pageable);

  }

}
