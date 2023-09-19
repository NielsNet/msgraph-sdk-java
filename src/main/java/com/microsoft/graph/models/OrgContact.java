package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrgContact extends DirectoryObject implements Parsable {
    /**
     * Postal addresses for this organizational contact. For now a contact can only have one physical address.
     */
    private java.util.List<PhysicalOfficeAddress> addresses;
    /**
     * Name of the company that this organizational contact belongs to.  Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     */
    private String companyName;
    /**
     * The name for the department in which the contact works.  Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     */
    private String department;
    /**
     * The contact's direct reports. (The users and contacts that have their manager property set to this contact.)  Read-only. Nullable. Supports $expand.
     */
    private java.util.List<DirectoryObject> directReports;
    /**
     * Display name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values), $search, and $orderby.
     */
    private String displayName;
    /**
     * First name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     */
    private String givenName;
    /**
     * Job title for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     */
    private String jobTitle;
    /**
     * The SMTP address for the contact, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     */
    private String mail;
    /**
     * Email alias (portion of email address pre-pending the @ symbol) for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     */
    private String mailNickname;
    /**
     * The user or contact that is this contact's manager. Read-only. Supports $expand and $filter (eq) by id.
     */
    private DirectoryObject manager;
    /**
     * Groups that this contact is a member of. Read-only. Nullable. Supports $expand.
     */
    private java.util.List<DirectoryObject> memberOf;
    /**
     * Date and time when this organizational contact was last synchronized from on-premises AD. This date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, not, ge, le, in).
     */
    private OffsetDateTime onPremisesLastSyncDateTime;
    /**
     * List of any synchronization provisioning errors for this organizational contact. Supports $filter (eq, not for category and propertyCausingError), /$count eq 0, /$count ne 0.
     */
    private java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;
    /**
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced and now mastered in Exchange; null if this object has never been synced from an on-premises directory (default).   Supports $filter (eq, ne, not, in, and eq for null values).
     */
    private Boolean onPremisesSyncEnabled;
    /**
     * List of phones for this organizational contact. Phone types can be mobile, business, and businessFax. Only one of each type can ever be present in the collection.
     */
    private java.util.List<Phone> phones;
    /**
     * For example: 'SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'. The any operator is required for filter expressions on multi-valued properties. Supports $filter (eq, not, ge, le, startsWith, /$count eq 0, /$count ne 0).
     */
    private java.util.List<String> proxyAddresses;
    /**
     * The serviceProvisioningErrors property
     */
    private java.util.List<ServiceProvisioningError> serviceProvisioningErrors;
    /**
     * Last name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     */
    private String surname;
    /**
     * Groups that this contact is a member of, including groups that the contact is nested under. Read-only. Nullable.
     */
    private java.util.List<DirectoryObject> transitiveMemberOf;
    /**
     * Instantiates a new orgContact and sets the default values.
     */
    public OrgContact() {
        super();
        this.setOdataType("#microsoft.graph.orgContact");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a orgContact
     */
    @jakarta.annotation.Nonnull
    public static OrgContact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrgContact();
    }
    /**
     * Gets the addresses property value. Postal addresses for this organizational contact. For now a contact can only have one physical address.
     * @return a physicalOfficeAddress
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhysicalOfficeAddress> getAddresses() {
        return this.addresses;
    }
    /**
     * Gets the companyName property value. Name of the company that this organizational contact belongs to.  Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the department property value. The name for the department in which the contact works.  Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * Gets the directReports property value. The contact's direct reports. (The users and contacts that have their manager property set to this contact.)  Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getDirectReports() {
        return this.directReports;
    }
    /**
     * Gets the displayName property value. Display name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values), $search, and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addresses", (n) -> { this.setAddresses(n.getCollectionOfObjectValues(PhysicalOfficeAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("directReports", (n) -> { this.setDirectReports(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("mail", (n) -> { this.setMail(n.getStringValue()); });
        deserializerMap.put("mailNickname", (n) -> { this.setMailNickname(n.getStringValue()); });
        deserializerMap.put("manager", (n) -> { this.setManager(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesLastSyncDateTime", (n) -> { this.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onPremisesProvisioningErrors", (n) -> { this.setOnPremisesProvisioningErrors(n.getCollectionOfObjectValues(OnPremisesProvisioningError::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesSyncEnabled", (n) -> { this.setOnPremisesSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("proxyAddresses", (n) -> { this.setProxyAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("serviceProvisioningErrors", (n) -> { this.setServiceProvisioningErrors(n.getCollectionOfObjectValues(ServiceProvisioningError::createFromDiscriminatorValue)); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("transitiveMemberOf", (n) -> { this.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the givenName property value. First name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * Gets the jobTitle property value. Job title for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the mail property value. The SMTP address for the contact, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMail() {
        return this.mail;
    }
    /**
     * Gets the mailNickname property value. Email alias (portion of email address pre-pending the @ symbol) for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMailNickname() {
        return this.mailNickname;
    }
    /**
     * Gets the manager property value. The user or contact that is this contact's manager. Read-only. Supports $expand and $filter (eq) by id.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getManager() {
        return this.manager;
    }
    /**
     * Gets the memberOf property value. Groups that this contact is a member of. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.memberOf;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. Date and time when this organizational contact was last synchronized from on-premises AD. This date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, not, ge, le, in).
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this.onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesProvisioningErrors property value. List of any synchronization provisioning errors for this organizational contact. Supports $filter (eq, not for category and propertyCausingError), /$count eq 0, /$count ne 0.
     * @return a onPremisesProvisioningError
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesProvisioningError> getOnPremisesProvisioningErrors() {
        return this.onPremisesProvisioningErrors;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced and now mastered in Exchange; null if this object has never been synced from an on-premises directory (default).   Supports $filter (eq, ne, not, in, and eq for null values).
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this.onPremisesSyncEnabled;
    }
    /**
     * Gets the phones property value. List of phones for this organizational contact. Phone types can be mobile, business, and businessFax. Only one of each type can ever be present in the collection.
     * @return a phone
     */
    @jakarta.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.phones;
    }
    /**
     * Gets the proxyAddresses property value. For example: 'SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'. The any operator is required for filter expressions on multi-valued properties. Supports $filter (eq, not, ge, le, startsWith, /$count eq 0, /$count ne 0).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProxyAddresses() {
        return this.proxyAddresses;
    }
    /**
     * Gets the serviceProvisioningErrors property value. The serviceProvisioningErrors property
     * @return a serviceProvisioningError
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceProvisioningError> getServiceProvisioningErrors() {
        return this.serviceProvisioningErrors;
    }
    /**
     * Gets the surname property value. Last name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.surname;
    }
    /**
     * Gets the transitiveMemberOf property value. Groups that this contact is a member of, including groups that the contact is nested under. Read-only. Nullable.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this.transitiveMemberOf;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("addresses", this.getAddresses());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeCollectionOfObjectValues("directReports", this.getDirectReports());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("mail", this.getMail());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeObjectValue("manager", this.getManager());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeCollectionOfObjectValues("onPremisesProvisioningErrors", this.getOnPremisesProvisioningErrors());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeCollectionOfPrimitiveValues("proxyAddresses", this.getProxyAddresses());
        writer.writeCollectionOfObjectValues("serviceProvisioningErrors", this.getServiceProvisioningErrors());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
    }
    /**
     * Sets the addresses property value. Postal addresses for this organizational contact. For now a contact can only have one physical address.
     * @param value Value to set for the addresses property.
     */
    public void setAddresses(@jakarta.annotation.Nullable final java.util.List<PhysicalOfficeAddress> value) {
        this.addresses = value;
    }
    /**
     * Sets the companyName property value. Name of the company that this organizational contact belongs to.  Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the department property value. The name for the department in which the contact works.  Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the directReports property value. The contact's direct reports. (The users and contacts that have their manager property set to this contact.)  Read-only. Nullable. Supports $expand.
     * @param value Value to set for the directReports property.
     */
    public void setDirectReports(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.directReports = value;
    }
    /**
     * Sets the displayName property value. Display name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values), $search, and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the givenName property value. First name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @param value Value to set for the givenName property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.givenName = value;
    }
    /**
     * Sets the jobTitle property value. Job title for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the mail property value. The SMTP address for the contact, for example, 'jeff@contoso.onmicrosoft.com'. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @param value Value to set for the mail property.
     */
    public void setMail(@jakarta.annotation.Nullable final String value) {
        this.mail = value;
    }
    /**
     * Sets the mailNickname property value. Email alias (portion of email address pre-pending the @ symbol) for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @param value Value to set for the mailNickname property.
     */
    public void setMailNickname(@jakarta.annotation.Nullable final String value) {
        this.mailNickname = value;
    }
    /**
     * Sets the manager property value. The user or contact that is this contact's manager. Read-only. Supports $expand and $filter (eq) by id.
     * @param value Value to set for the manager property.
     */
    public void setManager(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.manager = value;
    }
    /**
     * Sets the memberOf property value. Groups that this contact is a member of. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     */
    public void setMemberOf(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.memberOf = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. Date and time when this organizational contact was last synchronized from on-premises AD. This date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, not, ge, le, in).
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     */
    public void setOnPremisesLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesProvisioningErrors property value. List of any synchronization provisioning errors for this organizational contact. Supports $filter (eq, not for category and propertyCausingError), /$count eq 0, /$count ne 0.
     * @param value Value to set for the onPremisesProvisioningErrors property.
     */
    public void setOnPremisesProvisioningErrors(@jakarta.annotation.Nullable final java.util.List<OnPremisesProvisioningError> value) {
        this.onPremisesProvisioningErrors = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced and now mastered in Exchange; null if this object has never been synced from an on-premises directory (default).   Supports $filter (eq, ne, not, in, and eq for null values).
     * @param value Value to set for the onPremisesSyncEnabled property.
     */
    public void setOnPremisesSyncEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.onPremisesSyncEnabled = value;
    }
    /**
     * Sets the phones property value. List of phones for this organizational contact. Phone types can be mobile, business, and businessFax. Only one of each type can ever be present in the collection.
     * @param value Value to set for the phones property.
     */
    public void setPhones(@jakarta.annotation.Nullable final java.util.List<Phone> value) {
        this.phones = value;
    }
    /**
     * Sets the proxyAddresses property value. For example: 'SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'. The any operator is required for filter expressions on multi-valued properties. Supports $filter (eq, not, ge, le, startsWith, /$count eq 0, /$count ne 0).
     * @param value Value to set for the proxyAddresses property.
     */
    public void setProxyAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.proxyAddresses = value;
    }
    /**
     * Sets the serviceProvisioningErrors property value. The serviceProvisioningErrors property
     * @param value Value to set for the serviceProvisioningErrors property.
     */
    public void setServiceProvisioningErrors(@jakarta.annotation.Nullable final java.util.List<ServiceProvisioningError> value) {
        this.serviceProvisioningErrors = value;
    }
    /**
     * Sets the surname property value. Last name for this organizational contact. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq for null values).
     * @param value Value to set for the surname property.
     */
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.surname = value;
    }
    /**
     * Sets the transitiveMemberOf property value. Groups that this contact is a member of, including groups that the contact is nested under. Read-only. Nullable.
     * @param value Value to set for the transitiveMemberOf property.
     */
    public void setTransitiveMemberOf(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.transitiveMemberOf = value;
    }
}
