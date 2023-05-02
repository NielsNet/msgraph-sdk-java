// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Send Activity Notification To Recipients Parameter Set.
 */
public class TeamworkSendActivityNotificationToRecipientsParameterSet {
    /**
     * The topic.
     * 
     */
    @SerializedName(value = "topic", alternate = {"Topic"})
    @Expose
	@Nullable
    public TeamworkActivityTopic topic;

    /**
     * The activity Type.
     * 
     */
    @SerializedName(value = "activityType", alternate = {"ActivityType"})
    @Expose
	@Nullable
    public String activityType;

    /**
     * The chain Id.
     * 
     */
    @SerializedName(value = "chainId", alternate = {"ChainId"})
    @Expose
	@Nullable
    public Long chainId;

    /**
     * The preview Text.
     * 
     */
    @SerializedName(value = "previewText", alternate = {"PreviewText"})
    @Expose
	@Nullable
    public ItemBody previewText;

    /**
     * The teams App Id.
     * 
     */
    @SerializedName(value = "teamsAppId", alternate = {"TeamsAppId"})
    @Expose
	@Nullable
    public String teamsAppId;

    /**
     * The template Parameters.
     * 
     */
    @SerializedName(value = "templateParameters", alternate = {"TemplateParameters"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> templateParameters;

    /**
     * The recipients.
     * 
     */
    @SerializedName(value = "recipients", alternate = {"Recipients"})
    @Expose
	@Nullable
    public java.util.List<TeamworkNotificationRecipient> recipients;


    /**
     * Instiaciates a new TeamworkSendActivityNotificationToRecipientsParameterSet
     */
    public TeamworkSendActivityNotificationToRecipientsParameterSet() {}
    /**
     * Instiaciates a new TeamworkSendActivityNotificationToRecipientsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TeamworkSendActivityNotificationToRecipientsParameterSet(@Nonnull final TeamworkSendActivityNotificationToRecipientsParameterSetBuilder builder) {
        this.topic = builder.topic;
        this.activityType = builder.activityType;
        this.chainId = builder.chainId;
        this.previewText = builder.previewText;
        this.teamsAppId = builder.teamsAppId;
        this.templateParameters = builder.templateParameters;
        this.recipients = builder.recipients;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TeamworkSendActivityNotificationToRecipientsParameterSetBuilder newBuilder() {
        return new TeamworkSendActivityNotificationToRecipientsParameterSetBuilder();
    }
    /**
     * Fluent builder for the TeamworkSendActivityNotificationToRecipientsParameterSet
     */
    public static final class TeamworkSendActivityNotificationToRecipientsParameterSetBuilder {
        /**
         * The topic parameter value
         */
        @Nullable
        protected TeamworkActivityTopic topic;
        /**
         * Sets the Topic
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamworkSendActivityNotificationToRecipientsParameterSetBuilder withTopic(@Nullable final TeamworkActivityTopic val) {
            this.topic = val;
            return this;
        }
        /**
         * The activityType parameter value
         */
        @Nullable
        protected String activityType;
        /**
         * Sets the ActivityType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamworkSendActivityNotificationToRecipientsParameterSetBuilder withActivityType(@Nullable final String val) {
            this.activityType = val;
            return this;
        }
        /**
         * The chainId parameter value
         */
        @Nullable
        protected Long chainId;
        /**
         * Sets the ChainId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamworkSendActivityNotificationToRecipientsParameterSetBuilder withChainId(@Nullable final Long val) {
            this.chainId = val;
            return this;
        }
        /**
         * The previewText parameter value
         */
        @Nullable
        protected ItemBody previewText;
        /**
         * Sets the PreviewText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamworkSendActivityNotificationToRecipientsParameterSetBuilder withPreviewText(@Nullable final ItemBody val) {
            this.previewText = val;
            return this;
        }
        /**
         * The teamsAppId parameter value
         */
        @Nullable
        protected String teamsAppId;
        /**
         * Sets the TeamsAppId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamworkSendActivityNotificationToRecipientsParameterSetBuilder withTeamsAppId(@Nullable final String val) {
            this.teamsAppId = val;
            return this;
        }
        /**
         * The templateParameters parameter value
         */
        @Nullable
        protected java.util.List<KeyValuePair> templateParameters;
        /**
         * Sets the TemplateParameters
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamworkSendActivityNotificationToRecipientsParameterSetBuilder withTemplateParameters(@Nullable final java.util.List<KeyValuePair> val) {
            this.templateParameters = val;
            return this;
        }
        /**
         * The recipients parameter value
         */
        @Nullable
        protected java.util.List<TeamworkNotificationRecipient> recipients;
        /**
         * Sets the Recipients
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamworkSendActivityNotificationToRecipientsParameterSetBuilder withRecipients(@Nullable final java.util.List<TeamworkNotificationRecipient> val) {
            this.recipients = val;
            return this;
        }
        /**
         * Instanciates a new TeamworkSendActivityNotificationToRecipientsParameterSetBuilder
         */
        @Nullable
        protected TeamworkSendActivityNotificationToRecipientsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TeamworkSendActivityNotificationToRecipientsParameterSet build() {
            return new TeamworkSendActivityNotificationToRecipientsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.topic != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("topic", topic));
        }
        if(this.activityType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("activityType", activityType));
        }
        if(this.chainId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("chainId", chainId));
        }
        if(this.previewText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("previewText", previewText));
        }
        if(this.teamsAppId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("teamsAppId", teamsAppId));
        }
        if(this.templateParameters != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("templateParameters", templateParameters));
        }
        if(this.recipients != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("recipients", recipients));
        }
        return result;
    }
}