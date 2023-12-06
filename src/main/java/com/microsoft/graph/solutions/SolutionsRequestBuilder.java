package com.microsoft.graph.solutions;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SolutionsRoot;
import com.microsoft.graph.solutions.bookingbusinesses.BookingBusinessesRequestBuilder;
import com.microsoft.graph.solutions.bookingcurrencies.BookingCurrenciesRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.VirtualEventsRequestBuilder;
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
 * Provides operations to manage the solutionsRoot singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SolutionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the bookingBusinesses property of the microsoft.graph.solutionsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public BookingBusinessesRequestBuilder bookingBusinesses() {
        return new BookingBusinessesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the bookingCurrencies property of the microsoft.graph.solutionsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public BookingCurrenciesRequestBuilder bookingCurrencies() {
        return new BookingCurrenciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the virtualEvents property of the microsoft.graph.solutionsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public VirtualEventsRequestBuilder virtualEvents() {
        return new VirtualEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SolutionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SolutionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SolutionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SolutionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get solutions
     * @return a SolutionsRoot
     */
    @jakarta.annotation.Nullable
    public SolutionsRoot get() {
        return get(null);
    }
    /**
     * Get solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SolutionsRoot
     */
    @jakarta.annotation.Nullable
    public SolutionsRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SolutionsRoot::createFromDiscriminatorValue);
    }
    /**
     * Update solutions
     * @param body The request body
     * @return a SolutionsRoot
     */
    @jakarta.annotation.Nullable
    public SolutionsRoot patch(@jakarta.annotation.Nonnull final SolutionsRoot body) {
        return patch(body, null);
    }
    /**
     * Update solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SolutionsRoot
     */
    @jakarta.annotation.Nullable
    public SolutionsRoot patch(@jakarta.annotation.Nonnull final SolutionsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SolutionsRoot::createFromDiscriminatorValue);
    }
    /**
     * Get solutions
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get solutions
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
     * Update solutions
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SolutionsRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SolutionsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a SolutionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SolutionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SolutionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get solutions
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