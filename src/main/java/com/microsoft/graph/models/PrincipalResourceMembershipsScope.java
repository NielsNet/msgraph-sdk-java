package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrincipalResourceMembershipsScope extends AccessReviewScope implements Parsable {
    /**
     * Defines the scopes of the principals whose access to resources are reviewed in the access review.
     */
    private java.util.List<AccessReviewScope> principalScopes;
    /**
     * Defines the scopes of the resources for which access is reviewed.
     */
    private java.util.List<AccessReviewScope> resourceScopes;
    /**
     * Instantiates a new PrincipalResourceMembershipsScope and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrincipalResourceMembershipsScope() {
        super();
        this.setOdataType("#microsoft.graph.principalResourceMembershipsScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrincipalResourceMembershipsScope
     */
    @javax.annotation.Nonnull
    public static PrincipalResourceMembershipsScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrincipalResourceMembershipsScope();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("principalScopes", (n) -> { this.setPrincipalScopes(n.getCollectionOfObjectValues(AccessReviewScope::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceScopes", (n) -> { this.setResourceScopes(n.getCollectionOfObjectValues(AccessReviewScope::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the principalScopes property value. Defines the scopes of the principals whose access to resources are reviewed in the access review.
     * @return a accessReviewScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewScope> getPrincipalScopes() {
        return this.principalScopes;
    }
    /**
     * Gets the resourceScopes property value. Defines the scopes of the resources for which access is reviewed.
     * @return a accessReviewScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewScope> getResourceScopes() {
        return this.resourceScopes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("principalScopes", this.getPrincipalScopes());
        writer.writeCollectionOfObjectValues("resourceScopes", this.getResourceScopes());
    }
    /**
     * Sets the principalScopes property value. Defines the scopes of the principals whose access to resources are reviewed in the access review.
     * @param value Value to set for the principalScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalScopes(@javax.annotation.Nullable final java.util.List<AccessReviewScope> value) {
        this.principalScopes = value;
    }
    /**
     * Sets the resourceScopes property value. Defines the scopes of the resources for which access is reviewed.
     * @param value Value to set for the resourceScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceScopes(@javax.annotation.Nullable final java.util.List<AccessReviewScope> value) {
        this.resourceScopes = value;
    }
}
