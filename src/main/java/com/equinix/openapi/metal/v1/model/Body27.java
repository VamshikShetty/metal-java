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
import com.equinix.openapi.metal.v1.model.ProjectsiddevicesbatchBatches;
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
 * Body27
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class Body27 {
  @SerializedName("batches")
  private List<ProjectsiddevicesbatchBatches> batches = null;

  public Body27 batches(List<ProjectsiddevicesbatchBatches> batches) {
    this.batches = batches;
    return this;
  }

  public Body27 addBatchesItem(ProjectsiddevicesbatchBatches batchesItem) {
    if (this.batches == null) {
      this.batches = new ArrayList<ProjectsiddevicesbatchBatches>();
    }
    this.batches.add(batchesItem);
    return this;
  }

   /**
   * Get batches
   * @return batches
  **/
  @ApiModelProperty(value = "")
  public List<ProjectsiddevicesbatchBatches> getBatches() {
    return batches;
  }

  public void setBatches(List<ProjectsiddevicesbatchBatches> batches) {
    this.batches = batches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body27 body27 = (Body27) o;
    return Objects.equals(this.batches, body27.batches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body27 {\n");
    
    sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
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

