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
import com.equinix.openapi.metal.v1.model.InlineResponse20014SshKeys;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20014
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class InlineResponse20014 {
  @SerializedName("ssh_keys")
  private List<InlineResponse20014SshKeys> sshKeys = null;

  public InlineResponse20014 sshKeys(List<InlineResponse20014SshKeys> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public InlineResponse20014 addSshKeysItem(InlineResponse20014SshKeys sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<InlineResponse20014SshKeys>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Get sshKeys
   * @return sshKeys
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20014SshKeys> getSshKeys() {
    return sshKeys;
  }

  public void setSshKeys(List<InlineResponse20014SshKeys> sshKeys) {
    this.sshKeys = sshKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(this.sshKeys, inlineResponse20014.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sshKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
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

