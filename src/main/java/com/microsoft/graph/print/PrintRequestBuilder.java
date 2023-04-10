package com.microsoft.graph.print;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Print;
import com.microsoft.graph.print.connectors.ConnectorsRequestBuilder;
import com.microsoft.graph.print.connectors.item.PrintConnectorItemRequestBuilder;
import com.microsoft.graph.print.operations.item.PrintOperationItemRequestBuilder;
import com.microsoft.graph.print.operations.OperationsRequestBuilder;
import com.microsoft.graph.print.printers.item.PrinterItemRequestBuilder;
import com.microsoft.graph.print.printers.PrintersRequestBuilder;
import com.microsoft.graph.print.services.item.PrintServiceItemRequestBuilder;
import com.microsoft.graph.print.services.ServicesRequestBuilder;
import com.microsoft.graph.print.shares.item.PrinterShareItemRequestBuilder;
import com.microsoft.graph.print.shares.SharesRequestBuilder;
import com.microsoft.graph.print.taskdefinitions.item.PrintTaskDefinitionItemRequestBuilder;
import com.microsoft.graph.print.taskdefinitions.TaskDefinitionsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the print singleton.
 */
public class PrintRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the connectors property of the microsoft.graph.print entity. */
    @javax.annotation.Nonnull
    public ConnectorsRequestBuilder connectors() {
        return new ConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.print entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the printers property of the microsoft.graph.print entity. */
    @javax.annotation.Nonnull
    public PrintersRequestBuilder printers() {
        return new PrintersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the services property of the microsoft.graph.print entity. */
    @javax.annotation.Nonnull
    public ServicesRequestBuilder services() {
        return new ServicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the shares property of the microsoft.graph.print entity. */
    @javax.annotation.Nonnull
    public SharesRequestBuilder shares() {
        return new SharesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the taskDefinitions property of the microsoft.graph.print entity. */
    @javax.annotation.Nonnull
    public TaskDefinitionsRequestBuilder taskDefinitions() {
        return new TaskDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the connectors property of the microsoft.graph.print entity.
     * @param id Unique identifier of the item
     * @return a PrintConnectorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrintConnectorItemRequestBuilder connectors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printConnector%2Did", id);
        return new PrintConnectorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PrintRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PrintRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get print
     * @return a CompletableFuture of Print
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Print> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Print::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Print> executionException = new java.util.concurrent.CompletableFuture<Print>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Print
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Print> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Print::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Print> executionException = new java.util.concurrent.CompletableFuture<Print>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.print entity.
     * @param id Unique identifier of the item
     * @return a PrintOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrintOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printOperation%2Did", id);
        return new PrintOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update print
     * @param body The request body
     * @return a CompletableFuture of Print
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Print> patch(@javax.annotation.Nonnull final Print body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Print::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Print> executionException = new java.util.concurrent.CompletableFuture<Print>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update print
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Print
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Print> patch(@javax.annotation.Nonnull final Print body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Print::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Print> executionException = new java.util.concurrent.CompletableFuture<Print>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the printers property of the microsoft.graph.print entity.
     * @param id Unique identifier of the item
     * @return a PrinterItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrinterItemRequestBuilder printers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printer%2Did", id);
        return new PrinterItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the services property of the microsoft.graph.print entity.
     * @param id Unique identifier of the item
     * @return a PrintServiceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrintServiceItemRequestBuilder services(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printService%2Did", id);
        return new PrintServiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the shares property of the microsoft.graph.print entity.
     * @param id Unique identifier of the item
     * @return a PrinterShareItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrinterShareItemRequestBuilder shares(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printerShare%2Did", id);
        return new PrinterShareItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the taskDefinitions property of the microsoft.graph.print entity.
     * @param id Unique identifier of the item
     * @return a PrintTaskDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrintTaskDefinitionItemRequestBuilder taskDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("printTaskDefinition%2Did", id);
        return new PrintTaskDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get print
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update print
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Print body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update print
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Print body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get print
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}