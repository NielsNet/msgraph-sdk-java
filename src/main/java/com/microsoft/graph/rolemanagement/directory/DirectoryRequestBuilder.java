package microsoft.graph.rolemanagement.directory;

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
import microsoft.graph.models.RbacApplication;
import microsoft.graph.rolemanagement.directory.roleassignments.item.UnifiedRoleAssignmentItemRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleassignments.RoleAssignmentsRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleassignmentscheduleinstances.item.UnifiedRoleAssignmentScheduleInstanceItemRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleassignmentscheduleinstances.RoleAssignmentScheduleInstancesRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleassignmentschedulerequests.item.UnifiedRoleAssignmentScheduleRequestItemRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleassignmentschedulerequests.RoleAssignmentScheduleRequestsRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleassignmentschedules.item.UnifiedRoleAssignmentScheduleItemRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleassignmentschedules.RoleAssignmentSchedulesRequestBuilder;
import microsoft.graph.rolemanagement.directory.roledefinitions.item.UnifiedRoleDefinitionItemRequestBuilder;
import microsoft.graph.rolemanagement.directory.roledefinitions.RoleDefinitionsRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleeligibilityscheduleinstances.item.UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleeligibilityscheduleinstances.RoleEligibilityScheduleInstancesRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.item.UnifiedRoleEligibilityScheduleRequestItemRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleeligibilityschedulerequests.RoleEligibilityScheduleRequestsRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleeligibilityschedules.item.UnifiedRoleEligibilityScheduleItemRequestBuilder;
import microsoft.graph.rolemanagement.directory.roleeligibilityschedules.RoleEligibilitySchedulesRequestBuilder;
/** Provides operations to manage the directory property of the microsoft.graph.roleManagement entity. */
public class DirectoryRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The roleAssignments property */
    @javax.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignmentScheduleInstances property */
    @javax.annotation.Nonnull
    public RoleAssignmentScheduleInstancesRequestBuilder roleAssignmentScheduleInstances() {
        return new RoleAssignmentScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignmentScheduleRequests property */
    @javax.annotation.Nonnull
    public RoleAssignmentScheduleRequestsRequestBuilder roleAssignmentScheduleRequests() {
        return new RoleAssignmentScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignmentSchedules property */
    @javax.annotation.Nonnull
    public RoleAssignmentSchedulesRequestBuilder roleAssignmentSchedules() {
        return new RoleAssignmentSchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleDefinitions property */
    @javax.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleEligibilityScheduleInstances property */
    @javax.annotation.Nonnull
    public RoleEligibilityScheduleInstancesRequestBuilder roleEligibilityScheduleInstances() {
        return new RoleEligibilityScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleEligibilityScheduleRequests property */
    @javax.annotation.Nonnull
    public RoleEligibilityScheduleRequestsRequestBuilder roleEligibilityScheduleRequests() {
        return new RoleEligibilityScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleEligibilitySchedules property */
    @javax.annotation.Nonnull
    public RoleEligibilitySchedulesRequestBuilder roleEligibilitySchedules() {
        return new RoleEligibilitySchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DirectoryRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/roleManagement/directory{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DirectoryRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/roleManagement/directory{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property directory for roleManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property directory for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DirectoryRequestBuilderDeleteRequestConfiguration requestConfig = new DirectoryRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Read-only. Nullable.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DirectoryRequestBuilderGetRequestConfiguration requestConfig = new DirectoryRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property directory in roleManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final RbacApplication body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property directory in roleManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final RbacApplication body, @javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DirectoryRequestBuilderPatchRequestConfiguration requestConfig = new DirectoryRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property directory for roleManagement
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property directory for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property directory for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Read-only. Nullable.
     * @return a CompletableFuture of rbacApplication
     */
    public java.util.concurrent.CompletableFuture<RbacApplication> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RbacApplication::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of rbacApplication
     */
    public java.util.concurrent.CompletableFuture<RbacApplication> get(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RbacApplication::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of rbacApplication
     */
    public java.util.concurrent.CompletableFuture<RbacApplication> get(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RbacApplication::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property directory in roleManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final RbacApplication body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property directory in roleManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final RbacApplication body, @javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property directory in roleManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final RbacApplication body, @javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.directory.roleAssignments.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleAssignmentItemRequestBuilder roleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignment%2Did", id);
        return new UnifiedRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.directory.roleAssignmentScheduleInstances.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentScheduleInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleAssignmentScheduleInstanceItemRequestBuilder roleAssignmentScheduleInstances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignmentScheduleInstance%2Did", id);
        return new UnifiedRoleAssignmentScheduleInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.directory.roleAssignmentScheduleRequests.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentScheduleRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleAssignmentScheduleRequestItemRequestBuilder roleAssignmentScheduleRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignmentScheduleRequest%2Did", id);
        return new UnifiedRoleAssignmentScheduleRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.directory.roleAssignmentSchedules.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentScheduleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleAssignmentScheduleItemRequestBuilder roleAssignmentSchedules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignmentSchedule%2Did", id);
        return new UnifiedRoleAssignmentScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.directory.roleDefinitions.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleDefinitionItemRequestBuilder roleDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleDefinition%2Did", id);
        return new UnifiedRoleDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.directory.roleEligibilityScheduleInstances.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleEligibilityScheduleInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder roleEligibilityScheduleInstances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleEligibilityScheduleInstance%2Did", id);
        return new UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.directory.roleEligibilityScheduleRequests.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleEligibilityScheduleRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleEligibilityScheduleRequestItemRequestBuilder roleEligibilityScheduleRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleEligibilityScheduleRequest%2Did", id);
        return new UnifiedRoleEligibilityScheduleRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.directory.roleEligibilitySchedules.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleEligibilityScheduleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleEligibilityScheduleItemRequestBuilder roleEligibilitySchedules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleEligibilitySchedule%2Did", id);
        return new UnifiedRoleEligibilityScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DirectoryRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new directoryRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public DirectoryRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Read-only. Nullable. */
    public class DirectoryRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DirectoryRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DirectoryRequestBuilderGetQueryParameters queryParameters = new DirectoryRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new directoryRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public DirectoryRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DirectoryRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new directoryRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public DirectoryRequestBuilderPatchRequestConfiguration() {
        }
    }
}