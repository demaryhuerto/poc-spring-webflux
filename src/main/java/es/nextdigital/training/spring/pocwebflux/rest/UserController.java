package es.nextdigital.training.spring.pocwebflux.rest;

import es.nextdigital.training.spring.pocwebflux.domain.User;
import es.nextdigital.training.spring.pocwebflux.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserRepository userRepository;

  @GetMapping("/email/{email}")
  @ResponseStatus(HttpStatus.OK)
  public Mono<User> getUserByEmail(@PathVariable("email") String email) {
    return userRepository.findByEmail(email);
  }
}
