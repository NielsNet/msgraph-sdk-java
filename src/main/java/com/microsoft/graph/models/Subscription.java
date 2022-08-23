// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscription.
 */
public class Subscription extends Entity implements IJsonBackedObject {


    /**
     * The Application Id.
     * Optional. Identifier of the application used to create the subscription. Read-only.
     */
    @SerializedName(value = "applicationId", alternate = {"ApplicationId"})
    @Expose
	@Nullable
    public String applicationId;

    /**
     * The Change Type.
     * Required. Indicates the type of change in the subscribed resource that will raise a change notification. The supported values are: created, updated, deleted. Multiple values can be combined using a comma-separated list. Note:  Drive root item and list change notifications support only the updated changeType. User and group change notifications support updated and deleted changeType.
     */
    @SerializedName(value = "changeType", alternate = {"ChangeType"})
    @Expose
	@Nullable
    public String changeType;

    /**
     * The Client State.
     * Optional. Specifies the value of the clientState property sent by the service in each change notification. The maximum length is 128 characters. The client can check that the change notification came from the service by comparing the value of the clientState property sent with the subscription with the value of the clientState property received with each change notification.
     */
    @SerializedName(value = "clientState", alternate = {"ClientState"})
    @Expose
	@Nullable
    public String clientState;

    /**
     * The Creator Id.
     * Optional. Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
     */
    @SerializedName(value = "creatorId", alternate = {"CreatorId"})
    @Expose
	@Nullable
    public String creatorId;

    /**
     * The Encryption Certificate.
     * Optional. A base64-encoded representation of a certificate with a public key used to encrypt resource data in change notifications. Optional but required when includeResourceData is true.
     */
    @SerializedName(value = "encryptionCertificate", alternate = {"EncryptionCertificate"})
    @Expose
	@Nullable
    public String encryptionCertificate;

    /**
     * The Encryption Certificate Id.
     * Optional. A custom app-provided identifier to help identify the certificate needed to decrypt resource data.
     */
    @SerializedName(value = "encryptionCertificateId", alternate = {"EncryptionCertificateId"})
    @Expose
	@Nullable
    public String encryptionCertificateId;

    /**
     * The Expiration Date Time.
     * Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to. For the maximum supported subscription length of time, see the table below.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Include Resource Data.
     * Optional. When set to true, change notifications include resource data (such as content of a chat message).
     */
    @SerializedName(value = "includeResourceData", alternate = {"IncludeResourceData"})
    @Expose
	@Nullable
    public Boolean includeResourceData;

    /**
     * The Latest Supported Tls Version.
     * Optional. Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by notificationUrl, supports. The possible values are: v1_0, v1_1, v1_2, v1_3. For subscribers whose notification endpoint supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these subscribers, not setting this property per the timeline would result in subscription operations failing. For subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases, Microsoft Graph defaults the property to v1_2.
     */
    @SerializedName(value = "latestSupportedTlsVersion", alternate = {"LatestSupportedTlsVersion"})
    @Expose
	@Nullable
    public String latestSupportedTlsVersion;

    /**
     * The Lifecycle Notification Url.
     * Optional. The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved and missed notifications. This URL must make use of the HTTPS protocol.
     */
    @SerializedName(value = "lifecycleNotificationUrl", alternate = {"LifecycleNotificationUrl"})
    @Expose
	@Nullable
    public String lifecycleNotificationUrl;

    /**
     * The Notification Query Options.
     * Optional. OData query options for specifying value for the targeting resource. Clients receive notifications when resource reaches the state matching the query options provided here. With this new property in the subscription creation payload along with all existing properties, Webhooks will deliver notifications whenever a resource reaches the desired state mentioned in the notificationQueryOptions property. For example, when the print job is completed or when a print job resource isFetchable property value becomes true etc.
     */
    @SerializedName(value = "notificationQueryOptions", alternate = {"NotificationQueryOptions"})
    @Expose
	@Nullable
    public String notificationQueryOptions;

    /**
     * The Notification Url.
     * Required. The URL of the endpoint that will receive the change notifications. This URL must make use of the HTTPS protocol.
     */
    @SerializedName(value = "notificationUrl", alternate = {"NotificationUrl"})
    @Expose
	@Nullable
    public String notificationUrl;

    /**
     * The Notification Url App Id.
     * Optional. The app ID that the subscription service can use to generate the validation token. This allows the client to validate the authenticity of the notification received.
     */
    @SerializedName(value = "notificationUrlAppId", alternate = {"NotificationUrlAppId"})
    @Expose
	@Nullable
    public String notificationUrlAppId;

    /**
     * The Resource.
     * Required. Specifies the resource that will be monitored for changes. Do not include the base URL (https://graph.microsoft.com/v1.0/). See the possible resource path values for each supported resource.
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
	@Nullable
    public String resource;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
