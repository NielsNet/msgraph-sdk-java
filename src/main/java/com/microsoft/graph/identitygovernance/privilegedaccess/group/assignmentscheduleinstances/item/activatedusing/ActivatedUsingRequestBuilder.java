package com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentscheduleinstances.item.activatedusing;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrivilegedAccessGroupEligibilityScheduleInstance;
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
 * Provides operations to manage the activatedUsing property of the microsoft.graph.privilegedAccessGroupAssignmentScheduleInstance entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivatedUsingRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ActivatedUsingRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActivatedUsingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentScheduleInstances/{privilegedAccessGroupAssignmentScheduleInstance%2Did}/activatedUsing{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ActivatedUsingRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActivatedUsingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentScheduleInstances/{privilegedAccessGroupAssignmentScheduleInstance%2Did}/activatedUsing{?%24select,%24expand}", rawUrl);
    }
    /**
     * When the request activates a membership or ownership in PIM for groups, this object represents the eligibility request for the group. Otherwise, it is null.
     * @return a PrivilegedAccessGroupEligibilityScheduleInstance
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance get() {
        return get(null);
    }
    /**
     * When the request activates a membership or ownership in PIM for groups, this object represents the eligibility request for the group. Otherwise, it is null.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PrivilegedAccessGroupEligibilityScheduleInstance
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccessGroupEligibilityScheduleInstance::createFromDiscriminatorValue);
    }
    /**
     * When the request activates a membership or ownership in PIM for groups, this object represents the eligibility request for the group. Otherwise, it is null.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * When the request activates a membership or ownership in PIM for groups, this object represents the eligibility request for the group. Otherwise, it is null.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ActivatedUsingRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ActivatedUsingRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ActivatedUsingRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * When the request activates a membership or ownership in PIM for groups, this object represents the eligibility request for the group. Otherwise, it is null.
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
}