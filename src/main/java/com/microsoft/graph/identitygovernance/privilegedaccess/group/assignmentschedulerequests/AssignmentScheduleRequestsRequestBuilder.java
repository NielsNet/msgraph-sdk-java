package com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedulerequests;

import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedulerequests.count.CountRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedulerequests.filterbycurrentuserwithon.FilterByCurrentUserWithOnRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedulerequests.item.PrivilegedAccessGroupAssignmentScheduleRequestItemRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentScheduleRequest;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse;
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
 * Provides operations to manage the assignmentScheduleRequests property of the microsoft.graph.privilegedAccessGroup entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentScheduleRequestsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignmentScheduleRequests property of the microsoft.graph.privilegedAccessGroup entity.
     * @param privilegedAccessGroupAssignmentScheduleRequestId The unique identifier of privilegedAccessGroupAssignmentScheduleRequest
     * @return a PrivilegedAccessGroupAssignmentScheduleRequestItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrivilegedAccessGroupAssignmentScheduleRequestItemRequestBuilder byPrivilegedAccessGroupAssignmentScheduleRequestId(@jakarta.annotation.Nonnull final String privilegedAccessGroupAssignmentScheduleRequestId) {
        Objects.requireNonNull(privilegedAccessGroupAssignmentScheduleRequestId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedAccessGroupAssignmentScheduleRequest%2Did", privilegedAccessGroupAssignmentScheduleRequestId);
        return new PrivilegedAccessGroupAssignmentScheduleRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AssignmentScheduleRequestsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentScheduleRequestsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentScheduleRequests{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AssignmentScheduleRequestsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignmentScheduleRequestsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentScheduleRequests{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to call the filterByCurrentUser method.
     * @param on Usage: on='{on}'
     * @return a FilterByCurrentUserWithOnRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public FilterByCurrentUserWithOnRequestBuilder filterByCurrentUserWithOn(@jakarta.annotation.Nonnull final String on) {
        Objects.requireNonNull(on);
        return new FilterByCurrentUserWithOnRequestBuilder(pathParameters, requestAdapter, on);
    }
    /**
     * Get a list of the privilegedAccessGroupAssignmentScheduleRequest objects and their properties.
     * @return a PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/privilegedaccessgroup-list-assignmentschedulerequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of the privilegedAccessGroupAssignmentScheduleRequest objects and their properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/privilegedaccessgroup-list-assignmentschedulerequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new privilegedAccessGroupAssignmentScheduleRequest object.
     * @param body The request body
     * @return a PrivilegedAccessGroupAssignmentScheduleRequest
     * @see <a href="https://learn.microsoft.com/graph/api/privilegedaccessgroup-post-assignmentschedulerequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleRequest post(@jakarta.annotation.Nonnull final PrivilegedAccessGroupAssignmentScheduleRequest body) {
        return post(body, null);
    }
    /**
     * Create a new privilegedAccessGroupAssignmentScheduleRequest object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PrivilegedAccessGroupAssignmentScheduleRequest
     * @see <a href="https://learn.microsoft.com/graph/api/privilegedaccessgroup-post-assignmentschedulerequests?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleRequest post(@jakarta.annotation.Nonnull final PrivilegedAccessGroupAssignmentScheduleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccessGroupAssignmentScheduleRequest::createFromDiscriminatorValue);
    }
    /**
     * Get a list of the privilegedAccessGroupAssignmentScheduleRequest objects and their properties.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the privilegedAccessGroupAssignmentScheduleRequest objects and their properties.
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
     * Create a new privilegedAccessGroupAssignmentScheduleRequest object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrivilegedAccessGroupAssignmentScheduleRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new privilegedAccessGroupAssignmentScheduleRequest object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrivilegedAccessGroupAssignmentScheduleRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a AssignmentScheduleRequestsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AssignmentScheduleRequestsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssignmentScheduleRequestsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of the privilegedAccessGroupAssignmentScheduleRequest objects and their properties.
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