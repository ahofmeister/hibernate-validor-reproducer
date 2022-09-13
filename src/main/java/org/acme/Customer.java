package org.acme;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
public class Customer {

  @Id
  @GeneratedValue
  private Long id;

  @NotNull
  @Column(nullable = false, unique = true)
  private String userId;

  @Column(nullable = false)
  @Length(max = 40)
  @NotNull
  private String firstName;

  @Column(nullable = false)
  @Length(max = 40)
  @NotNull
  private String lastName;

}