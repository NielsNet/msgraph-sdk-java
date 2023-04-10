package com.microsoft.graph.security.cases.ediscoverycases.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.EdiscoveryCase;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.CustodiansRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.custodians.item.EdiscoveryCustodianItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.item.EdiscoveryNoncustodialDataSourceItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.noncustodialdatasources.NoncustodialDataSourcesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.operations.item.CaseOperationItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.EdiscoveryReviewSetItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.ReviewSetsRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.EdiscoverySearchItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.searches.SearchesRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.securityclose.SecurityCloseRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.securityreopen.SecurityReopenRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.tags.item.EdiscoveryReviewTagItemRequestBuilder;
import com.microsoft.graph.security.cases.ediscoverycases.item.tags.TagsRequestBuilder;
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
 * Provides operations to manage the ediscoveryCases property of the microsoft.graph.security.casesRoot entity.
 */
public class EdiscoveryCaseItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the custodians property of the microsoft.graph.security.ediscoveryCase entity. */
    @javax.annotation.Nonnull
    public CustodiansRequestBuilder custodians() {
        return new CustodiansRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the noncustodialDataSources property of the microsoft.graph.security.ediscoveryCase entity. */
    @javax.annotation.Nonnull
    public NoncustodialDataSourcesRequestBuilder noncustodialDataSources() {
        return new NoncustodialDataSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.security.ediscoveryCase entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the reviewSets property of the microsoft.graph.security.ediscoveryCase entity. */
    @javax.annotation.Nonnull
    public ReviewSetsRequestBuilder reviewSets() {
        return new ReviewSetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the searches property of the microsoft.graph.security.ediscoveryCase entity. */
    @javax.annotation.Nonnull
    public SearchesRequestBuilder searches() {
        return new SearchesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the close method. */
    @javax.annotation.Nonnull
    public SecurityCloseRequestBuilder securityClose() {
        return new SecurityCloseRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the reopen method. */
    @javax.annotation.Nonnull
    public SecurityReopenRequestBuilder securityReopen() {
        return new SecurityReopenRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the settings property of the microsoft.graph.security.ediscoveryCase entity. */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tags property of the microsoft.graph.security.ediscoveryCase entity. */
    @javax.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EdiscoveryCaseItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryCaseItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EdiscoveryCaseItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryCaseItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to manage the custodians property of the microsoft.graph.security.ediscoveryCase entity.
     * @param id Unique identifier of the item
     * @return a EdiscoveryCustodianItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EdiscoveryCustodianItemRequestBuilder custodians(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryCustodian%2Did", id);
        return new EdiscoveryCustodianItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property ediscoveryCases for security
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
     * Delete navigation property ediscoveryCases for security
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
     * Get ediscoveryCases from security
     * @return a CompletableFuture of ediscoveryCase
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCase> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCase::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryCase> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryCase>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get ediscoveryCases from security
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryCase
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCase> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCase::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryCase> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryCase>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the noncustodialDataSources property of the microsoft.graph.security.ediscoveryCase entity.
     * @param id Unique identifier of the item
     * @return a EdiscoveryNoncustodialDataSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EdiscoveryNoncustodialDataSourceItemRequestBuilder noncustodialDataSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryNoncustodialDataSource%2Did", id);
        return new EdiscoveryNoncustodialDataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.security.ediscoveryCase entity.
     * @param id Unique identifier of the item
     * @return a CaseOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CaseOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("caseOperation%2Did", id);
        return new CaseOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property ediscoveryCases in security
     * @param body The request body
     * @return a CompletableFuture of ediscoveryCase
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCase> patch(@javax.annotation.Nonnull final EdiscoveryCase body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCase::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryCase> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryCase>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property ediscoveryCases in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ediscoveryCase
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryCase> patch(@javax.annotation.Nonnull final EdiscoveryCase body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EdiscoveryCase::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EdiscoveryCase> executionException = new java.util.concurrent.CompletableFuture<EdiscoveryCase>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the reviewSets property of the microsoft.graph.security.ediscoveryCase entity.
     * @param id Unique identifier of the item
     * @return a EdiscoveryReviewSetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EdiscoveryReviewSetItemRequestBuilder reviewSets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryReviewSet%2Did", id);
        return new EdiscoveryReviewSetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the searches property of the microsoft.graph.security.ediscoveryCase entity.
     * @param id Unique identifier of the item
     * @return a EdiscoverySearchItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EdiscoverySearchItemRequestBuilder searches(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoverySearch%2Did", id);
        return new EdiscoverySearchItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tags property of the microsoft.graph.security.ediscoveryCase entity.
     * @param id Unique identifier of the item
     * @return a EdiscoveryReviewTagItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EdiscoveryReviewTagItemRequestBuilder tags(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryReviewTag%2Did", id);
        return new EdiscoveryReviewTagItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property ediscoveryCases for security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property ediscoveryCases for security
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
     * Get ediscoveryCases from security
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get ediscoveryCases from security
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
     * Update the navigation property ediscoveryCases in security
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final EdiscoveryCase body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property ediscoveryCases in security
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final EdiscoveryCase body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get ediscoveryCases from security
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