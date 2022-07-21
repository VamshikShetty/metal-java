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


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.metal.v1.model.Body30;
import com.equinix.openapi.metal.v1.model.Body37;
import com.equinix.openapi.metal.v1.model.Body38;
import com.equinix.openapi.metal.v1.model.InlineResponse20014;
import com.equinix.openapi.metal.v1.model.InlineResponse20014SshKeys;
import com.equinix.openapi.metal.v1.model.InlineResponse401;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SshKeysApi
 */
@Ignore
public class SshKeysApiTest {

    private final SshKeysApi api = new SshKeysApi();

    
    /**
     * Create a ssh key for the given project
     *
     * Creates a ssh key.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createProjectSSHKeyTest() throws Exception {
        UUID id = null;
        Body30 body = null;
        InlineResponse20014SshKeys response = api.createProjectSSHKey(id, body);

        // TODO: test validations
    }
    
    /**
     * Create a ssh key for the current user
     *
     * Creates a ssh key.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSSHKeyTest() throws Exception {
        Body37 body = null;
        InlineResponse20014SshKeys response = api.createSSHKey(body);

        // TODO: test validations
    }
    
    /**
     * Delete the ssh key
     *
     * Deletes the ssh key.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteSSHKeyTest() throws Exception {
        UUID id = null;
        api.deleteSSHKey(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve a device&#39;s ssh keys
     *
     * Returns a collection of the device&#39;s ssh keys.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findDeviceSSHKeysTest() throws Exception {
        UUID id = null;
        String searchString = null;
        List<String> include = null;
        List<String> exclude = null;
        InlineResponse20014 response = api.findDeviceSSHKeys(id, searchString, include, exclude);

        // TODO: test validations
    }
    
    /**
     * Retrieve a project&#39;s ssh keys
     *
     * Returns a collection of the project&#39;s ssh keys.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findProjectSSHKeysTest() throws Exception {
        UUID id = null;
        String searchString = null;
        List<String> include = null;
        List<String> exclude = null;
        InlineResponse20014 response = api.findProjectSSHKeys(id, searchString, include, exclude);

        // TODO: test validations
    }
    
    /**
     * Retrieve a ssh key
     *
     * Returns a single ssh key if the user has access
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findSSHKeyByIdTest() throws Exception {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        InlineResponse20014SshKeys response = api.findSSHKeyById(id, include, exclude);

        // TODO: test validations
    }
    
    /**
     * Retrieve all ssh keys
     *
     * Returns a collection of the user’s ssh keys.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findSSHKeysTest() throws Exception {
        String searchString = null;
        List<String> include = null;
        List<String> exclude = null;
        InlineResponse20014 response = api.findSSHKeys(searchString, include, exclude);

        // TODO: test validations
    }
    
    /**
     * Update the ssh key
     *
     * Updates the ssh key.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateSSHKeyTest() throws Exception {
        UUID id = null;
        Body38 body = null;
        InlineResponse20014SshKeys response = api.updateSSHKey(id, body);

        // TODO: test validations
    }
    
}
