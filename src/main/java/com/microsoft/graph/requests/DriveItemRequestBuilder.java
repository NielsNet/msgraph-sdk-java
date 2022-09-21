// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.ItemReference;
import com.microsoft.graph.models.DriveItemUploadableProperties;
import com.microsoft.graph.models.UploadSession;
import com.microsoft.graph.models.Permission;
import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.graph.models.ItemPreviewInfo;
import com.microsoft.graph.models.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DriveItemRestoreParameterSet;
import com.microsoft.graph.models.DriveItemCopyParameterSet;
import com.microsoft.graph.models.DriveItemCreateUploadSessionParameterSet;
import com.microsoft.graph.models.DriveItemCheckinParameterSet;
import com.microsoft.graph.models.DriveItemCreateLinkParameterSet;
import com.microsoft.graph.models.DriveItemInviteParameterSet;
import com.microsoft.graph.models.DriveItemPreviewParameterSet;
import com.microsoft.graph.models.DriveItemValidatePermissionParameterSet;
import com.microsoft.graph.models.DriveItemDeltaParameterSet;
import com.microsoft.graph.models.DriveItemGetActivitiesByIntervalParameterSet;
import com.microsoft.graph.models.DriveItemSearchParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Request Builder.
 */
public class DriveItemRequestBuilder extends BaseRequestBuilder<DriveItem> {

    /**
     * The request builder for the DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DriveItemRequest instance
     */
    @Nonnull
    public DriveItemRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DriveItemRequest instance
     */
    @Nonnull
    public DriveItemRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DriveItemRequest(getRequestUrl(), getClient(), requestOptions);
    }

    /**
     * Gets a request builder to the specific path on the drive
     * @param path path to the query on the drive
     * @return a request builder to the specified path
     */
    @Nonnull
    public DriveItemRequestBuilder itemWithPath(@Nonnull final String path) {
        String value = path;
        try {
            value = java.net.URLEncoder.encode(path, java.nio.charset.StandardCharsets.UTF_8.toString()).replace("+", "%20");
            //ODSP doesn't respect application/x-www-form-urlencoded MIME format and expects spaces with %20
        } catch (java.io.UnsupportedEncodingException ex) {
            throw new ClientException("unsupported encoding", ex);
        }
        return new DriveItemRequestBuilder(getRequestUrl() + ":/" + value + ":", getClient(), null);
    }


    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UserWithReferenceRequestBuilder createdByUser() {
        return new com.microsoft.graph.requests.UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UserWithReferenceRequestBuilder lastModifiedByUser() {
        return new com.microsoft.graph.requests.UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for Workbook
     *
     * @return the WorkbookRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.WorkbookRequestBuilder workbook() {
        return new com.microsoft.graph.requests.WorkbookRequestBuilder(getRequestUrlWithAdditionalSegment("workbook"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the ItemAnalyticsWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ItemAnalyticsWithReferenceRequestBuilder analytics() {
        return new com.microsoft.graph.requests.ItemAnalyticsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DriveItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemCollectionRequestBuilder children() {
        return new com.microsoft.graph.requests.DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("children"), getClient(), null);
    }

    /**
     * Gets a request builder for the DriveItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemRequestBuilder children(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("children") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ListItem
     *
     * @return the ListItemRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ListItemRequestBuilder listItem() {
        return new com.microsoft.graph.requests.ListItemRequestBuilder(getRequestUrlWithAdditionalSegment("listItem"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Permission collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PermissionCollectionRequestBuilder permissions() {
        return new com.microsoft.graph.requests.PermissionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Permission item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PermissionRequestBuilder permissions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PermissionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Subscription collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.SubscriptionCollectionRequestBuilder subscriptions() {
        return new com.microsoft.graph.requests.SubscriptionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("subscriptions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Subscription item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.SubscriptionRequestBuilder subscriptions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.SubscriptionRequestBuilder(getRequestUrlWithAdditionalSegment("subscriptions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ThumbnailSet collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ThumbnailSetCollectionRequestBuilder thumbnails() {
        return new com.microsoft.graph.requests.ThumbnailSetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("thumbnails"), getClient(), null);
    }

    /**
     * Gets a request builder for the ThumbnailSet item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ThumbnailSetRequestBuilder thumbnails(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ThumbnailSetRequestBuilder(getRequestUrlWithAdditionalSegment("thumbnails") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DriveItemVersion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemVersionCollectionRequestBuilder versions() {
        return new com.microsoft.graph.requests.DriveItemVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("versions"), getClient(), null);
    }

    /**
     * Gets a request builder for the DriveItemVersion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemVersionRequestBuilder versions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DriveItemVersionRequestBuilder(getRequestUrlWithAdditionalSegment("versions") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for content
     *
     * @return the DriveItemContentStreamRequestBuilder instance
     */
    @Nonnull
    public DriveItemContentStreamRequestBuilder content() {
        return new DriveItemContentStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemRestoreRequestBuilder restore(@Nonnull final DriveItemRestoreParameterSet parameters) {
        return new DriveItemRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemCopyRequestBuilder copy(@Nonnull final DriveItemCopyParameterSet parameters) {
        return new DriveItemCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copy"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemCreateUploadSessionRequestBuilder createUploadSession(@Nonnull final DriveItemCreateUploadSessionParameterSet parameters) {
        return new DriveItemCreateUploadSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createUploadSession"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemCheckinRequestBuilder checkin(@Nonnull final DriveItemCheckinParameterSet parameters) {
        return new DriveItemCheckinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DriveItemCheckoutRequestBuilder checkout() {
        return new DriveItemCheckoutRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkout"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemCreateLinkRequestBuilder createLink(@Nonnull final DriveItemCreateLinkParameterSet parameters) {
        return new DriveItemCreateLinkRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createLink"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DriveItemFollowRequestBuilder follow() {
        return new DriveItemFollowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.follow"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemInviteCollectionRequestBuilder invite(@Nonnull final DriveItemInviteParameterSet parameters) {
        return new DriveItemInviteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.invite"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemPreviewRequestBuilder preview(@Nonnull final DriveItemPreviewParameterSet parameters) {
        return new DriveItemPreviewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.preview"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DriveItemUnfollowRequestBuilder unfollow() {
        return new DriveItemUnfollowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unfollow"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemValidatePermissionRequestBuilder validatePermission(@Nonnull final DriveItemValidatePermissionParameterSet parameters) {
        return new DriveItemValidatePermissionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validatePermission"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public DriveItemDeltaCollectionRequestBuilder delta() {
        return new DriveItemDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemDeltaCollectionRequestBuilder delta(@Nonnull final DriveItemDeltaParameterSet parameters) {
        return new DriveItemDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public DriveItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval() {
        return new DriveItemGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(@Nonnull final DriveItemGetActivitiesByIntervalParameterSet parameters) {
        return new DriveItemGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveItemSearchCollectionRequestBuilder search(@Nonnull final DriveItemSearchParameterSet parameters) {
        return new DriveItemSearchCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.search"), getClient(), null, parameters);
    }
}