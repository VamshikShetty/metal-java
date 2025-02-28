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


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.model.Error;
import com.equinix.openapi.metal.v1.model.FindIPAddressById200Response;
import com.equinix.openapi.metal.v1.model.IPAvailabilitiesList;
import com.equinix.openapi.metal.v1.model.IPReservationList;
import com.equinix.openapi.metal.v1.model.RequestIPReservation201Response;
import com.equinix.openapi.metal.v1.model.RequestIPReservationRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAddressesApi
 */
@Disabled
public class IpAddressesApiTest {

    private final IpAddressesApi api = new IpAddressesApi();

    /**
     * Unassign an ip address
     *
     * Note! This call can be used to un-assign an IP assignment or delete an IP reservation. Un-assign an IP address record. Use the assignment UUID you get after attaching the IP. This will remove the relationship between an IP and the device and will make the IP address available to be assigned to another device. Delete and IP reservation. Use the reservation UUID you get after adding the IP to the project. This will permanently delete the IP block reservation from the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteIPAddressTest() throws ApiException {
        UUID id = null;
        api.deleteIPAddress(id);
        // TODO: test validations
    }

    /**
     * Retrieve an ip address
     *
     * Returns a single ip address if the user has access.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findIPAddressByIdTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        FindIPAddressById200Response response = api.findIPAddressById(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve the custom metadata of an IP Reservation or IP Assignment
     *
     * Provides the custom metadata stored for this IP Reservation or IP Assignment in json format
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findIPAddressCustomdataTest() throws ApiException {
        UUID id = null;
        api.findIPAddressCustomdata(id);
        // TODO: test validations
    }

    /**
     * Retrieve all available subnets of a particular reservation
     *
     * Provides a list of IP resevations for a single project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findIPAvailabilitiesTest() throws ApiException {
        UUID id = null;
        String cidr = null;
        IPAvailabilitiesList response = api.findIPAvailabilities(id, cidr);
        // TODO: test validations
    }

    /**
     * Retrieve all ip reservations
     *
     * Provides a paginated list of IP reservations for a single project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findIPReservationsTest() throws ApiException {
        UUID id = null;
        List<String> types = null;
        List<String> include = null;
        List<String> exclude = null;
        IPReservationList response = api.findIPReservations(id, types, include, exclude);
        // TODO: test validations
    }

    /**
     * Requesting IP reservations
     *
     * Request more IP space for a project in order to have additional IP addresses to assign to devices.  If the request is within the max quota, an IP reservation will be created. If the project will exceed its IP quota, a request will be submitted for review, and will return an IP Reservation with a &#x60;state&#x60; of &#x60;pending&#x60;. You can automatically have the request fail with HTTP status 422 instead of triggering the review process by providing the &#x60;fail_on_approval_required&#x60; parameter set to &#x60;true&#x60; in the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestIPReservationTest() throws ApiException {
        UUID id = null;
        RequestIPReservationRequest requestIPReservationRequest = null;
        RequestIPReservation201Response response = api.requestIPReservation(id, requestIPReservationRequest);
        // TODO: test validations
    }

    /**
     * Update an ip address
     *
     * Update details about an ip address
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateIPAddressTest() throws ApiException {
        UUID id = null;
        String details = null;
        String customdata = null;
        FindIPAddressById200Response response = api.updateIPAddress(id, details, customdata);
        // TODO: test validations
    }

}
