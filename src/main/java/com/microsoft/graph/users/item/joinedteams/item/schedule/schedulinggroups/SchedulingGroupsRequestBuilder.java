package com.microsoft.graph.users.item.joinedteams.item.schedule.schedulinggroups;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SchedulingGroup;
import com.microsoft.graph.models.SchedulingGroupCollectionResponse;
import com.microsoft.graph.users.item.joinedteams.item.schedule.schedulinggroups.count.CountRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.schedule.schedulinggroups.item.SchedulingGroupItemRequestBuilder;
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
 * Provides operations to manage the schedulingGroups property of the microsoft.graph.schedule entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SchedulingGroupsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the schedulingGroups property of the microsoft.graph.schedule entity.
     * @param schedulingGroupId The unique identifier of schedulingGroup
     * @return a SchedulingGroupItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SchedulingGroupItemRequestBuilder bySchedulingGroupId(@jakarta.annotation.Nonnull final String schedulingGroupId) {
        Objects.requireNonNull(schedulingGroupId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schedulingGroup%2Did", schedulingGroupId);
        return new SchedulingGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SchedulingGroupsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchedulingGroupsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/joinedTeams/{team%2Did}/schedule/schedulingGroups{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select}", pathParameters);
    }
    /**
     * Instantiates a new SchedulingGroupsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchedulingGroupsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/joinedTeams/{team%2Did}/schedule/schedulingGroups{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select}", rawUrl);
    }
    /**
     * Get the list of schedulingGroups in this schedule.
     * @return a SchedulingGroupCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/schedule-list-schedulinggroups?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SchedulingGroupCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the list of schedulingGroups in this schedule.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SchedulingGroupCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/schedule-list-schedulinggroups?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SchedulingGroupCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SchedulingGroupCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new schedulingGroup.
     * @param body The request body
     * @return a SchedulingGroup
     * @see <a href="https://learn.microsoft.com/graph/api/schedule-post-schedulinggroups?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SchedulingGroup post(@jakarta.annotation.Nonnull final SchedulingGroup body) {
        return post(body, null);
    }
    /**
     * Create a new schedulingGroup.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SchedulingGroup
     * @see <a href="https://learn.microsoft.com/graph/api/schedule-post-schedulinggroups?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SchedulingGroup post(@jakarta.annotation.Nonnull final SchedulingGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SchedulingGroup::createFromDiscriminatorValue);
    }
    /**
     * Get the list of schedulingGroups in this schedule.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the list of schedulingGroups in this schedule.
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
     * Create a new schedulingGroup.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SchedulingGroup body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new schedulingGroup.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SchedulingGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a SchedulingGroupsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SchedulingGroupsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SchedulingGroupsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the list of schedulingGroups in this schedule.
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