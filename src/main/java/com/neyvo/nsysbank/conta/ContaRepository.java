package com.neyvo.nsysbank.conta;

import java.util.UUID;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends ListCrudRepository<Conta, UUID> {

}
