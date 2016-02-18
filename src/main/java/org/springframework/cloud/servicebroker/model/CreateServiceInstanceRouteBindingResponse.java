package org.springframework.cloud.servicebroker.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Details of a response to a request to create a new service instance binding for a route.
 * 
 * @author Scott Frederick
 */
@Getter
@ToString
@EqualsAndHashCode
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateServiceInstanceRouteBindingResponse implements CreateServiceInstanceBindingResponse {

	/**
	 * A URL to which Cloud Foundry should proxy requests for the bound route. Can be <code>null</code>.
	 */
	@JsonSerialize
	@JsonProperty("route_service_url")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private final String routeServiceUrl;

	public CreateServiceInstanceRouteBindingResponse() {
		this.routeServiceUrl = null;
	}

	public CreateServiceInstanceRouteBindingResponse(String routeServiceUrl) {
		this.routeServiceUrl = routeServiceUrl;
	}
}