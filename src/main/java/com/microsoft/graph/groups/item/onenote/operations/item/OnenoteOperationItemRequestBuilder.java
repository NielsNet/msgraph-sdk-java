package com.microsoft.graph.groups.item.onenote.operations.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OnenoteOperation;
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
 * Provides operations to manage the operations property of the microsoft.graph.onenote entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnenoteOperationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new OnenoteOperationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnenoteOperationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/onenote/operations/{onenoteOperation%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OnenoteOperationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnenoteOperationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/onenote/operations/{onenoteOperation%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property operations for groups
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property operations for groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get the status of a long-running OneNote operation. This applies to operations that return the Operation-Location header in the response, such as CopyNotebook, CopyToNotebook, CopyToSectionGroup, and CopyToSection.    You can poll the Operation-Location endpoint until the status property returns completed or failed.  If the status is completed, the resourceLocation property contains the resource endpoint URI.  If the status is failed, the error and @api.diagnostics properties provide error information.
     * @return a OnenoteOperation
     * @see <a href="https://learn.microsoft.com/graph/api/onenoteoperation-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OnenoteOperation get() {
        return get(null);
    }
    /**
     * Get the status of a long-running OneNote operation. This applies to operations that return the Operation-Location header in the response, such as CopyNotebook, CopyToNotebook, CopyToSectionGroup, and CopyToSection.    You can poll the Operation-Location endpoint until the status property returns completed or failed.  If the status is completed, the resourceLocation property contains the resource endpoint URI.  If the status is failed, the error and @api.diagnostics properties provide error information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OnenoteOperation
     * @see <a href="https://learn.microsoft.com/graph/api/onenoteoperation-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OnenoteOperation get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnenoteOperation::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property operations in groups
     * @param body The request body
     * @return a OnenoteOperation
     */
    @jakarta.annotation.Nullable
    public OnenoteOperation patch(@jakarta.annotation.Nonnull final OnenoteOperation body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property operations in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OnenoteOperation
     */
    @jakarta.annotation.Nullable
    public OnenoteOperation patch(@jakarta.annotation.Nonnull final OnenoteOperation body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnenoteOperation::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property operations for groups
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property operations for groups
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get the status of a long-running OneNote operation. This applies to operations that return the Operation-Location header in the response, such as CopyNotebook, CopyToNotebook, CopyToSectionGroup, and CopyToSection.    You can poll the Operation-Location endpoint until the status property returns completed or failed.  If the status is completed, the resourceLocation property contains the resource endpoint URI.  If the status is failed, the error and @api.diagnostics properties provide error information.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the status of a long-running OneNote operation. This applies to operations that return the Operation-Location header in the response, such as CopyNotebook, CopyToNotebook, CopyToSectionGroup, and CopyToSection.    You can poll the Operation-Location endpoint until the status property returns completed or failed.  If the status is completed, the resourceLocation property contains the resource endpoint URI.  If the status is failed, the error and @api.diagnostics properties provide error information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property operations in groups
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnenoteOperation body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property operations in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnenoteOperation body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a OnenoteOperationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OnenoteOperationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OnenoteOperationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the status of a long-running OneNote operation. This applies to operations that return the Operation-Location header in the response, such as CopyNotebook, CopyToNotebook, CopyToSectionGroup, and CopyToSection.    You can poll the Operation-Location endpoint until the status property returns completed or failed.  If the status is completed, the resourceLocation property contains the resource endpoint URI.  If the status is failed, the error and @api.diagnostics properties provide error information.
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