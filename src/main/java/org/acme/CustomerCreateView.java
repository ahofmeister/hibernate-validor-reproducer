package org.acme;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import javax.validation.constraints.NotNull;

@EntityView(Customer.class)
@CreatableEntityView(validatePersistability = false)
public abstract class CustomerCreateView {

  @IdMapping
  public abstract Long getId();

  @NotNull
  private String firstName;

  @NotNull
  private String lastName;

}

