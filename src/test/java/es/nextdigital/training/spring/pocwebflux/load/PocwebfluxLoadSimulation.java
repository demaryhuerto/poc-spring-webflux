package es.nextdigital.training.spring.pocwebflux.load;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class PocwebfluxLoadSimulation extends Simulation {
  HttpProtocolBuilder httpProtocol =
    http.baseUrl("http://localhost:8080")
      .acceptHeader("application/json")
      .contentTypeHeader("application/json");

  ScenarioBuilder myFirstScenario = scenario("POC Webflux Scenario")
    .exec(http("Request 1")
      .get("/user/email/taylorhancock@andrews.biz"))
    ;

  {
    setUp(
      myFirstScenario.injectOpen(
        rampUsers(50).during(10),
        constantUsersPerSec(50).during(20)
      )
    ).protocols(httpProtocol);
  }
}
