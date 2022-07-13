package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleEligibilityScheduleRequest extends Request implements Parsable {
    /** Represents the type of operation on the role eligibility request. The possible values are: AdminAssign: For administrators to assign eligible roles to principals.AdminRemove: For administrators to remove eligible roles from principals. AdminUpdate: For administrators to change existing role eligibilities.AdminExtend: For administrators to extend expiring role eligibilities.AdminRenew: For administrators to renew expired eligibilities.UserAdd: For users to activate their eligible assignments.UserRemove: For users to deactivate their active eligible assignments.UserExtend: For users to request to extend their expiring eligible assignments.UserRenew: For users to request to renew their expired eligible assignments. */
    private UnifiedRoleScheduleRequestActions _action;
    /** Read-only property with details of the app-specific scope when the role eligibility is scoped to an app. Nullable. Supports $expand. */
    private AppScope _appScope;
    /** Identifier of the app-specific scope when the role eligibility is scoped to an app. The scope of a role eligibility determines the set of resources for which the principal is eligible to access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values). */
    private String _appScopeId;
    /** The directory object that is the scope of the role eligibility. Read-only. Supports $expand. */
    private DirectoryObject _directoryScope;
    /** Identifier of the directory object representing the scope of the role eligibility. The scope of a role eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, ne, and on null values). */
    private String _directoryScopeId;
    /** Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request. */
    private Boolean _isValidationOnly;
    /** A message provided by users and administrators when create they create the unifiedRoleEligibilityScheduleRequest object. */
    private String _justification;
    /** The principal that's getting a role eligibility through the request. Supports $expand. */
    private DirectoryObject _principal;
    /** Identifier of the principal that has been granted the role eligibility. Supports $filter (eq, ne). */
    private String _principalId;
    /** Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property. Supports $expand. */
    private UnifiedRoleDefinition _roleDefinition;
    /** Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne). */
    private String _roleDefinitionId;
    /** The period of the role eligibility. Recurring schedules are currently unsupported. */
    private RequestSchedule _scheduleInfo;
    /** The schedule for a role eligibility that is referenced through the targetScheduleId property. Supports $expand. */
    private UnifiedRoleEligibilitySchedule _targetSchedule;
    /** Identifier of the schedule object that's linked to the eligibility request. Supports $filter (eq, ne). */
    private String _targetScheduleId;
    /** Ticket details linked to the role eligibility request including details of the ticket number and ticket system. Optional. */
    private TicketInfo _ticketInfo;
    /**
     * Instantiates a new UnifiedRoleEligibilityScheduleRequest and sets the default values.
     * @return a void
     */
    public UnifiedRoleEligibilityScheduleRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleEligibilityScheduleRequest
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleEligibilityScheduleRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleEligibilityScheduleRequest();
    }
    /**
     * Gets the action property value. Represents the type of operation on the role eligibility request. The possible values are: AdminAssign: For administrators to assign eligible roles to principals.AdminRemove: For administrators to remove eligible roles from principals. AdminUpdate: For administrators to change existing role eligibilities.AdminExtend: For administrators to extend expiring role eligibilities.AdminRenew: For administrators to renew expired eligibilities.UserAdd: For users to activate their eligible assignments.UserRemove: For users to deactivate their active eligible assignments.UserExtend: For users to request to extend their expiring eligible assignments.UserRenew: For users to request to renew their expired eligible assignments.
     * @return a unifiedRoleScheduleRequestActions
     */
    @javax.annotation.Nullable
    public UnifiedRoleScheduleRequestActions getAction() {
        return this._action;
    }
    /**
     * Gets the appScope property value. Read-only property with details of the app-specific scope when the role eligibility is scoped to an app. Nullable. Supports $expand.
     * @return a appScope
     */
    @javax.annotation.Nullable
    public AppScope getAppScope() {
        return this._appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app-specific scope when the role eligibility is scoped to an app. The scope of a role eligibility determines the set of resources for which the principal is eligible to access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppScopeId() {
        return this._appScopeId;
    }
    /**
     * Gets the directoryScope property value. The directory object that is the scope of the role eligibility. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this._directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the role eligibility. The scope of a role eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, ne, and on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDirectoryScopeId() {
        return this._directoryScopeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleEligibilityScheduleRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(UnifiedRoleScheduleRequestActions.class)); });
            this.put("appScope", (n) -> { currentObject.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
            this.put("appScopeId", (n) -> { currentObject.setAppScopeId(n.getStringValue()); });
            this.put("directoryScope", (n) -> { currentObject.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("directoryScopeId", (n) -> { currentObject.setDirectoryScopeId(n.getStringValue()); });
            this.put("isValidationOnly", (n) -> { currentObject.setIsValidationOnly(n.getBooleanValue()); });
            this.put("justification", (n) -> { currentObject.setJustification(n.getStringValue()); });
            this.put("principal", (n) -> { currentObject.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("principalId", (n) -> { currentObject.setPrincipalId(n.getStringValue()); });
            this.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
            this.put("scheduleInfo", (n) -> { currentObject.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
            this.put("targetSchedule", (n) -> { currentObject.setTargetSchedule(n.getObjectValue(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
            this.put("targetScheduleId", (n) -> { currentObject.setTargetScheduleId(n.getStringValue()); });
            this.put("ticketInfo", (n) -> { currentObject.setTicketInfo(n.getObjectValue(TicketInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isValidationOnly property value. Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this._isValidationOnly;
    }
    /**
     * Gets the justification property value. A message provided by users and administrators when create they create the unifiedRoleEligibilityScheduleRequest object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
    }
    /**
     * Gets the principal property value. The principal that's getting a role eligibility through the request. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this._principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal that has been granted the role eligibility. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this._principalId;
    }
    /**
     * Gets the roleDefinition property value. Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property. Supports $expand.
     * @return a unifiedRoleDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
    }
    /**
     * Gets the scheduleInfo property value. The period of the role eligibility. Recurring schedules are currently unsupported.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this._scheduleInfo;
    }
    /**
     * Gets the targetSchedule property value. The schedule for a role eligibility that is referenced through the targetScheduleId property. Supports $expand.
     * @return a unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilitySchedule getTargetSchedule() {
        return this._targetSchedule;
    }
    /**
     * Gets the targetScheduleId property value. Identifier of the schedule object that's linked to the eligibility request. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetScheduleId() {
        return this._targetScheduleId;
    }
    /**
     * Gets the ticketInfo property value. Ticket details linked to the role eligibility request including details of the ticket number and ticket system. Optional.
     * @return a ticketInfo
     */
    @javax.annotation.Nullable
    public TicketInfo getTicketInfo() {
        return this._ticketInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeObjectValue("appScope", this.getAppScope());
        writer.writeStringValue("appScopeId", this.getAppScopeId());
        writer.writeObjectValue("directoryScope", this.getDirectoryScope());
        writer.writeStringValue("directoryScopeId", this.getDirectoryScopeId());
        writer.writeBooleanValue("isValidationOnly", this.getIsValidationOnly());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeObjectValue("targetSchedule", this.getTargetSchedule());
        writer.writeStringValue("targetScheduleId", this.getTargetScheduleId());
        writer.writeObjectValue("ticketInfo", this.getTicketInfo());
    }
    /**
     * Sets the action property value. Represents the type of operation on the role eligibility request. The possible values are: AdminAssign: For administrators to assign eligible roles to principals.AdminRemove: For administrators to remove eligible roles from principals. AdminUpdate: For administrators to change existing role eligibilities.AdminExtend: For administrators to extend expiring role eligibilities.AdminRenew: For administrators to renew expired eligibilities.UserAdd: For users to activate their eligible assignments.UserRemove: For users to deactivate their active eligible assignments.UserExtend: For users to request to extend their expiring eligible assignments.UserRenew: For users to request to renew their expired eligible assignments.
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final UnifiedRoleScheduleRequestActions value) {
        this._action = value;
    }
    /**
     * Sets the appScope property value. Read-only property with details of the app-specific scope when the role eligibility is scoped to an app. Nullable. Supports $expand.
     * @param value Value to set for the appScope property.
     * @return a void
     */
    public void setAppScope(@javax.annotation.Nullable final AppScope value) {
        this._appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app-specific scope when the role eligibility is scoped to an app. The scope of a role eligibility determines the set of resources for which the principal is eligible to access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values).
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    public void setAppScopeId(@javax.annotation.Nullable final String value) {
        this._appScopeId = value;
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the role eligibility. Read-only. Supports $expand.
     * @param value Value to set for the directoryScope property.
     * @return a void
     */
    public void setDirectoryScope(@javax.annotation.Nullable final DirectoryObject value) {
        this._directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the role eligibility. The scope of a role eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, ne, and on null values).
     * @param value Value to set for the directoryScopeId property.
     * @return a void
     */
    public void setDirectoryScopeId(@javax.annotation.Nullable final String value) {
        this._directoryScopeId = value;
    }
    /**
     * Sets the isValidationOnly property value. Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @param value Value to set for the isValidationOnly property.
     * @return a void
     */
    public void setIsValidationOnly(@javax.annotation.Nullable final Boolean value) {
        this._isValidationOnly = value;
    }
    /**
     * Sets the justification property value. A message provided by users and administrators when create they create the unifiedRoleEligibilityScheduleRequest object.
     * @param value Value to set for the justification property.
     * @return a void
     */
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
    }
    /**
     * Sets the principal property value. The principal that's getting a role eligibility through the request. Supports $expand.
     * @param value Value to set for the principal property.
     * @return a void
     */
    public void setPrincipal(@javax.annotation.Nullable final DirectoryObject value) {
        this._principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal that has been granted the role eligibility. Supports $filter (eq, ne).
     * @param value Value to set for the principalId property.
     * @return a void
     */
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this._principalId = value;
    }
    /**
     * Sets the roleDefinition property value. Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property. Supports $expand.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    public void setRoleDefinition(@javax.annotation.Nullable final UnifiedRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne).
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
    /**
     * Sets the scheduleInfo property value. The period of the role eligibility. Recurring schedules are currently unsupported.
     * @param value Value to set for the scheduleInfo property.
     * @return a void
     */
    public void setScheduleInfo(@javax.annotation.Nullable final RequestSchedule value) {
        this._scheduleInfo = value;
    }
    /**
     * Sets the targetSchedule property value. The schedule for a role eligibility that is referenced through the targetScheduleId property. Supports $expand.
     * @param value Value to set for the targetSchedule property.
     * @return a void
     */
    public void setTargetSchedule(@javax.annotation.Nullable final UnifiedRoleEligibilitySchedule value) {
        this._targetSchedule = value;
    }
    /**
     * Sets the targetScheduleId property value. Identifier of the schedule object that's linked to the eligibility request. Supports $filter (eq, ne).
     * @param value Value to set for the targetScheduleId property.
     * @return a void
     */
    public void setTargetScheduleId(@javax.annotation.Nullable final String value) {
        this._targetScheduleId = value;
    }
    /**
     * Sets the ticketInfo property value. Ticket details linked to the role eligibility request including details of the ticket number and ticket system. Optional.
     * @param value Value to set for the ticketInfo property.
     * @return a void
     */
    public void setTicketInfo(@javax.annotation.Nullable final TicketInfo value) {
        this._ticketInfo = value;
    }
}
