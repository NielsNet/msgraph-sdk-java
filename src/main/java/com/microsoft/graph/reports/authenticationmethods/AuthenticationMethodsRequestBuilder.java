package com.microsoft.graph.reports.authenticationmethods;

import com.microsoft.graph.models.AuthenticationMethodsRoot;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.reports.authenticationmethods.userregistrationdetails.UserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.reports.authenticationmethods.usersregisteredbyfeature.UsersRegisteredByFeatureRequestBuilder;
import com.microsoft.graph.reports.authenticationmethods.usersregisteredbyfeaturewithincludedusertypeswithincludeduserroles.UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder;
import com.microsoft.graph.reports.authenticationmethods.usersregisteredbymethod.UsersRegisteredByMethodRequestBuilder;
import com.microsoft.graph.reports.authenticationmethods.usersregisteredbymethodwithincludedusertypeswithincludeduserroles.UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the authenticationMethods property of the microsoft.graph.reportRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the userRegistrationDetails property of the microsoft.graph.authenticationMethodsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public UserRegistrationDetailsRequestBuilder userRegistrationDetails() {
        return new UserRegistrationDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usersRegisteredByFeature method.
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByFeatureRequestBuilder usersRegisteredByFeature() {
        return new UsersRegisteredByFeatureRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usersRegisteredByMethod method.
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByMethodRequestBuilder usersRegisteredByMethod() {
        return new UsersRegisteredByMethodRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AuthenticationMethodsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/authenticationMethods{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AuthenticationMethodsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/authenticationMethods{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property authenticationMethods for reports
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property authenticationMethods for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @return a CompletableFuture of authenticationMethodsRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsRoot> get() {
        return get(null);
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authenticationMethodsRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsRoot> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AuthenticationMethodsRoot::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property authenticationMethods in reports
     * @param body The request body
     * @return a CompletableFuture of authenticationMethodsRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsRoot> patch(@jakarta.annotation.Nonnull final AuthenticationMethodsRoot body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property authenticationMethods in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authenticationMethodsRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodsRoot> patch(@jakarta.annotation.Nonnull final AuthenticationMethodsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AuthenticationMethodsRoot::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property authenticationMethods for reports
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property authenticationMethods for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property authenticationMethods in reports
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AuthenticationMethodsRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property authenticationMethods in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AuthenticationMethodsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to call the usersRegisteredByFeature method.
     * @param includedUserRoles Usage: includedUserRoles='{includedUserRoles}'
     * @param includedUserTypes Usage: includedUserTypes='{includedUserTypes}'
     * @return a usersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder usersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRoles(@jakarta.annotation.Nonnull final String includedUserRoles, @jakarta.annotation.Nonnull final String includedUserTypes) {
        Objects.requireNonNull(includedUserRoles);
        Objects.requireNonNull(includedUserTypes);
        return new UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(pathParameters, requestAdapter, includedUserRoles, includedUserTypes);
    }
    /**
     * Provides operations to call the usersRegisteredByMethod method.
     * @param includedUserRoles Usage: includedUserRoles='{includedUserRoles}'
     * @param includedUserTypes Usage: includedUserTypes='{includedUserTypes}'
     * @return a usersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder usersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRoles(@jakarta.annotation.Nonnull final String includedUserRoles, @jakarta.annotation.Nonnull final String includedUserTypes) {
        Objects.requireNonNull(includedUserRoles);
        Objects.requireNonNull(includedUserTypes);
        return new UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(pathParameters, requestAdapter, includedUserRoles, includedUserTypes);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a authenticationMethodsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AuthenticationMethodsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}