package com.neyvo.nsysbank.user;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ListCrudRepository<User, String> {

  UserDetails findByLogin(String login);

}
