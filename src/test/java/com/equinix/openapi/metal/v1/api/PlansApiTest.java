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

import com.equinix.openapi.metal.v1.model.InlineResponse20029;
import com.equinix.openapi.metal.v1.model.InlineResponse401;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlansApi
 */
@Ignore
public class PlansApiTest {

    private final PlansApi api = new PlansApi();

    
    /**
     * Retrieve all plans
     *
     * Provides a listing of available plans to provision your device on.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPlansTest() throws Exception {
        List<String> include = null;
        List<String> exclude = null;
        InlineResponse20029 response = api.findPlans(include, exclude);

        // TODO: test validations
    }
    
    /**
     * Retrieve all plans visible by the project
     *
     * Returns a listing of available plans for the given project
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPlansByProjectTest() throws Exception {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        InlineResponse20029 response = api.findPlansByProject(id, include, exclude);

        // TODO: test validations
    }
    
}
