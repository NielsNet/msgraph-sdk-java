package microsoft.graph.subscriptions;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.Subscription;
import microsoft.graph.models.SubscriptionCollectionResponse;
/** Provides operations to manage the collection of subscription entities. */
public class SubscriptionsRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new SubscriptionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public SubscriptionsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/subscriptions{?%24search,%24select}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new SubscriptionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public SubscriptionsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/subscriptions{?%24search,%24select}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Retrieve a list of webhook subscriptions.  The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Retrieve a list of webhook subscriptions.  The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<SubscriptionsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final SubscriptionsRequestBuilderGetRequestConfiguration requestConfig = new SubscriptionsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. See the table in the Permissions section for the list of resources that support subscribing to change notifications. Some resources support the option to include encrypted resource data in change notifications. These resources include chatMessage, contact, event, message, onlineMeetings and presence. For more information, see Set up change notifications that include resource data and Change notifications for Outlook resources in Microsoft Graph.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final Subscription body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. See the table in the Permissions section for the list of resources that support subscribing to change notifications. Some resources support the option to include encrypted resource data in change notifications. These resources include chatMessage, contact, event, message, onlineMeetings and presence. For more information, see Set up change notifications that include resource data and Change notifications for Outlook resources in Microsoft Graph.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final Subscription body, @javax.annotation.Nullable final java.util.function.Consumer<SubscriptionsRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final SubscriptionsRequestBuilderPostRequestConfiguration requestConfig = new SubscriptionsRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Retrieve a list of webhook subscriptions.  The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     * @return a CompletableFuture of SubscriptionCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<SubscriptionCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, SubscriptionCollectionResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Retrieve a list of webhook subscriptions.  The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of SubscriptionCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<SubscriptionCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<SubscriptionsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, SubscriptionCollectionResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Retrieve a list of webhook subscriptions.  The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of SubscriptionCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<SubscriptionCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<SubscriptionsRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, SubscriptionCollectionResponse::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. See the table in the Permissions section for the list of resources that support subscribing to change notifications. Some resources support the option to include encrypted resource data in change notifications. These resources include chatMessage, contact, event, message, onlineMeetings and presence. For more information, see Set up change notifications that include resource data and Change notifications for Outlook resources in Microsoft Graph.
     * @param body 
     * @return a CompletableFuture of subscription
     */
    public java.util.concurrent.CompletableFuture<Subscription> post(@javax.annotation.Nonnull final Subscription body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Subscription::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. See the table in the Permissions section for the list of resources that support subscribing to change notifications. Some resources support the option to include encrypted resource data in change notifications. These resources include chatMessage, contact, event, message, onlineMeetings and presence. For more information, see Set up change notifications that include resource data and Change notifications for Outlook resources in Microsoft Graph.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of subscription
     */
    public java.util.concurrent.CompletableFuture<Subscription> post(@javax.annotation.Nonnull final Subscription body, @javax.annotation.Nullable final java.util.function.Consumer<SubscriptionsRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Subscription::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Subscribes a listener application to receive change notifications when the requested type of changes occur to the specified resource in Microsoft Graph. See the table in the Permissions section for the list of resources that support subscribing to change notifications. Some resources support the option to include encrypted resource data in change notifications. These resources include chatMessage, contact, event, message, onlineMeetings and presence. For more information, see Set up change notifications that include resource data and Change notifications for Outlook resources in Microsoft Graph.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of subscription
     */
    public java.util.concurrent.CompletableFuture<Subscription> post(@javax.annotation.Nonnull final Subscription body, @javax.annotation.Nullable final java.util.function.Consumer<SubscriptionsRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Subscription::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Retrieve a list of webhook subscriptions.  The content of the response depends on the context in which the app is calling; for details, see the scenarios in the Permissions section. */
    public class SubscriptionsRequestBuilderGetQueryParameters {
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class SubscriptionsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public SubscriptionsRequestBuilderGetQueryParameters queryParameters = new SubscriptionsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new subscriptionsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public SubscriptionsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class SubscriptionsRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new subscriptionsRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public SubscriptionsRequestBuilderPostRequestConfiguration() {
        }
    }
}