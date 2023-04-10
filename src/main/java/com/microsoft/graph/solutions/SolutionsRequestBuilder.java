package com.microsoft.graph.solutions;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SolutionsRoot;
import com.microsoft.graph.solutions.bookingbusinesses.BookingBusinessesRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.BookingBusinessItemRequestBuilder;
import com.microsoft.graph.solutions.bookingcurrencies.BookingCurrenciesRequestBuilder;
import com.microsoft.graph.solutions.bookingcurrencies.item.BookingCurrencyItemRequestBuilder;
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
 * Provides operations to manage the solutionsRoot singleton.
 */
public class SolutionsRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the bookingBusinesses property of the microsoft.graph.solutionsRoot entity. */
    @javax.annotation.Nonnull
    public BookingBusinessesRequestBuilder bookingBusinesses() {
        return new BookingBusinessesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the bookingCurrencies property of the microsoft.graph.solutionsRoot entity. */
    @javax.annotation.Nonnull
    public BookingCurrenciesRequestBuilder bookingCurrencies() {
        return new BookingCurrenciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the bookingBusinesses property of the microsoft.graph.solutionsRoot entity.
     * @param id Unique identifier of the item
     * @return a BookingBusinessItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BookingBusinessItemRequestBuilder bookingBusinesses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingBusiness%2Did", id);
        return new BookingBusinessItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the bookingCurrencies property of the microsoft.graph.solutionsRoot entity.
     * @param id Unique identifier of the item
     * @return a BookingCurrencyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BookingCurrencyItemRequestBuilder bookingCurrencies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingCurrency%2Did", id);
        return new BookingCurrencyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SolutionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SolutionsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SolutionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SolutionsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get solutions
     * @return a CompletableFuture of SolutionsRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SolutionsRoot> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SolutionsRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SolutionsRoot> executionException = new java.util.concurrent.CompletableFuture<SolutionsRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of SolutionsRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SolutionsRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SolutionsRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SolutionsRoot> executionException = new java.util.concurrent.CompletableFuture<SolutionsRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update solutions
     * @param body The request body
     * @return a CompletableFuture of SolutionsRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SolutionsRoot> patch(@javax.annotation.Nonnull final SolutionsRoot body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SolutionsRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SolutionsRoot> executionException = new java.util.concurrent.CompletableFuture<SolutionsRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of SolutionsRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SolutionsRoot> patch(@javax.annotation.Nonnull final SolutionsRoot body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, SolutionsRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<SolutionsRoot> executionException = new java.util.concurrent.CompletableFuture<SolutionsRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get solutions
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get solutions
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
     * Update solutions
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final SolutionsRoot body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final SolutionsRoot body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get solutions
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