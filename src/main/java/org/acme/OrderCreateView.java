package org.acme;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@EntityView(OrderProcess.class)
@CreatableEntityView(validatePersistability = false)
public abstract class OrderCreateView {

  @NotNull
  private String productId;

  @NotNull
  @Valid
  private CustomerCreateView customer;

  @IdMapping
  public abstract Long getId();

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public CustomerCreateView getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerCreateView customer) {
    this.customer = customer;
  }
}