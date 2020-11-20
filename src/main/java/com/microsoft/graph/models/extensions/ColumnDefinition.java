// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.BooleanColumn;
import com.microsoft.graph.models.extensions.CalculatedColumn;
import com.microsoft.graph.models.extensions.ChoiceColumn;
import com.microsoft.graph.models.extensions.CurrencyColumn;
import com.microsoft.graph.models.extensions.DateTimeColumn;
import com.microsoft.graph.models.extensions.DefaultColumnValue;
import com.microsoft.graph.models.extensions.GeolocationColumn;
import com.microsoft.graph.models.extensions.LookupColumn;
import com.microsoft.graph.models.extensions.NumberColumn;
import com.microsoft.graph.models.extensions.PersonOrGroupColumn;
import com.microsoft.graph.models.extensions.TextColumn;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Column Definition.
 */
public class ColumnDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Boolean.
     * This column stores boolean values.
     */
    @SerializedName(value = "boolean", alternate = {"Boolean"})
    @Expose
	@Nullable
    public BooleanColumn msgraphBoolean;

    /**
     * The Calculated.
     * This column's data is calculated based on other columns.
     */
    @SerializedName(value = "calculated", alternate = {"Calculated"})
    @Expose
	@Nullable
    public CalculatedColumn calculated;

    /**
     * The Choice.
     * This column stores data from a list of choices.
     */
    @SerializedName(value = "choice", alternate = {"Choice"})
    @Expose
	@Nullable
    public ChoiceColumn choice;

    /**
     * The Column Group.
     * For site columns, the name of the group this column belongs to. Helps organize related columns.
     */
    @SerializedName(value = "columnGroup", alternate = {"ColumnGroup"})
    @Expose
	@Nullable
    public String columnGroup;

    /**
     * The Currency.
     * This column stores currency values.
     */
    @SerializedName(value = "currency", alternate = {"Currency"})
    @Expose
	@Nullable
    public CurrencyColumn currency;

    /**
     * The Date Time.
     * This column stores DateTime values.
     */
    @SerializedName(value = "dateTime", alternate = {"DateTime"})
    @Expose
	@Nullable
    public DateTimeColumn dateTime;

    /**
     * The Default Value.
     * The default value for this column.
     */
    @SerializedName(value = "defaultValue", alternate = {"DefaultValue"})
    @Expose
	@Nullable
    public DefaultColumnValue defaultValue;

    /**
     * The Description.
     * The user-facing description of the column.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The user-facing name of the column.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Enforce Unique Values.
     * If true, no two list items may have the same value for this column.
     */
    @SerializedName(value = "enforceUniqueValues", alternate = {"EnforceUniqueValues"})
    @Expose
	@Nullable
    public Boolean enforceUniqueValues;

    /**
     * The Geolocation.
     * This column stores a geolocation.
     */
    @SerializedName(value = "geolocation", alternate = {"Geolocation"})
    @Expose
	@Nullable
    public GeolocationColumn geolocation;

    /**
     * The Hidden.
     * Specifies whether the column is displayed in the user interface.
     */
    @SerializedName(value = "hidden", alternate = {"Hidden"})
    @Expose
	@Nullable
    public Boolean hidden;

    /**
     * The Indexed.
     * Specifies whether the column values can used for sorting and searching.
     */
    @SerializedName(value = "indexed", alternate = {"Indexed"})
    @Expose
	@Nullable
    public Boolean indexed;

    /**
     * The Lookup.
     * This column's data is looked up from another source in the site.
     */
    @SerializedName(value = "lookup", alternate = {"Lookup"})
    @Expose
	@Nullable
    public LookupColumn lookup;

    /**
     * The Name.
     * The API-facing name of the column as it appears in the [fields][] on a [listItem][]. For the user-facing name, see displayName.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Number.
     * This column stores number values.
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public NumberColumn number;

    /**
     * The Person Or Group.
     * This column stores Person or Group values.
     */
    @SerializedName(value = "personOrGroup", alternate = {"PersonOrGroup"})
    @Expose
	@Nullable
    public PersonOrGroupColumn personOrGroup;

    /**
     * The Read Only.
     * Specifies whether the column values can be modified.
     */
    @SerializedName(value = "readOnly", alternate = {"ReadOnly"})
    @Expose
	@Nullable
    public Boolean readOnly;

    /**
     * The Required.
     * Specifies whether the column value is not optional.
     */
    @SerializedName(value = "required", alternate = {"Required"})
    @Expose
	@Nullable
    public Boolean required;

    /**
     * The Text.
     * This column stores text values.
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public TextColumn text;


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

    }
}
