package com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto;

import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.attachments.AttachmentsRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.attachments.item.AttachmentItemRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.extensions.item.ExtensionItemRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.forward.ForwardRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.multivalueextendedproperties.item.MultiValueLegacyExtendedPropertyItemRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.multivalueextendedproperties.MultiValueExtendedPropertiesRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.reply.ReplyRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.singlevalueextendedproperties.item.SingleValueLegacyExtendedPropertyItemRequestBuilder;
import com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.singlevalueextendedproperties.SingleValueExtendedPropertiesRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Post;
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
 * Provides operations to manage the inReplyTo property of the microsoft.graph.post entity.
 */
public class InReplyToRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the attachments property of the microsoft.graph.post entity. */
    @javax.annotation.Nonnull
    public AttachmentsRequestBuilder attachments() {
        return new AttachmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the extensions property of the microsoft.graph.post entity. */
    @javax.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the forward method. */
    @javax.annotation.Nonnull
    public ForwardRequestBuilder forward() {
        return new ForwardRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the multiValueExtendedProperties property of the microsoft.graph.post entity. */
    @javax.annotation.Nonnull
    public MultiValueExtendedPropertiesRequestBuilder multiValueExtendedProperties() {
        return new MultiValueExtendedPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the reply method. */
    @javax.annotation.Nonnull
    public ReplyRequestBuilder reply() {
        return new ReplyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the singleValueExtendedProperties property of the microsoft.graph.post entity. */
    @javax.annotation.Nonnull
    public SingleValueExtendedPropertiesRequestBuilder singleValueExtendedProperties() {
        return new SingleValueExtendedPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.post entity.
     * @param id Unique identifier of the item
     * @return a AttachmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AttachmentItemRequestBuilder attachments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attachment%2Did", id);
        return new AttachmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new InReplyToRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public InReplyToRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/threads/{conversationThread%2Did}/posts/{post%2Did}/inReplyTo{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new InReplyToRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public InReplyToRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/threads/{conversationThread%2Did}/posts/{post%2Did}/inReplyTo{?%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.post entity.
     * @param id Unique identifier of the item
     * @return a ExtensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExtensionItemRequestBuilder extensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("extension%2Did", id);
        return new ExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Read-only. Supports $expand.
     * @return a CompletableFuture of post
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Post> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Post::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Post> executionException = new java.util.concurrent.CompletableFuture<Post>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Read-only. Supports $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of post
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Post> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Post::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Post> executionException = new java.util.concurrent.CompletableFuture<Post>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the multiValueExtendedProperties property of the microsoft.graph.post entity.
     * @param id Unique identifier of the item
     * @return a MultiValueLegacyExtendedPropertyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MultiValueLegacyExtendedPropertyItemRequestBuilder multiValueExtendedProperties(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("multiValueLegacyExtendedProperty%2Did", id);
        return new MultiValueLegacyExtendedPropertyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the singleValueExtendedProperties property of the microsoft.graph.post entity.
     * @param id Unique identifier of the item
     * @return a SingleValueLegacyExtendedPropertyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SingleValueLegacyExtendedPropertyItemRequestBuilder singleValueExtendedProperties(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("singleValueLegacyExtendedProperty%2Did", id);
        return new SingleValueLegacyExtendedPropertyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Read-only. Supports $expand.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Read-only. Supports $expand.
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
     * Read-only. Supports $expand.
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
}