

# CreateVrfRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**ipRanges** | **List&lt;String&gt;** | A list of CIDR network addresses. Like [\&quot;10.0.0.0/16\&quot;, \&quot;2001:d78::/56\&quot;]. IPv4 blocks must be between /8 and /29 in size. IPv6 blocks must be between /56 and /64. A VRF\\&#39;s IP ranges must be defined in order to create VRF IP Reservations, which can then be used for Metal Gateways or Virtual Circuits. |  [optional] |
|**localAsn** | **Integer** |  |  [optional] |
|**metro** | **String** | The UUID (or metro code) for the Metro in which to create this VRF. |  |
|**name** | **String** |  |  |
|**projectId** | **UUID** |  |  |



