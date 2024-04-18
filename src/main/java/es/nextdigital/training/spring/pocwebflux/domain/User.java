package es.nextdigital.training.spring.pocwebflux.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("users_test_mid")
public class User {
  @Id
  private Long id;

  private String customer_id;
  private String first_name;
  private String last_name;
  private String company;
  private String city;
  private String country;
  private String phone1;
  private String phone2;
  private String email;
  private LocalDate subscription_date;
  private String website;
}
