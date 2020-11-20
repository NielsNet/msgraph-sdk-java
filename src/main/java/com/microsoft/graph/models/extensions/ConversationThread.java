// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PostCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Thread.
 */
public class ConversationThread extends Entity implements IJsonBackedObject {


    /**
     * The Cc Recipients.
     * The Cc: recipients for the thread.
     */
    @SerializedName(value = "ccRecipients", alternate = {"CcRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> ccRecipients;

    /**
     * The Has Attachments.
     * Indicates whether any of the posts within this thread has at least one attachment.
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
	@Nullable
    public Boolean hasAttachments;

    /**
     * The Is Locked.
     * Indicates if the thread is locked.
     */
    @SerializedName(value = "isLocked", alternate = {"IsLocked"})
    @Expose
	@Nullable
    public Boolean isLocked;

    /**
     * The Last Delivered Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "lastDeliveredDateTime", alternate = {"LastDeliveredDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastDeliveredDateTime;

    /**
     * The Preview.
     * A short summary from the body of the latest post in this conversation.
     */
    @SerializedName(value = "preview", alternate = {"Preview"})
    @Expose
	@Nullable
    public String preview;

    /**
     * The Topic.
     * The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
     */
    @SerializedName(value = "topic", alternate = {"Topic"})
    @Expose
	@Nullable
    public String topic;

    /**
     * The To Recipients.
     * The To: recipients for the thread.
     */
    @SerializedName(value = "toRecipients", alternate = {"ToRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> toRecipients;

    /**
     * The Unique Senders.
     * All the users that sent a message to this thread.
     */
    @SerializedName(value = "uniqueSenders", alternate = {"UniqueSenders"})
    @Expose
	@Nullable
    public java.util.List<String> uniqueSenders;

    /**
     * The Posts.
     * Read-only. Nullable.
     */
    @SerializedName(value = "posts", alternate = {"Posts"})
    @Expose
	@Nullable
    public PostCollectionPage posts;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("posts")) {
            posts = serializer.deserializeObject(json.get("posts").toString(), PostCollectionPage.class);
        }
    }
}
