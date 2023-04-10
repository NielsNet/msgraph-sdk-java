package com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoveryReviewSet;
import com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.queries.item.EdiscoveryReviewSetQueryItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.queries.QueriesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.securityaddtoreviewset.SecurityAddToReviewSetRequestBuilder;
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
 * Provides operations to manage the reviewSets property of the microsoft.graph.security.ediscoveryCase entity.
 */
public class EdiscoveryReviewSetItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the queries property of the microsoft.graph.security.ediscoveryReviewSet entity. */
    @javax.annotation.Nonnull
    public QueriesRequestBuilder queries() {
        return new QueriesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the addToReviewSet method. */
    @javax.annotation.Nonnull
    public SecurityAddToReviewSetRequestBuilder securityAddToReviewSet() {
        return new SecurityAddToReviewSetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EdiscoveryReviewSetItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSetItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/reviewSets/{ediscoveryReviewSet%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EdiscoveryReviewSetItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSetItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/reviewSets/{ediscoveryReviewSet%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property reviewSets for security
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property reviewSets for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of eDiscoveryReviewSet objects in the case.
     * @return a CompletableFuture of ediscoveryReviewSet
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryReviewSet> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryReviewSet::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryReviewSet> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryReviewSet>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Returns a list of eDiscoveryReviewSet objects in the case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryReviewSet
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryReviewSet> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryReviewSet::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryReviewSet> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryReviewSet>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property reviewSets in security
     * @param body The request body
     * @return a CompletableFuture of ediscoveryReviewSet
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryReviewSet> patch(@javax.annotation.Nonnull final EdiscoveryReviewSet body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryReviewSet::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryReviewSet> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryReviewSet>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property reviewSets in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryReviewSet
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryReviewSet> patch(@javax.annotation.Nonnull final EdiscoveryReviewSet body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryReviewSet::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryReviewSet> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryReviewSet>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the queries property of the microsoft.graph.security.ediscoveryReviewSet entity.
     * @param id Unique identifier of the item
     * @return a EdiscoveryReviewSetQueryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EdiscoveryReviewSetQueryItemRequestBuilder queries(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryReviewSetQuery%2Did", id);
        return new EdiscoveryReviewSetQueryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property reviewSets for security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reviewSets for security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Returns a list of eDiscoveryReviewSet objects in the case.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of eDiscoveryReviewSet objects in the case.
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
     * Update the navigation property reviewSets in security
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final EdiscoveryReviewSet body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property reviewSets in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final EdiscoveryReviewSet body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Returns a list of eDiscoveryReviewSet objects in the case.
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