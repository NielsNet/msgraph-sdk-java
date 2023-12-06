package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.item;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.item.createdby.CreatedByRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.item.lastmodifiedby.LastModifiedByRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.item.tasks.TasksRequestBuilder;
import com.microsoft.graph.models.identitygovernance.WorkflowVersion;
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
 * Provides operations to manage the versions property of the microsoft.graph.identityGovernance.workflow entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkflowVersionVersionNumberItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the createdBy property of the microsoft.graph.identityGovernance.workflowBase entity.
     */
    @jakarta.annotation.Nonnull
    public CreatedByRequestBuilder createdBy() {
        return new CreatedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedBy property of the microsoft.graph.identityGovernance.workflowBase entity.
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByRequestBuilder lastModifiedBy() {
        return new LastModifiedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tasks property of the microsoft.graph.identityGovernance.workflowBase entity.
     */
    @jakarta.annotation.Nonnull
    public TasksRequestBuilder tasks() {
        return new TasksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WorkflowVersionVersionNumberItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkflowVersionVersionNumberItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/versions/{workflowVersion%2DversionNumber}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WorkflowVersionVersionNumberItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkflowVersionVersionNumberItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/versions/{workflowVersion%2DversionNumber}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Read the properties and relationships of a workflowVersion object.
     * @return a WorkflowVersion
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflowversion-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkflowVersion get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a workflowVersion object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WorkflowVersion
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflowversion-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkflowVersion get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkflowVersion::createFromDiscriminatorValue);
    }
    /**
     * Read the properties and relationships of a workflowVersion object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a workflowVersion object.
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
     * @return a WorkflowVersionVersionNumberItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WorkflowVersionVersionNumberItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WorkflowVersionVersionNumberItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read the properties and relationships of a workflowVersion object.
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