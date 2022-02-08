// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.FollowupFlag;
import com.microsoft.graph.models.Importance;
import com.microsoft.graph.models.InferenceClassificationType;
import com.microsoft.graph.models.InternetMessageHeader;
import com.microsoft.graph.models.Attachment;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.OutlookItem;
import com.microsoft.graph.requests.AttachmentCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message.
 */
public class Message extends OutlookItem implements IJsonBackedObject {


    /**
     * The Bcc Recipients.
     * The Bcc: recipients for the message.
     */
    @SerializedName(value = "bccRecipients", alternate = {"BccRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> bccRecipients;

    /**
     * The Body.
     * The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
	@Nullable
    public ItemBody body;

    /**
     * The Body Preview.
     * The first 255 characters of the message body. It is in text format.
     */
    @SerializedName(value = "bodyPreview", alternate = {"BodyPreview"})
    @Expose
	@Nullable
    public String bodyPreview;

    /**
     * The Cc Recipients.
     * The Cc: recipients for the message.
     */
    @SerializedName(value = "ccRecipients", alternate = {"CcRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> ccRecipients;

    /**
     * The Conversation Id.
     * The ID of the conversation the email belongs to.
     */
    @SerializedName(value = "conversationId", alternate = {"ConversationId"})
    @Expose
	@Nullable
    public String conversationId;

    /**
     * The Conversation Index.
     * Indicates the position of the message within the conversation.
     */
    @SerializedName(value = "conversationIndex", alternate = {"ConversationIndex"})
    @Expose
	@Nullable
    public byte[] conversationIndex;

    /**
     * The Flag.
     * The flag value that indicates the status, start date, due date, or completion date for the message.
     */
    @SerializedName(value = "flag", alternate = {"Flag"})
    @Expose
	@Nullable
    public FollowupFlag flag;

    /**
     * The From.
     * The owner of the mailbox from which the message is sent. In most cases, this value is the same as the sender property, except for sharing or delegation scenarios. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
     */
    @SerializedName(value = "from", alternate = {"From"})
    @Expose
	@Nullable
    public Recipient from;

    /**
     * The Has Attachments.
     * Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as &amp;lt;IMG src='cid:image001.jpg@01D26CD8.6C05F070'&amp;gt;.
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
	@Nullable
    public Boolean hasAttachments;

    /**
     * The Importance.
     * 
     */
    @SerializedName(value = "importance", alternate = {"Importance"})
    @Expose
	@Nullable
    public Importance importance;

    /**
     * The Inference Classification.
     * 
     */
    @SerializedName(value = "inferenceClassification", alternate = {"InferenceClassification"})
    @Expose
	@Nullable
    public InferenceClassificationType inferenceClassification;

    /**
     * The Internet Message Headers.
     * 
     */
    @SerializedName(value = "internetMessageHeaders", alternate = {"InternetMessageHeaders"})
    @Expose
	@Nullable
    public java.util.List<InternetMessageHeader> internetMessageHeaders;

    /**
     * The Internet Message Id.
     * 
     */
    @SerializedName(value = "internetMessageId", alternate = {"InternetMessageId"})
    @Expose
	@Nullable
    public String internetMessageId;

    /**
     * The Is Delivery Receipt Requested.
     * 
     */
    @SerializedName(value = "isDeliveryReceiptRequested", alternate = {"IsDeliveryReceiptRequested"})
    @Expose
	@Nullable
    public Boolean isDeliveryReceiptRequested;

    /**
     * The Is Draft.
     * 
     */
    @SerializedName(value = "isDraft", alternate = {"IsDraft"})
    @Expose
	@Nullable
    public Boolean isDraft;

    /**
     * The Is Read.
     * 
     */
    @SerializedName(value = "isRead", alternate = {"IsRead"})
    @Expose
	@Nullable
    public Boolean isRead;

    /**
     * The Is Read Receipt Requested.
     * 
     */
    @SerializedName(value = "isReadReceiptRequested", alternate = {"IsReadReceiptRequested"})
    @Expose
	@Nullable
    public Boolean isReadReceiptRequested;

    /**
     * The Parent Folder Id.
     * 
     */
    @SerializedName(value = "parentFolderId", alternate = {"ParentFolderId"})
    @Expose
	@Nullable
    public String parentFolderId;

    /**
     * The Received Date Time.
     * 
     */
    @SerializedName(value = "receivedDateTime", alternate = {"ReceivedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime receivedDateTime;

    /**
     * The Reply To.
     * 
     */
    @SerializedName(value = "replyTo", alternate = {"ReplyTo"})
    @Expose
	@Nullable
    public java.util.List<Recipient> replyTo;

    /**
     * The Sender.
     * 
     */
    @SerializedName(value = "sender", alternate = {"Sender"})
    @Expose
	@Nullable
    public Recipient sender;

    /**
     * The Sent Date Time.
     * 
     */
    @SerializedName(value = "sentDateTime", alternate = {"SentDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime sentDateTime;

    /**
     * The Subject.
     * 
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public String subject;

    /**
     * The To Recipients.
     * 
     */
    @SerializedName(value = "toRecipients", alternate = {"ToRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> toRecipients;

    /**
     * The Unique Body.
     * 
     */
    @SerializedName(value = "uniqueBody", alternate = {"UniqueBody"})
    @Expose
	@Nullable
    public ItemBody uniqueBody;

    /**
     * The Web Link.
     * 
     */
    @SerializedName(value = "webLink", alternate = {"WebLink"})
    @Expose
	@Nullable
    public String webLink;

    /**
     * The Attachments.
     * The fileAttachment and itemAttachment attachments for the message.
     */
    @SerializedName(value = "attachments", alternate = {"Attachments"})
    @Expose
	@Nullable
    public AttachmentCollectionPage attachments;

    /**
     * The Extensions.
     * The collection of open extensions defined for the message. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the message. Nullable.
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
	@Nullable
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the message. Nullable.
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
	@Nullable
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("attachments")) {
            attachments = serializer.deserializeObject(json.get("attachments"), AttachmentCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties"), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties"), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
