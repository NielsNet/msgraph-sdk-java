package com.microsoft.graph.devicemanagement.mobilethreatdefenseconnectors;

import com.microsoft.graph.devicemanagement.mobilethreatdefenseconnectors.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.mobilethreatdefenseconnectors.item.MobileThreatDefenseConnectorItemRequestBuilder;
import com.microsoft.graph.models.MobileThreatDefenseConnector;
import com.microsoft.graph.models.MobileThreatDefenseConnectorCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the mobileThreatDefenseConnectors property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileThreatDefenseConnectorsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileThreatDefenseConnectors property of the microsoft.graph.deviceManagement entity.
     * @param mobileThreatDefenseConnectorId The unique identifier of mobileThreatDefenseConnector
     * @return a MobileThreatDefenseConnectorItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MobileThreatDefenseConnectorItemRequestBuilder byMobileThreatDefenseConnectorId(@jakarta.annotation.Nonnull final String mobileThreatDefenseConnectorId) {
        Objects.requireNonNull(mobileThreatDefenseConnectorId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileThreatDefenseConnector%2Did", mobileThreatDefenseConnectorId);
        return new MobileThreatDefenseConnectorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new MobileThreatDefenseConnectorsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MobileThreatDefenseConnectorsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/mobileThreatDefenseConnectors{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MobileThreatDefenseConnectorsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MobileThreatDefenseConnectorsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/mobileThreatDefenseConnectors{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * List properties and relationships of the mobileThreatDefenseConnector objects.
     * @return a MobileThreatDefenseConnectorCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/intune-onboarding-mobilethreatdefenseconnector-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileThreatDefenseConnectorCollectionResponse get() {
        return get(null);
    }
    /**
     * List properties and relationships of the mobileThreatDefenseConnector objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a MobileThreatDefenseConnectorCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/intune-onboarding-mobilethreatdefenseconnector-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileThreatDefenseConnectorCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MobileThreatDefenseConnectorCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new mobileThreatDefenseConnector object.
     * @param body The request body
     * @return a MobileThreatDefenseConnector
     * @see <a href="https://learn.microsoft.com/graph/api/intune-onboarding-mobilethreatdefenseconnector-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileThreatDefenseConnector post(@jakarta.annotation.Nonnull final MobileThreatDefenseConnector body) {
        return post(body, null);
    }
    /**
     * Create a new mobileThreatDefenseConnector object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a MobileThreatDefenseConnector
     * @see <a href="https://learn.microsoft.com/graph/api/intune-onboarding-mobilethreatdefenseconnector-create?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MobileThreatDefenseConnector post(@jakarta.annotation.Nonnull final MobileThreatDefenseConnector body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MobileThreatDefenseConnector::createFromDiscriminatorValue);
    }
    /**
     * List properties and relationships of the mobileThreatDefenseConnector objects.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List properties and relationships of the mobileThreatDefenseConnector objects.
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
     * Create a new mobileThreatDefenseConnector object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MobileThreatDefenseConnector body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new mobileThreatDefenseConnector object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MobileThreatDefenseConnector body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MobileThreatDefenseConnectorsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MobileThreatDefenseConnectorsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MobileThreatDefenseConnectorsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List properties and relationships of the mobileThreatDefenseConnector objects.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}