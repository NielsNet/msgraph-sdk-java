package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeRuleMembers extends SubjectSet implements Parsable {
    /** The description property */
    private String _description;
    /** The membershipRule property */
    private String _membershipRule;
    /**
     * Instantiates a new AttributeRuleMembers and sets the default values.
     * @return a void
     */
    public AttributeRuleMembers() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttributeRuleMembers
     */
    @javax.annotation.Nonnull
    public static AttributeRuleMembers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeRuleMembers();
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttributeRuleMembers currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("membershipRule", (n) -> { currentObject.setMembershipRule(n.getStringValue()); });
        }};
    }
    /**
     * Gets the membershipRule property value. The membershipRule property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMembershipRule() {
        return this._membershipRule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("membershipRule", this.getMembershipRule());
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the membershipRule property value. The membershipRule property
     * @param value Value to set for the membershipRule property.
     * @return a void
     */
    public void setMembershipRule(@javax.annotation.Nullable final String value) {
        this._membershipRule = value;
    }
}
