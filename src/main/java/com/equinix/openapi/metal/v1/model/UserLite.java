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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * UserLite
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:48:24.543Z")
public class UserLite {
  @SerializedName("avatar_thumb_url")
  private String avatarThumbUrl = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("short_id")
  private String shortId = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public UserLite avatarThumbUrl(String avatarThumbUrl) {
    this.avatarThumbUrl = avatarThumbUrl;
    return this;
  }

   /**
   * Avatar thumbnail URL of the User
   * @return avatarThumbUrl
  **/
  @ApiModelProperty(value = "Avatar thumbnail URL of the User")
  public String getAvatarThumbUrl() {
    return avatarThumbUrl;
  }

  public void setAvatarThumbUrl(String avatarThumbUrl) {
    this.avatarThumbUrl = avatarThumbUrl;
  }

  public UserLite createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the user was created
   * @return createdAt
  **/
  @ApiModelProperty(value = "When the user was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserLite email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Primary email address of the User
   * @return email
  **/
  @ApiModelProperty(value = "Primary email address of the User")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserLite firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the User
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the User")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserLite fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of the User
   * @return fullName
  **/
  @ApiModelProperty(value = "Full name of the User")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserLite href(String href) {
    this.href = href;
    return this;
  }

   /**
   * API URL uniquely representing the User
   * @return href
  **/
  @ApiModelProperty(value = "API URL uniquely representing the User")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public UserLite id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the User
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of the User")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserLite lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the User
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the User")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserLite shortId(String shortId) {
    this.shortId = shortId;
    return this;
  }

   /**
   * Short ID of the User
   * @return shortId
  **/
  @ApiModelProperty(required = true, value = "Short ID of the User")
  public String getShortId() {
    return shortId;
  }

  public void setShortId(String shortId) {
    this.shortId = shortId;
  }

  public UserLite updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * When the user details were last updated
   * @return updatedAt
  **/
  @ApiModelProperty(value = "When the user details were last updated")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLite userLite = (UserLite) o;
    return Objects.equals(this.avatarThumbUrl, userLite.avatarThumbUrl) &&
        Objects.equals(this.createdAt, userLite.createdAt) &&
        Objects.equals(this.email, userLite.email) &&
        Objects.equals(this.firstName, userLite.firstName) &&
        Objects.equals(this.fullName, userLite.fullName) &&
        Objects.equals(this.href, userLite.href) &&
        Objects.equals(this.id, userLite.id) &&
        Objects.equals(this.lastName, userLite.lastName) &&
        Objects.equals(this.shortId, userLite.shortId) &&
        Objects.equals(this.updatedAt, userLite.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarThumbUrl, createdAt, email, firstName, fullName, href, id, lastName, shortId, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLite {\n");
    
    sb.append("    avatarThumbUrl: ").append(toIndentedString(avatarThumbUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

