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
import com.equinix.openapi.metal.v1.model.InlineResponse2006Metro;
import com.equinix.openapi.metal.v1.model.InlineResponse2009ParentBlock;
import com.equinix.openapi.metal.v1.model.InlineResponse200Devices;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * InlineResponse2009IpAddresses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class InlineResponse2009IpAddresses {
  @SerializedName("address")
  private String address = null;

  @SerializedName("address_family")
  private Integer addressFamily = null;

  @SerializedName("assigned_to")
  private InlineResponse200Devices assignedTo = null;

  @SerializedName("cidr")
  private Integer cidr = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("gateway")
  private String gateway = null;

  @SerializedName("global_ip")
  private Boolean globalIp = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("manageable")
  private Boolean manageable = null;

  @SerializedName("management")
  private Boolean management = null;

  @SerializedName("metro")
  private InlineResponse2006Metro metro = null;

  @SerializedName("netmask")
  private String netmask = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("parent_block")
  private InlineResponse2009ParentBlock parentBlock = null;

  @SerializedName("public")
  private Boolean _public = null;

  public InlineResponse2009IpAddresses address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public InlineResponse2009IpAddresses addressFamily(Integer addressFamily) {
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Get addressFamily
   * @return addressFamily
  **/
  @ApiModelProperty(value = "")
  public Integer getAddressFamily() {
    return addressFamily;
  }

  public void setAddressFamily(Integer addressFamily) {
    this.addressFamily = addressFamily;
  }

  public InlineResponse2009IpAddresses assignedTo(InlineResponse200Devices assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Devices getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(InlineResponse200Devices assignedTo) {
    this.assignedTo = assignedTo;
  }

  public InlineResponse2009IpAddresses cidr(Integer cidr) {
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @ApiModelProperty(value = "")
  public Integer getCidr() {
    return cidr;
  }

  public void setCidr(Integer cidr) {
    this.cidr = cidr;
  }

  public InlineResponse2009IpAddresses createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public InlineResponse2009IpAddresses enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public InlineResponse2009IpAddresses gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @ApiModelProperty(value = "")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public InlineResponse2009IpAddresses globalIp(Boolean globalIp) {
    this.globalIp = globalIp;
    return this;
  }

   /**
   * Get globalIp
   * @return globalIp
  **/
  @ApiModelProperty(value = "")
  public Boolean isGlobalIp() {
    return globalIp;
  }

  public void setGlobalIp(Boolean globalIp) {
    this.globalIp = globalIp;
  }

  public InlineResponse2009IpAddresses href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public InlineResponse2009IpAddresses id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public InlineResponse2009IpAddresses manageable(Boolean manageable) {
    this.manageable = manageable;
    return this;
  }

   /**
   * Get manageable
   * @return manageable
  **/
  @ApiModelProperty(value = "")
  public Boolean isManageable() {
    return manageable;
  }

  public void setManageable(Boolean manageable) {
    this.manageable = manageable;
  }

  public InlineResponse2009IpAddresses management(Boolean management) {
    this.management = management;
    return this;
  }

   /**
   * Get management
   * @return management
  **/
  @ApiModelProperty(value = "")
  public Boolean isManagement() {
    return management;
  }

  public void setManagement(Boolean management) {
    this.management = management;
  }

  public InlineResponse2009IpAddresses metro(InlineResponse2006Metro metro) {
    this.metro = metro;
    return this;
  }

   /**
   * Get metro
   * @return metro
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2006Metro getMetro() {
    return metro;
  }

  public void setMetro(InlineResponse2006Metro metro) {
    this.metro = metro;
  }

  public InlineResponse2009IpAddresses netmask(String netmask) {
    this.netmask = netmask;
    return this;
  }

   /**
   * Get netmask
   * @return netmask
  **/
  @ApiModelProperty(value = "")
  public String getNetmask() {
    return netmask;
  }

  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }

  public InlineResponse2009IpAddresses network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public InlineResponse2009IpAddresses parentBlock(InlineResponse2009ParentBlock parentBlock) {
    this.parentBlock = parentBlock;
    return this;
  }

   /**
   * Get parentBlock
   * @return parentBlock
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2009ParentBlock getParentBlock() {
    return parentBlock;
  }

  public void setParentBlock(InlineResponse2009ParentBlock parentBlock) {
    this.parentBlock = parentBlock;
  }

  public InlineResponse2009IpAddresses _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009IpAddresses inlineResponse2009IpAddresses = (InlineResponse2009IpAddresses) o;
    return Objects.equals(this.address, inlineResponse2009IpAddresses.address) &&
        Objects.equals(this.addressFamily, inlineResponse2009IpAddresses.addressFamily) &&
        Objects.equals(this.assignedTo, inlineResponse2009IpAddresses.assignedTo) &&
        Objects.equals(this.cidr, inlineResponse2009IpAddresses.cidr) &&
        Objects.equals(this.createdAt, inlineResponse2009IpAddresses.createdAt) &&
        Objects.equals(this.enabled, inlineResponse2009IpAddresses.enabled) &&
        Objects.equals(this.gateway, inlineResponse2009IpAddresses.gateway) &&
        Objects.equals(this.globalIp, inlineResponse2009IpAddresses.globalIp) &&
        Objects.equals(this.href, inlineResponse2009IpAddresses.href) &&
        Objects.equals(this.id, inlineResponse2009IpAddresses.id) &&
        Objects.equals(this.manageable, inlineResponse2009IpAddresses.manageable) &&
        Objects.equals(this.management, inlineResponse2009IpAddresses.management) &&
        Objects.equals(this.metro, inlineResponse2009IpAddresses.metro) &&
        Objects.equals(this.netmask, inlineResponse2009IpAddresses.netmask) &&
        Objects.equals(this.network, inlineResponse2009IpAddresses.network) &&
        Objects.equals(this.parentBlock, inlineResponse2009IpAddresses.parentBlock) &&
        Objects.equals(this._public, inlineResponse2009IpAddresses._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressFamily, assignedTo, cidr, createdAt, enabled, gateway, globalIp, href, id, manageable, management, metro, netmask, network, parentBlock, _public);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009IpAddresses {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    globalIp: ").append(toIndentedString(globalIp)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manageable: ").append(toIndentedString(manageable)).append("\n");
    sb.append("    management: ").append(toIndentedString(management)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    parentBlock: ").append(toIndentedString(parentBlock)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

