package com.neyvo.nsysbank.conta;

import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends ListCrudRepository<Conta, UUID> {

}
