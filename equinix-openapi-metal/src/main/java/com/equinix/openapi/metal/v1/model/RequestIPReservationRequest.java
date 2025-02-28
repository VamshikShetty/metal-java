/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.metal.v1.model.IPReservationRequestInput;
import com.equinix.openapi.metal.v1.model.VrfIpReservationCreateInput;
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
import java.util.UUID;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.equinix.openapi.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestIPReservationRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RequestIPReservationRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RequestIPReservationRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RequestIPReservationRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<IPReservationRequestInput> adapterIPReservationRequestInput = gson.getDelegateAdapter(this, TypeToken.get(IPReservationRequestInput.class));
            final TypeAdapter<VrfIpReservationCreateInput> adapterVrfIpReservationCreateInput = gson.getDelegateAdapter(this, TypeToken.get(VrfIpReservationCreateInput.class));

            return (TypeAdapter<T>) new TypeAdapter<RequestIPReservationRequest>() {
                @Override
                public void write(JsonWriter out, RequestIPReservationRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `IPReservationRequestInput`
                    if (value.getActualInstance() instanceof IPReservationRequestInput) {
                        JsonObject obj = adapterIPReservationRequestInput.toJsonTree((IPReservationRequestInput)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `VrfIpReservationCreateInput`
                    if (value.getActualInstance() instanceof VrfIpReservationCreateInput) {
                        JsonObject obj = adapterVrfIpReservationCreateInput.toJsonTree((VrfIpReservationCreateInput)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: IPReservationRequestInput, VrfIpReservationCreateInput");
                }

                @Override
                public RequestIPReservationRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize IPReservationRequestInput
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IPReservationRequestInput.validateJsonObject(jsonObject);
                        actualAdapter = adapterIPReservationRequestInput;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'IPReservationRequestInput'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IPReservationRequestInput failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IPReservationRequestInput'", e);
                    }

                    // deserialize VrfIpReservationCreateInput
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VrfIpReservationCreateInput.validateJsonObject(jsonObject);
                        actualAdapter = adapterVrfIpReservationCreateInput;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'VrfIpReservationCreateInput'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for VrfIpReservationCreateInput failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'VrfIpReservationCreateInput'", e);
                    }

                    if (match == 1) {
                        RequestIPReservationRequest ret = new RequestIPReservationRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RequestIPReservationRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public RequestIPReservationRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public RequestIPReservationRequest(IPReservationRequestInput o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RequestIPReservationRequest(VrfIpReservationCreateInput o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("IPReservationRequestInput", new GenericType<IPReservationRequestInput>() {
        });
        schemas.put("VrfIpReservationCreateInput", new GenericType<VrfIpReservationCreateInput>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RequestIPReservationRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * IPReservationRequestInput, VrfIpReservationCreateInput
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof IPReservationRequestInput) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof VrfIpReservationCreateInput) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be IPReservationRequestInput, VrfIpReservationCreateInput");
    }

    /**
     * Get the actual instance, which can be the following:
     * IPReservationRequestInput, VrfIpReservationCreateInput
     *
     * @return The actual instance (IPReservationRequestInput, VrfIpReservationCreateInput)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `IPReservationRequestInput`. If the actual instance is not `IPReservationRequestInput`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IPReservationRequestInput`
     * @throws ClassCastException if the instance is not `IPReservationRequestInput`
     */
    public IPReservationRequestInput getIPReservationRequestInput() throws ClassCastException {
        return (IPReservationRequestInput)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VrfIpReservationCreateInput`. If the actual instance is not `VrfIpReservationCreateInput`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VrfIpReservationCreateInput`
     * @throws ClassCastException if the instance is not `VrfIpReservationCreateInput`
     */
    public VrfIpReservationCreateInput getVrfIpReservationCreateInput() throws ClassCastException {
        return (VrfIpReservationCreateInput)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestIPReservationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with IPReservationRequestInput
    try {
      IPReservationRequestInput.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for IPReservationRequestInput failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with VrfIpReservationCreateInput
    try {
      VrfIpReservationCreateInput.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for VrfIpReservationCreateInput failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RequestIPReservationRequest with oneOf schemas: IPReservationRequestInput, VrfIpReservationCreateInput. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of RequestIPReservationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestIPReservationRequest
  * @throws IOException if the JSON string is invalid with respect to RequestIPReservationRequest
  */
  public static RequestIPReservationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestIPReservationRequest.class);
  }

 /**
  * Convert an instance of RequestIPReservationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

