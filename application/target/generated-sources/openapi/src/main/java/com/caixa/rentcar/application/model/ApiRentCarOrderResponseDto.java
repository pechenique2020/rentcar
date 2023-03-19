package com.caixa.rentcar.application.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiRentCarOrderResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-19T09:44:23.978183+01:00[Europe/Madrid]")
public class ApiRentCarOrderResponseDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("client_dni")
  private String clientDni;

  @JsonProperty("car_plate")
  private String carPlate;

  @JsonProperty("start_date")
  private String startDate;

  @JsonProperty("end_date")
  private String endDate;

  @JsonProperty("return_date")
  private String returnDate;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("status")
  private String status;

  @JsonProperty("created_on")
  private String createdOn;

  public ApiRentCarOrderResponseDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ApiRentCarOrderResponseDto clientDni(String clientDni) {
    this.clientDni = clientDni;
    return this;
  }

  /**
   * Get clientDni
   * @return clientDni
  */
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getClientDni() {
    return clientDni;
  }

  public void setClientDni(String clientDni) {
    this.clientDni = clientDni;
  }

  public ApiRentCarOrderResponseDto carPlate(String carPlate) {
    this.carPlate = carPlate;
    return this;
  }

  /**
   * Get carPlate
   * @return carPlate
  */
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getCarPlate() {
    return carPlate;
  }

  public void setCarPlate(String carPlate) {
    this.carPlate = carPlate;
  }

  public ApiRentCarOrderResponseDto startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @ApiModelProperty(value = "")

@Pattern(regexp="yyyy-MM-dd") 
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ApiRentCarOrderResponseDto endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @ApiModelProperty(value = "")

@Pattern(regexp="yyyy-MM-dd") 
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ApiRentCarOrderResponseDto returnDate(String returnDate) {
    this.returnDate = returnDate;
    return this;
  }

  /**
   * Get returnDate
   * @return returnDate
  */
  @ApiModelProperty(value = "")

@Pattern(regexp="yyyy-MM-dd") 
  public String getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(String returnDate) {
    this.returnDate = returnDate;
  }

  public ApiRentCarOrderResponseDto price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ApiRentCarOrderResponseDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ApiRentCarOrderResponseDto createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  */
  @ApiModelProperty(value = "")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRentCarOrderResponseDto apiRentCarOrderResponse = (ApiRentCarOrderResponseDto) o;
    return Objects.equals(this.id, apiRentCarOrderResponse.id) &&
        Objects.equals(this.clientDni, apiRentCarOrderResponse.clientDni) &&
        Objects.equals(this.carPlate, apiRentCarOrderResponse.carPlate) &&
        Objects.equals(this.startDate, apiRentCarOrderResponse.startDate) &&
        Objects.equals(this.endDate, apiRentCarOrderResponse.endDate) &&
        Objects.equals(this.returnDate, apiRentCarOrderResponse.returnDate) &&
        Objects.equals(this.price, apiRentCarOrderResponse.price) &&
        Objects.equals(this.status, apiRentCarOrderResponse.status) &&
        Objects.equals(this.createdOn, apiRentCarOrderResponse.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientDni, carPlate, startDate, endDate, returnDate, price, status, createdOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRentCarOrderResponseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientDni: ").append(toIndentedString(clientDni)).append("\n");
    sb.append("    carPlate: ").append(toIndentedString(carPlate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

