// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.ServicePlanInfo;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the License Details.
 */
public class LicenseDetails extends Entity implements IJsonBackedObject {


    /**
     * The Service Plans.
     * Information about the service plans assigned with the license. Read-only, Not nullable
     */
    @SerializedName(value = "servicePlans", alternate = {"ServicePlans"})
    @Expose
	@Nullable
    public java.util.List<ServicePlanInfo> servicePlans;

    /**
     * The Sku Id.
     * Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object. Read-only
     */
    @SerializedName(value = "skuId", alternate = {"SkuId"})
    @Expose
	@Nullable
    public java.util.UUID skuId;

    /**
     * The Sku Part Number.
     * Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'. Read-only
     */
    @SerializedName(value = "skuPartNumber", alternate = {"SkuPartNumber"})
    @Expose
	@Nullable
    public String skuPartNumber;


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
