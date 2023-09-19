package com.microsoft.graph.models.termstore;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Relation extends Entity implements Parsable {
    /**
     * The from [term] of the relation. The term from which the relationship is defined. A null value would indicate the relation is directly with the [set].
     */
    private Term fromTerm;
    /**
     * The type of relation. Possible values are: pin, reuse.
     */
    private RelationType relationship;
    /**
     * The [set] in which the relation is relevant.
     */
    private Set set;
    /**
     * The to [term] of the relation. The term to which the relationship is defined.
     */
    private Term toTerm;
    /**
     * Instantiates a new relation and sets the default values.
     */
    public Relation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a relation
     */
    @jakarta.annotation.Nonnull
    public static Relation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Relation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fromTerm", (n) -> { this.setFromTerm(n.getObjectValue(Term::createFromDiscriminatorValue)); });
        deserializerMap.put("relationship", (n) -> { this.setRelationship(n.getEnumValue(RelationType.class)); });
        deserializerMap.put("set", (n) -> { this.setSet(n.getObjectValue(Set::createFromDiscriminatorValue)); });
        deserializerMap.put("toTerm", (n) -> { this.setToTerm(n.getObjectValue(Term::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fromTerm property value. The from [term] of the relation. The term from which the relationship is defined. A null value would indicate the relation is directly with the [set].
     * @return a term
     */
    @jakarta.annotation.Nullable
    public Term getFromTerm() {
        return this.fromTerm;
    }
    /**
     * Gets the relationship property value. The type of relation. Possible values are: pin, reuse.
     * @return a relationType
     */
    @jakarta.annotation.Nullable
    public RelationType getRelationship() {
        return this.relationship;
    }
    /**
     * Gets the set property value. The [set] in which the relation is relevant.
     * @return a set
     */
    @jakarta.annotation.Nullable
    public Set getSet() {
        return this.set;
    }
    /**
     * Gets the toTerm property value. The to [term] of the relation. The term to which the relationship is defined.
     * @return a term
     */
    @jakarta.annotation.Nullable
    public Term getToTerm() {
        return this.toTerm;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fromTerm", this.getFromTerm());
        writer.writeEnumValue("relationship", this.getRelationship());
        writer.writeObjectValue("set", this.getSet());
        writer.writeObjectValue("toTerm", this.getToTerm());
    }
    /**
     * Sets the fromTerm property value. The from [term] of the relation. The term from which the relationship is defined. A null value would indicate the relation is directly with the [set].
     * @param value Value to set for the fromTerm property.
     */
    public void setFromTerm(@jakarta.annotation.Nullable final Term value) {
        this.fromTerm = value;
    }
    /**
     * Sets the relationship property value. The type of relation. Possible values are: pin, reuse.
     * @param value Value to set for the relationship property.
     */
    public void setRelationship(@jakarta.annotation.Nullable final RelationType value) {
        this.relationship = value;
    }
    /**
     * Sets the set property value. The [set] in which the relation is relevant.
     * @param value Value to set for the set property.
     */
    public void setSet(@jakarta.annotation.Nullable final Set value) {
        this.set = value;
    }
    /**
     * Sets the toTerm property value. The to [term] of the relation. The term to which the relationship is defined.
     * @param value Value to set for the toTerm property.
     */
    public void setToTerm(@jakarta.annotation.Nullable final Term value) {
        this.toTerm = value;
    }
}