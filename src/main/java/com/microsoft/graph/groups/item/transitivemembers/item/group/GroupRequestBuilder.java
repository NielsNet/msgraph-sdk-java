package microsoft.graph.groups.item.transitivemembers.item.group;

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
import microsoft.graph.groups.item.transitivemembers.item.group.addfavorite.AddFavoriteRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.assignlicense.AssignLicenseRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.checkgrantedpermissionsforapp.CheckGrantedPermissionsForAppRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.checkmembergroups.CheckMemberGroupsRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.getmembergroups.GetMemberGroupsRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.getmemberobjects.GetMemberObjectsRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.removefavorite.RemoveFavoriteRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.renew.RenewRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.resetunseencount.ResetUnseenCountRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.restore.RestoreRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.subscribebymail.SubscribeByMailRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.unsubscribebymail.UnsubscribeByMailRequestBuilder;
import microsoft.graph.groups.item.transitivemembers.item.group.validateproperties.ValidatePropertiesRequestBuilder;
import microsoft.graph.models.Group;
import microsoft.graph.models.odataerrors.ODataError;
/** Casts the previous resource to group. */
public class GroupRequestBuilder {
    /** The addFavorite property */
    @javax.annotation.Nonnull
    public AddFavoriteRequestBuilder addFavorite() {
        return new AddFavoriteRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignLicense property */
    @javax.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkGrantedPermissionsForApp property */
    @javax.annotation.Nonnull
    public CheckGrantedPermissionsForAppRequestBuilder checkGrantedPermissionsForApp() {
        return new CheckGrantedPermissionsForAppRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberGroups property */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberObjects property */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberGroups property */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberObjects property */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The removeFavorite property */
    @javax.annotation.Nonnull
    public RemoveFavoriteRequestBuilder removeFavorite() {
        return new RemoveFavoriteRequestBuilder(pathParameters, requestAdapter);
    }
    /** The renew property */
    @javax.annotation.Nonnull
    public RenewRequestBuilder renew() {
        return new RenewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The resetUnseenCount property */
    @javax.annotation.Nonnull
    public ResetUnseenCountRequestBuilder resetUnseenCount() {
        return new ResetUnseenCountRequestBuilder(pathParameters, requestAdapter);
    }
    /** The restore property */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** The subscribeByMail property */
    @javax.annotation.Nonnull
    public SubscribeByMailRequestBuilder subscribeByMail() {
        return new SubscribeByMailRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unsubscribeByMail property */
    @javax.annotation.Nonnull
    public UnsubscribeByMailRequestBuilder unsubscribeByMail() {
        return new UnsubscribeByMailRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The validateProperties property */
    @javax.annotation.Nonnull
    public ValidatePropertiesRequestBuilder validateProperties() {
        return new ValidatePropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new GroupRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GroupRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/groups/{group%2Did}/transitiveMembers/{directoryObject%2Did}/microsoft.graph.group{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new GroupRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GroupRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/groups/{group%2Did}/transitiveMembers/{directoryObject%2Did}/microsoft.graph.group{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.group
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.group
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GroupRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final GroupRequestBuilderGetRequestConfiguration requestConfig = new GroupRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.group
     * @return a CompletableFuture of group
     */
    public java.util.concurrent.CompletableFuture<Group> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Group::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.group
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of group
     */
    public java.util.concurrent.CompletableFuture<Group> get(@javax.annotation.Nullable final java.util.function.Consumer<GroupRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Group::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.group
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of group
     */
    public java.util.concurrent.CompletableFuture<Group> get(@javax.annotation.Nullable final java.util.function.Consumer<GroupRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Group::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Get the item of type microsoft.graph.directoryObject as microsoft.graph.group */
    public class GroupRequestBuilderGetQueryParameters {
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
    public class GroupRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GroupRequestBuilderGetQueryParameters queryParameters = new GroupRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new groupRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public GroupRequestBuilderGetRequestConfiguration() {
        }
    }
}