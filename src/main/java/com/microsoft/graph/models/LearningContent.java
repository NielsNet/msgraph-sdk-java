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
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Learning Content.
 */
public class LearningContent extends Entity implements IJsonBackedObject {


    /**
     * The Additional Tags.
     * Keywords, topics, and other tags associated with the learning content. Optional.
     */
    @SerializedName(value = "additionalTags", alternate = {"AdditionalTags"})
    @Expose
	@Nullable
    public java.util.List<String> additionalTags;

    /**
     * The Content Web Url.
     * The content web URL for the learning content. Required.
     */
    @SerializedName(value = "contentWebUrl", alternate = {"ContentWebUrl"})
    @Expose
	@Nullable
    public String contentWebUrl;

    /**
     * The Contributors.
     * The authors, creators, or contributors of the learning content. Optional.
     */
    @SerializedName(value = "contributors", alternate = {"Contributors"})
    @Expose
	@Nullable
    public java.util.List<String> contributors;

    /**
     * The Created Date Time.
     * The date and time when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * The description or summary for the learning content. Optional.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Duration.
     * The duration of the learning content in seconds. The value is represented in ISO 8601 format for durations. Optional.
     */
    @SerializedName(value = "duration", alternate = {"Duration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration duration;

    /**
     * The External Id.
     * Unique external content ID for the learning content. Required.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The Format.
     * The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
	@Nullable
    public String format;

    /**
     * The Is Active.
     * Indicates whether the content is active or not. Inactive content doesn't show up in the UI. The default value is true. Optional.
     */
    @SerializedName(value = "isActive", alternate = {"IsActive"})
    @Expose
	@Nullable
    public Boolean isActive;

    /**
     * The Is Premium.
     * Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional.
     */
    @SerializedName(value = "isPremium", alternate = {"IsPremium"})
    @Expose
	@Nullable
    public Boolean isPremium;

    /**
     * The Is Searchable.
     * Indicates whether the learning content is searchable or not. The default value is true. Optional.
     */
    @SerializedName(value = "isSearchable", alternate = {"IsSearchable"})
    @Expose
	@Nullable
    public Boolean isSearchable;

    /**
     * The Language Tag.
     * The language of the learning content, for example, en-us or fr-fr. Required.
     */
    @SerializedName(value = "languageTag", alternate = {"LanguageTag"})
    @Expose
	@Nullable
    public String languageTag;

    /**
     * The Last Modified Date Time.
     * The date and time when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Number Of Pages.
     * The number of pages of the learning content, for example, 9. Optional.
     */
    @SerializedName(value = "numberOfPages", alternate = {"NumberOfPages"})
    @Expose
	@Nullable
    public Integer numberOfPages;

    /**
     * The Skill Tags.
     * The skills tags associated with the learning content. Optional.
     */
    @SerializedName(value = "skillTags", alternate = {"SkillTags"})
    @Expose
	@Nullable
    public java.util.List<String> skillTags;

    /**
     * The Source Name.
     * The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
     */
    @SerializedName(value = "sourceName", alternate = {"SourceName"})
    @Expose
	@Nullable
    public String sourceName;

    /**
     * The Thumbnail Web Url.
     * The URL of learning content thumbnail image. Optional.
     */
    @SerializedName(value = "thumbnailWebUrl", alternate = {"ThumbnailWebUrl"})
    @Expose
	@Nullable
    public String thumbnailWebUrl;

    /**
     * The Title.
     * The title of the learning content. Required.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}