/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse2005Servers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class InlineResponse2005Servers {
  @SerializedName("available")
  private Boolean available = null;

  @SerializedName("metro")
  private String metro = null;

  @SerializedName("plan")
  private String plan = null;

  @SerializedName("quantity")
  private String quantity = null;

  public InlineResponse2005Servers available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Returns true if there is enough capacity in the metro to fulfill the quantity set. Returns false if there is not enough.
   * @return available
  **/
  @ApiModelProperty(value = "Returns true if there is enough capacity in the metro to fulfill the quantity set. Returns false if there is not enough.")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public InlineResponse2005Servers metro(String metro) {
    this.metro = metro;
    return this;
  }

   /**
   * The metro ID or code sent to check capacity.
   * @return metro
  **/
  @ApiModelProperty(value = "The metro ID or code sent to check capacity.")
  public String getMetro() {
    return metro;
  }

  public void setMetro(String metro) {
    this.metro = metro;
  }

  public InlineResponse2005Servers plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * The plan ID or slug sent to check capacity.
   * @return plan
  **/
  @ApiModelProperty(value = "The plan ID or slug sent to check capacity.")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public InlineResponse2005Servers quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of servers sent to check capacity.
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of servers sent to check capacity.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005Servers inlineResponse2005Servers = (InlineResponse2005Servers) o;
    return Objects.equals(this.available, inlineResponse2005Servers.available) &&
        Objects.equals(this.metro, inlineResponse2005Servers.metro) &&
        Objects.equals(this.plan, inlineResponse2005Servers.plan) &&
        Objects.equals(this.quantity, inlineResponse2005Servers.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, metro, plan, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005Servers {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

