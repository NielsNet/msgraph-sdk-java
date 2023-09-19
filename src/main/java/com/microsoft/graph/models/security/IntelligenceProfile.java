package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntelligenceProfile extends Entity implements Parsable {
    /**
     * A list of commonly-known aliases for the threat intelligence included in the intelligenceProfile.
     */
    private java.util.List<String> aliases;
    /**
     * The country/region of origin for the given actor or threat associated with this intelligenceProfile.
     */
    private java.util.List<IntelligenceProfileCountryOrRegionOfOrigin> countriesOrRegionsOfOrigin;
    /**
     * The description property
     */
    private FormattedContent description;
    /**
     * The date and time when this intelligenceProfile was first active. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime firstActiveDateTime;
    /**
     * Includes an assemblage of high-fidelity network indicators of compromise.
     */
    private java.util.List<IntelligenceProfileIndicator> indicators;
    /**
     * The kind property
     */
    private IntelligenceProfileKind kind;
    /**
     * The summary property
     */
    private FormattedContent summary;
    /**
     * Known targets related to this intelligenceProfile.
     */
    private java.util.List<String> targets;
    /**
     * The title of this intelligenceProfile.
     */
    private String title;
    /**
     * Formatted information featuring a description of the distinctive tactics, techniques, and procedures (TTP) of the group, followed by a list of all known custom, commodity, and publicly available implants used by the group.
     */
    private FormattedContent tradecraft;
    /**
     * Instantiates a new intelligenceProfile and sets the default values.
     */
    public IntelligenceProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a intelligenceProfile
     */
    @jakarta.annotation.Nonnull
    public static IntelligenceProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntelligenceProfile();
    }
    /**
     * Gets the aliases property value. A list of commonly-known aliases for the threat intelligence included in the intelligenceProfile.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAliases() {
        return this.aliases;
    }
    /**
     * Gets the countriesOrRegionsOfOrigin property value. The country/region of origin for the given actor or threat associated with this intelligenceProfile.
     * @return a intelligenceProfileCountryOrRegionOfOrigin
     */
    @jakarta.annotation.Nullable
    public java.util.List<IntelligenceProfileCountryOrRegionOfOrigin> getCountriesOrRegionsOfOrigin() {
        return this.countriesOrRegionsOfOrigin;
    }
    /**
     * Gets the description property value. The description property
     * @return a formattedContent
     */
    @jakarta.annotation.Nullable
    public FormattedContent getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aliases", (n) -> { this.setAliases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("countriesOrRegionsOfOrigin", (n) -> { this.setCountriesOrRegionsOfOrigin(n.getCollectionOfObjectValues(IntelligenceProfileCountryOrRegionOfOrigin::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getObjectValue(FormattedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("firstActiveDateTime", (n) -> { this.setFirstActiveDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("indicators", (n) -> { this.setIndicators(n.getCollectionOfObjectValues(IntelligenceProfileIndicator::createFromDiscriminatorValue)); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getEnumValue(IntelligenceProfileKind.class)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getObjectValue(FormattedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("targets", (n) -> { this.setTargets(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("tradecraft", (n) -> { this.setTradecraft(n.getObjectValue(FormattedContent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstActiveDateTime property value. The date and time when this intelligenceProfile was first active. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstActiveDateTime() {
        return this.firstActiveDateTime;
    }
    /**
     * Gets the indicators property value. Includes an assemblage of high-fidelity network indicators of compromise.
     * @return a intelligenceProfileIndicator
     */
    @jakarta.annotation.Nullable
    public java.util.List<IntelligenceProfileIndicator> getIndicators() {
        return this.indicators;
    }
    /**
     * Gets the kind property value. The kind property
     * @return a intelligenceProfileKind
     */
    @jakarta.annotation.Nullable
    public IntelligenceProfileKind getKind() {
        return this.kind;
    }
    /**
     * Gets the summary property value. The summary property
     * @return a formattedContent
     */
    @jakarta.annotation.Nullable
    public FormattedContent getSummary() {
        return this.summary;
    }
    /**
     * Gets the targets property value. Known targets related to this intelligenceProfile.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargets() {
        return this.targets;
    }
    /**
     * Gets the title property value. The title of this intelligenceProfile.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the tradecraft property value. Formatted information featuring a description of the distinctive tactics, techniques, and procedures (TTP) of the group, followed by a list of all known custom, commodity, and publicly available implants used by the group.
     * @return a formattedContent
     */
    @jakarta.annotation.Nullable
    public FormattedContent getTradecraft() {
        return this.tradecraft;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("aliases", this.getAliases());
        writer.writeCollectionOfObjectValues("countriesOrRegionsOfOrigin", this.getCountriesOrRegionsOfOrigin());
        writer.writeObjectValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("firstActiveDateTime", this.getFirstActiveDateTime());
        writer.writeCollectionOfObjectValues("indicators", this.getIndicators());
        writer.writeEnumValue("kind", this.getKind());
        writer.writeObjectValue("summary", this.getSummary());
        writer.writeCollectionOfPrimitiveValues("targets", this.getTargets());
        writer.writeStringValue("title", this.getTitle());
        writer.writeObjectValue("tradecraft", this.getTradecraft());
    }
    /**
     * Sets the aliases property value. A list of commonly-known aliases for the threat intelligence included in the intelligenceProfile.
     * @param value Value to set for the aliases property.
     */
    public void setAliases(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.aliases = value;
    }
    /**
     * Sets the countriesOrRegionsOfOrigin property value. The country/region of origin for the given actor or threat associated with this intelligenceProfile.
     * @param value Value to set for the countriesOrRegionsOfOrigin property.
     */
    public void setCountriesOrRegionsOfOrigin(@jakarta.annotation.Nullable final java.util.List<IntelligenceProfileCountryOrRegionOfOrigin> value) {
        this.countriesOrRegionsOfOrigin = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final FormattedContent value) {
        this.description = value;
    }
    /**
     * Sets the firstActiveDateTime property value. The date and time when this intelligenceProfile was first active. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstActiveDateTime property.
     */
    public void setFirstActiveDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstActiveDateTime = value;
    }
    /**
     * Sets the indicators property value. Includes an assemblage of high-fidelity network indicators of compromise.
     * @param value Value to set for the indicators property.
     */
    public void setIndicators(@jakarta.annotation.Nullable final java.util.List<IntelligenceProfileIndicator> value) {
        this.indicators = value;
    }
    /**
     * Sets the kind property value. The kind property
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final IntelligenceProfileKind value) {
        this.kind = value;
    }
    /**
     * Sets the summary property value. The summary property
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final FormattedContent value) {
        this.summary = value;
    }
    /**
     * Sets the targets property value. Known targets related to this intelligenceProfile.
     * @param value Value to set for the targets property.
     */
    public void setTargets(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.targets = value;
    }
    /**
     * Sets the title property value. The title of this intelligenceProfile.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the tradecraft property value. Formatted information featuring a description of the distinctive tactics, techniques, and procedures (TTP) of the group, followed by a list of all known custom, commodity, and publicly available implants used by the group.
     * @param value Value to set for the tradecraft property.
     */
    public void setTradecraft(@jakarta.annotation.Nullable final FormattedContent value) {
        this.tradecraft = value;
    }
}