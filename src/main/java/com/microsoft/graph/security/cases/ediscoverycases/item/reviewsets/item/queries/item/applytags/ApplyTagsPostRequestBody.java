package microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.queries.item.applytags;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.security.EdiscoveryReviewTag;
/** Provides operations to call the applyTags method. */
public class ApplyTagsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The tagsToAdd property */
    private java.util.List<EdiscoveryReviewTag> _tagsToAdd;
    /** The tagsToRemove property */
    private java.util.List<EdiscoveryReviewTag> _tagsToRemove;
    /**
     * Instantiates a new applyTagsPostRequestBody and sets the default values.
     * @return a void
     */
    public ApplyTagsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applyTagsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ApplyTagsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyTagsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplyTagsPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("tagsToAdd", (n) -> { currentObject.setTagsToAdd(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
            this.put("tagsToRemove", (n) -> { currentObject.setTagsToRemove(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the tagsToAdd property value. The tagsToAdd property
     * @return a ediscoveryReviewTag
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTagsToAdd() {
        return this._tagsToAdd;
    }
    /**
     * Gets the tagsToRemove property value. The tagsToRemove property
     * @return a ediscoveryReviewTag
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTagsToRemove() {
        return this._tagsToRemove;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("tagsToAdd", this.getTagsToAdd());
        writer.writeCollectionOfObjectValues("tagsToRemove", this.getTagsToRemove());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the tagsToAdd property value. The tagsToAdd property
     * @param value Value to set for the tagsToAdd property.
     * @return a void
     */
    public void setTagsToAdd(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this._tagsToAdd = value;
    }
    /**
     * Sets the tagsToRemove property value. The tagsToRemove property
     * @param value Value to set for the tagsToRemove property.
     * @return a void
     */
    public void setTagsToRemove(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this._tagsToRemove = value;
    }
}
