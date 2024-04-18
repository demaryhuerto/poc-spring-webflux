package es.nextdigital.training.spring.pocwebflux.repository;

import es.nextdigital.training.spring.pocwebflux.domain.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends R2dbcRepository<User, Long> {

  Mono<User> findByEmail(String email);
}
