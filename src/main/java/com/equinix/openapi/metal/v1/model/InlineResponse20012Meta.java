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
import com.equinix.openapi.metal.v1.model.InlineResponse200Devices;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse20012Meta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class InlineResponse20012Meta {
  @SerializedName("first")
  private InlineResponse200Devices first = null;

  @SerializedName("last")
  private InlineResponse200Devices last = null;

  @SerializedName("next")
  private InlineResponse200Devices next = null;

  @SerializedName("previous")
  private InlineResponse200Devices previous = null;

  @SerializedName("self")
  private InlineResponse200Devices self = null;

  @SerializedName("total")
  private Integer total = null;

  public InlineResponse20012Meta first(InlineResponse200Devices first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Devices getFirst() {
    return first;
  }

  public void setFirst(InlineResponse200Devices first) {
    this.first = first;
  }

  public InlineResponse20012Meta last(InlineResponse200Devices last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Devices getLast() {
    return last;
  }

  public void setLast(InlineResponse200Devices last) {
    this.last = last;
  }

  public InlineResponse20012Meta next(InlineResponse200Devices next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Devices getNext() {
    return next;
  }

  public void setNext(InlineResponse200Devices next) {
    this.next = next;
  }

  public InlineResponse20012Meta previous(InlineResponse200Devices previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Devices getPrevious() {
    return previous;
  }

  public void setPrevious(InlineResponse200Devices previous) {
    this.previous = previous;
  }

  public InlineResponse20012Meta self(InlineResponse200Devices self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Devices getSelf() {
    return self;
  }

  public void setSelf(InlineResponse200Devices self) {
    this.self = self;
  }

  public InlineResponse20012Meta total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012Meta inlineResponse20012Meta = (InlineResponse20012Meta) o;
    return Objects.equals(this.first, inlineResponse20012Meta.first) &&
        Objects.equals(this.last, inlineResponse20012Meta.last) &&
        Objects.equals(this.next, inlineResponse20012Meta.next) &&
        Objects.equals(this.previous, inlineResponse20012Meta.previous) &&
        Objects.equals(this.self, inlineResponse20012Meta.self) &&
        Objects.equals(this.total, inlineResponse20012Meta.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, next, previous, self, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012Meta {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

