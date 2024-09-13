package com.neyvo.nsysbank.notificacao;

import java.util.UUID;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacaoRepository extends ListCrudRepository<Notificacao, UUID>,
    PagingAndSortingRepository<Notificacao, UUID> {

}
