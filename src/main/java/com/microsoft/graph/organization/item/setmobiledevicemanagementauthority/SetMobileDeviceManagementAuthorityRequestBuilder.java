package com.microsoft.graph.organization.item.setmobiledevicemanagementauthority;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the setMobileDeviceManagementAuthority method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetMobileDeviceManagementAuthorityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new SetMobileDeviceManagementAuthorityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SetMobileDeviceManagementAuthorityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}/setMobileDeviceManagementAuthority", pathParameters);
    }
    /**
     * Instantiates a new SetMobileDeviceManagementAuthorityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SetMobileDeviceManagementAuthorityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organization/{organization%2Did}/setMobileDeviceManagementAuthority", rawUrl);
    }
    /**
     * Set mobile device management authority
     * @return a SetMobileDeviceManagementAuthorityPostResponse
     * @see <a href="https://learn.microsoft.com/graph/api/intune-onboarding-organization-setmobiledevicemanagementauthority?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SetMobileDeviceManagementAuthorityPostResponse post() {
        return post(null);
    }
    /**
     * Set mobile device management authority
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SetMobileDeviceManagementAuthorityPostResponse
     * @see <a href="https://learn.microsoft.com/graph/api/intune-onboarding-organization-setmobiledevicemanagementauthority?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SetMobileDeviceManagementAuthorityPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, SetMobileDeviceManagementAuthorityPostResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Set mobile device management authority
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Set mobile device management authority
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SetMobileDeviceManagementAuthorityRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SetMobileDeviceManagementAuthorityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SetMobileDeviceManagementAuthorityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
