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
import com.microsoft.graph.models.extensions.PhysicalOfficeAddress;
import com.microsoft.graph.models.extensions.OnPremisesProvisioningError;
import com.microsoft.graph.models.extensions.Phone;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact.
 */
public class OrgContact extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Addresses.
     * 
     */
    @SerializedName(value = "addresses", alternate = {"Addresses"})
    @Expose
	@Nullable
    public java.util.List<PhysicalOfficeAddress> addresses;

    /**
     * The Company Name.
     * 
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
	@Nullable
    public String companyName;

    /**
     * The Department.
     * 
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
	@Nullable
    public String department;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Given Name.
     * 
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
	@Nullable
    public String givenName;

    /**
     * The Job Title.
     * 
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
	@Nullable
    public String jobTitle;

    /**
     * The Mail.
     * 
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
	@Nullable
    public String mail;

    /**
     * The Mail Nickname.
     * 
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
	@Nullable
    public String mailNickname;

    /**
     * The On Premises Last Sync Date Time.
     * 
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Provisioning Errors.
     * 
     */
    @SerializedName(value = "onPremisesProvisioningErrors", alternate = {"OnPremisesProvisioningErrors"})
    @Expose
	@Nullable
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sync Enabled.
     * 
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
	@Nullable
    public Boolean onPremisesSyncEnabled;

    /**
     * The Phones.
     * 
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
	@Nullable
    public java.util.List<Phone> phones;

    /**
     * The Proxy Addresses.
     * 
     */
    @SerializedName(value = "proxyAddresses", alternate = {"ProxyAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> proxyAddresses;

    /**
     * The Surname.
     * 
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
	@Nullable
    public String surname;

    /**
     * The Direct Reports.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage directReports;

    /**
     * The Manager.
     * 
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
	@Nullable
    public DirectoryObject manager;

    /**
     * The Member Of.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Transitive Member Of.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage transitiveMemberOf;


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


        if (json.has("directReports")) {
            directReports = serializer.deserializeObject(json.get("directReports").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), DirectoryObjectCollectionPage.class);
        }
    }
}
