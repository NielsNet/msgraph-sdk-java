// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidWorkProfileRequiredPasswordType;
import com.microsoft.graph.models.generated.AndroidWorkProfileCrossProfileDataSharingType;
import com.microsoft.graph.models.generated.AndroidWorkProfileDefaultAppPermissionPolicyType;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile General Device Configuration.
 */
public class AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock.
     */
    @SerializedName(value = "passwordBlockFingerprintUnlock", alternate = {"PasswordBlockFingerprintUnlock"})
    @Expose
	@Nullable
    public Boolean passwordBlockFingerprintUnlock;

    /**
     * The Password Block Trust Agents.
     * Indicates whether or not to block Smart Lock and other trust agents.
     */
    @SerializedName(value = "passwordBlockTrustAgents", alternate = {"PasswordBlockTrustAgents"})
    @Expose
	@Nullable
    public Boolean passwordBlockTrustAgents;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 365
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords. Valid values 4 to 16
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeScreenTimeout", alternate = {"PasswordMinutesOfInactivityBeforeScreenTimeout"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 0 to 24
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required Type.
     * Type of password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
	@Nullable
    public AndroidWorkProfileRequiredPasswordType passwordRequiredType;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before factory reset. Valid values 1 to 16
     */
    @SerializedName(value = "passwordSignInFailureCountBeforeFactoryReset", alternate = {"PasswordSignInFailureCountBeforeFactoryReset"})
    @Expose
	@Nullable
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Security Require Verify Apps.
     * Require the Android Verify apps feature is turned on.
     */
    @SerializedName(value = "securityRequireVerifyApps", alternate = {"SecurityRequireVerifyApps"})
    @Expose
	@Nullable
    public Boolean securityRequireVerifyApps;

    /**
     * The Work Profile Block Adding Accounts.
     * Block users from adding/removing accounts in work profile.
     */
    @SerializedName(value = "workProfileBlockAddingAccounts", alternate = {"WorkProfileBlockAddingAccounts"})
    @Expose
	@Nullable
    public Boolean workProfileBlockAddingAccounts;

    /**
     * The Work Profile Block Camera.
     * Block work profile camera.
     */
    @SerializedName(value = "workProfileBlockCamera", alternate = {"WorkProfileBlockCamera"})
    @Expose
	@Nullable
    public Boolean workProfileBlockCamera;

    /**
     * The Work Profile Block Cross Profile Caller Id.
     * Block display work profile caller ID in personal profile.
     */
    @SerializedName(value = "workProfileBlockCrossProfileCallerId", alternate = {"WorkProfileBlockCrossProfileCallerId"})
    @Expose
	@Nullable
    public Boolean workProfileBlockCrossProfileCallerId;

    /**
     * The Work Profile Block Cross Profile Contacts Search.
     * Block work profile contacts availability in personal profile.
     */
    @SerializedName(value = "workProfileBlockCrossProfileContactsSearch", alternate = {"WorkProfileBlockCrossProfileContactsSearch"})
    @Expose
	@Nullable
    public Boolean workProfileBlockCrossProfileContactsSearch;

    /**
     * The Work Profile Block Cross Profile Copy Paste.
     * Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     */
    @SerializedName(value = "workProfileBlockCrossProfileCopyPaste", alternate = {"WorkProfileBlockCrossProfileCopyPaste"})
    @Expose
	@Nullable
    public Boolean workProfileBlockCrossProfileCopyPaste;

    /**
     * The Work Profile Block Notifications While Device Locked.
     * Indicates whether or not to block notifications while device locked.
     */
    @SerializedName(value = "workProfileBlockNotificationsWhileDeviceLocked", alternate = {"WorkProfileBlockNotificationsWhileDeviceLocked"})
    @Expose
	@Nullable
    public Boolean workProfileBlockNotificationsWhileDeviceLocked;

    /**
     * The Work Profile Block Screen Capture.
     * Block screen capture in work profile.
     */
    @SerializedName(value = "workProfileBlockScreenCapture", alternate = {"WorkProfileBlockScreenCapture"})
    @Expose
	@Nullable
    public Boolean workProfileBlockScreenCapture;

    /**
     * The Work Profile Bluetooth Enable Contact Sharing.
     * Allow bluetooth devices to access enterprise contacts.
     */
    @SerializedName(value = "workProfileBluetoothEnableContactSharing", alternate = {"WorkProfileBluetoothEnableContactSharing"})
    @Expose
	@Nullable
    public Boolean workProfileBluetoothEnableContactSharing;

    /**
     * The Work Profile Data Sharing Type.
     * Type of data sharing that is allowed. Possible values are: deviceDefault, preventAny, allowPersonalToWork, noRestrictions.
     */
    @SerializedName(value = "workProfileDataSharingType", alternate = {"WorkProfileDataSharingType"})
    @Expose
	@Nullable
    public AndroidWorkProfileCrossProfileDataSharingType workProfileDataSharingType;

    /**
     * The Work Profile Default App Permission Policy.
     * Type of password that is required. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
     */
    @SerializedName(value = "workProfileDefaultAppPermissionPolicy", alternate = {"WorkProfileDefaultAppPermissionPolicy"})
    @Expose
	@Nullable
    public AndroidWorkProfileDefaultAppPermissionPolicyType workProfileDefaultAppPermissionPolicy;

    /**
     * The Work Profile Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock for work profile.
     */
    @SerializedName(value = "workProfilePasswordBlockFingerprintUnlock", alternate = {"WorkProfilePasswordBlockFingerprintUnlock"})
    @Expose
	@Nullable
    public Boolean workProfilePasswordBlockFingerprintUnlock;

    /**
     * The Work Profile Password Block Trust Agents.
     * Indicates whether or not to block Smart Lock and other trust agents for work profile.
     */
    @SerializedName(value = "workProfilePasswordBlockTrustAgents", alternate = {"WorkProfilePasswordBlockTrustAgents"})
    @Expose
	@Nullable
    public Boolean workProfilePasswordBlockTrustAgents;

    /**
     * The Work Profile Password Expiration Days.
     * Number of days before the work profile password expires. Valid values 1 to 365
     */
    @SerializedName(value = "workProfilePasswordExpirationDays", alternate = {"WorkProfilePasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer workProfilePasswordExpirationDays;

    /**
     * The Work Profile Password Minimum Length.
     * Minimum length of work profile password. Valid values 4 to 16
     */
    @SerializedName(value = "workProfilePasswordMinimumLength", alternate = {"WorkProfilePasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer workProfilePasswordMinimumLength;

    /**
     * The Work Profile Password Min Letter Characters.
     * Minimum # of letter characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName(value = "workProfilePasswordMinLetterCharacters", alternate = {"WorkProfilePasswordMinLetterCharacters"})
    @Expose
	@Nullable
    public Integer workProfilePasswordMinLetterCharacters;

    /**
     * The Work Profile Password Min Lower Case Characters.
     * Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName(value = "workProfilePasswordMinLowerCaseCharacters", alternate = {"WorkProfilePasswordMinLowerCaseCharacters"})
    @Expose
	@Nullable
    public Integer workProfilePasswordMinLowerCaseCharacters;

    /**
     * The Work Profile Password Min Non Letter Characters.
     * Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName(value = "workProfilePasswordMinNonLetterCharacters", alternate = {"WorkProfilePasswordMinNonLetterCharacters"})
    @Expose
	@Nullable
    public Integer workProfilePasswordMinNonLetterCharacters;

    /**
     * The Work Profile Password Min Numeric Characters.
     * Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName(value = "workProfilePasswordMinNumericCharacters", alternate = {"WorkProfilePasswordMinNumericCharacters"})
    @Expose
	@Nullable
    public Integer workProfilePasswordMinNumericCharacters;

    /**
     * The Work Profile Password Min Symbol Characters.
     * Minimum # of symbols required in work profile password. Valid values 1 to 10
     */
    @SerializedName(value = "workProfilePasswordMinSymbolCharacters", alternate = {"WorkProfilePasswordMinSymbolCharacters"})
    @Expose
	@Nullable
    public Integer workProfilePasswordMinSymbolCharacters;

    /**
     * The Work Profile Password Min Upper Case Characters.
     * Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName(value = "workProfilePasswordMinUpperCaseCharacters", alternate = {"WorkProfilePasswordMinUpperCaseCharacters"})
    @Expose
	@Nullable
    public Integer workProfilePasswordMinUpperCaseCharacters;

    /**
     * The Work Profile Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName(value = "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", alternate = {"WorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout"})
    @Expose
	@Nullable
    public Integer workProfilePasswordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Work Profile Password Previous Password Block Count.
     * Number of previous work profile passwords to block. Valid values 0 to 24
     */
    @SerializedName(value = "workProfilePasswordPreviousPasswordBlockCount", alternate = {"WorkProfilePasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer workProfilePasswordPreviousPasswordBlockCount;

    /**
     * The Work Profile Password Required Type.
     * Type of work profile password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
     */
    @SerializedName(value = "workProfilePasswordRequiredType", alternate = {"WorkProfilePasswordRequiredType"})
    @Expose
	@Nullable
    public AndroidWorkProfileRequiredPasswordType workProfilePasswordRequiredType;

    /**
     * The Work Profile Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     */
    @SerializedName(value = "workProfilePasswordSignInFailureCountBeforeFactoryReset", alternate = {"WorkProfilePasswordSignInFailureCountBeforeFactoryReset"})
    @Expose
	@Nullable
    public Integer workProfilePasswordSignInFailureCountBeforeFactoryReset;

    /**
     * The Work Profile Require Password.
     * Password is required or not for work profile
     */
    @SerializedName(value = "workProfileRequirePassword", alternate = {"WorkProfileRequirePassword"})
    @Expose
	@Nullable
    public Boolean workProfileRequirePassword;


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
