package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaStream implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Codec name used to encode audio for transmission on the network. Possible values are: unknown, invalid, cn, pcma, pcmu, amrWide, g722, g7221, g7221c, g729, multiChannelAudio, muchv2, opus, satin, satinFullband, rtAudio8, rtAudio16, silk, silkNarrow, silkWide, siren, xmsRTA, unknownFutureValue. */
    private AudioCodec _audioCodec;
    /** Average Network Mean Opinion Score degradation for stream. Represents how much the network loss and jitter has impacted the quality of received audio. */
    private Float _averageAudioDegradation;
    /** Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator. */
    private Period _averageAudioNetworkJitter;
    /** Average estimated bandwidth available between two endpoints in bits per second. */
    private Long _averageBandwidthEstimate;
    /** Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator. */
    private Period _averageJitter;
    /** Average packet loss rate for stream. */
    private Float _averagePacketLossRate;
    /** Ratio of the number of audio frames with samples generated by packet loss concealment to the total number of audio frames. */
    private Float _averageRatioOfConcealedSamples;
    /** Average frames per second received for all video streams computed over the duration of the session. */
    private Float _averageReceivedFrameRate;
    /** Average network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator. */
    private Period _averageRoundTripTime;
    /** Average percentage of video frames lost as displayed to the user. */
    private Float _averageVideoFrameLossPercentage;
    /** Average frames per second received for a video stream, computed over the duration of the session. */
    private Float _averageVideoFrameRate;
    /** Average fraction of packets lost, as specified in [RFC 3550][], computed over the duration of the session. */
    private Float _averageVideoPacketLossRate;
    /** UTC time when the stream ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _endDateTime;
    /** Fraction of the call where frame rate is less than 7.5 frames per second. */
    private Float _lowFrameRateRatio;
    /** Fraction of the call that the client is running less than 70% expected video processing capability. */
    private Float _lowVideoProcessingCapabilityRatio;
    /** Maximum of audio network jitter computed over each of the 20 second windows during the session, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator. */
    private Period _maxAudioNetworkJitter;
    /** Maximum jitter for the stream computed as specified in RFC 3550, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator. */
    private Period _maxJitter;
    /** Maximum packet loss rate for the stream. */
    private Float _maxPacketLossRate;
    /** Maximum ratio of packets concealed by the healer. */
    private Float _maxRatioOfConcealedSamples;
    /** Maximum network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator. */
    private Period _maxRoundTripTime;
    /** The OdataType property */
    private String _odataType;
    /** Packet count for the stream. */
    private Long _packetUtilization;
    /** Packet loss rate after FEC has been applied aggregated across all video streams and codecs. */
    private Float _postForwardErrorCorrectionPacketLossRate;
    /** UTC time when the stream started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _startDateTime;
    /** The streamDirection property */
    private MediaStreamDirection _streamDirection;
    /** Unique identifier for the stream. */
    private String _streamId;
    /** Codec name used to encode video for transmission on the network. Possible values are: unknown, invalid, av1, h263, h264, h264s, h264uc, h265, rtvc1, rtVideo, xrtvc1, unknownFutureValue. */
    private VideoCodec _videoCodec;
    /** True if the media stream bypassed the Mediation Server and went straight between client and PSTN Gateway/PBX, false otherwise. */
    private Boolean _wasMediaBypassed;
    /**
     * Instantiates a new mediaStream and sets the default values.
     * @return a void
     */
    public MediaStream() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.callRecords.mediaStream");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaStream
     */
    @javax.annotation.Nonnull
    public static MediaStream createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaStream();
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
     * Gets the audioCodec property value. Codec name used to encode audio for transmission on the network. Possible values are: unknown, invalid, cn, pcma, pcmu, amrWide, g722, g7221, g7221c, g729, multiChannelAudio, muchv2, opus, satin, satinFullband, rtAudio8, rtAudio16, silk, silkNarrow, silkWide, siren, xmsRTA, unknownFutureValue.
     * @return a audioCodec
     */
    @javax.annotation.Nullable
    public AudioCodec getAudioCodec() {
        return this._audioCodec;
    }
    /**
     * Gets the averageAudioDegradation property value. Average Network Mean Opinion Score degradation for stream. Represents how much the network loss and jitter has impacted the quality of received audio.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getAverageAudioDegradation() {
        return this._averageAudioDegradation;
    }
    /**
     * Gets the averageAudioNetworkJitter property value. Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAverageAudioNetworkJitter() {
        return this._averageAudioNetworkJitter;
    }
    /**
     * Gets the averageBandwidthEstimate property value. Average estimated bandwidth available between two endpoints in bits per second.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getAverageBandwidthEstimate() {
        return this._averageBandwidthEstimate;
    }
    /**
     * Gets the averageJitter property value. Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAverageJitter() {
        return this._averageJitter;
    }
    /**
     * Gets the averagePacketLossRate property value. Average packet loss rate for stream.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getAveragePacketLossRate() {
        return this._averagePacketLossRate;
    }
    /**
     * Gets the averageRatioOfConcealedSamples property value. Ratio of the number of audio frames with samples generated by packet loss concealment to the total number of audio frames.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getAverageRatioOfConcealedSamples() {
        return this._averageRatioOfConcealedSamples;
    }
    /**
     * Gets the averageReceivedFrameRate property value. Average frames per second received for all video streams computed over the duration of the session.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getAverageReceivedFrameRate() {
        return this._averageReceivedFrameRate;
    }
    /**
     * Gets the averageRoundTripTime property value. Average network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAverageRoundTripTime() {
        return this._averageRoundTripTime;
    }
    /**
     * Gets the averageVideoFrameLossPercentage property value. Average percentage of video frames lost as displayed to the user.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getAverageVideoFrameLossPercentage() {
        return this._averageVideoFrameLossPercentage;
    }
    /**
     * Gets the averageVideoFrameRate property value. Average frames per second received for a video stream, computed over the duration of the session.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getAverageVideoFrameRate() {
        return this._averageVideoFrameRate;
    }
    /**
     * Gets the averageVideoPacketLossRate property value. Average fraction of packets lost, as specified in [RFC 3550][], computed over the duration of the session.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getAverageVideoPacketLossRate() {
        return this._averageVideoPacketLossRate;
    }
    /**
     * Gets the endDateTime property value. UTC time when the stream ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MediaStream currentObject = this;
        return new HashMap<>(28) {{
            this.put("audioCodec", (n) -> { currentObject.setAudioCodec(n.getEnumValue(AudioCodec.class)); });
            this.put("averageAudioDegradation", (n) -> { currentObject.setAverageAudioDegradation(n.getFloatValue()); });
            this.put("averageAudioNetworkJitter", (n) -> { currentObject.setAverageAudioNetworkJitter(n.getPeriodValue()); });
            this.put("averageBandwidthEstimate", (n) -> { currentObject.setAverageBandwidthEstimate(n.getLongValue()); });
            this.put("averageJitter", (n) -> { currentObject.setAverageJitter(n.getPeriodValue()); });
            this.put("averagePacketLossRate", (n) -> { currentObject.setAveragePacketLossRate(n.getFloatValue()); });
            this.put("averageRatioOfConcealedSamples", (n) -> { currentObject.setAverageRatioOfConcealedSamples(n.getFloatValue()); });
            this.put("averageReceivedFrameRate", (n) -> { currentObject.setAverageReceivedFrameRate(n.getFloatValue()); });
            this.put("averageRoundTripTime", (n) -> { currentObject.setAverageRoundTripTime(n.getPeriodValue()); });
            this.put("averageVideoFrameLossPercentage", (n) -> { currentObject.setAverageVideoFrameLossPercentage(n.getFloatValue()); });
            this.put("averageVideoFrameRate", (n) -> { currentObject.setAverageVideoFrameRate(n.getFloatValue()); });
            this.put("averageVideoPacketLossRate", (n) -> { currentObject.setAverageVideoPacketLossRate(n.getFloatValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("lowFrameRateRatio", (n) -> { currentObject.setLowFrameRateRatio(n.getFloatValue()); });
            this.put("lowVideoProcessingCapabilityRatio", (n) -> { currentObject.setLowVideoProcessingCapabilityRatio(n.getFloatValue()); });
            this.put("maxAudioNetworkJitter", (n) -> { currentObject.setMaxAudioNetworkJitter(n.getPeriodValue()); });
            this.put("maxJitter", (n) -> { currentObject.setMaxJitter(n.getPeriodValue()); });
            this.put("maxPacketLossRate", (n) -> { currentObject.setMaxPacketLossRate(n.getFloatValue()); });
            this.put("maxRatioOfConcealedSamples", (n) -> { currentObject.setMaxRatioOfConcealedSamples(n.getFloatValue()); });
            this.put("maxRoundTripTime", (n) -> { currentObject.setMaxRoundTripTime(n.getPeriodValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("packetUtilization", (n) -> { currentObject.setPacketUtilization(n.getLongValue()); });
            this.put("postForwardErrorCorrectionPacketLossRate", (n) -> { currentObject.setPostForwardErrorCorrectionPacketLossRate(n.getFloatValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("streamDirection", (n) -> { currentObject.setStreamDirection(n.getEnumValue(MediaStreamDirection.class)); });
            this.put("streamId", (n) -> { currentObject.setStreamId(n.getStringValue()); });
            this.put("videoCodec", (n) -> { currentObject.setVideoCodec(n.getEnumValue(VideoCodec.class)); });
            this.put("wasMediaBypassed", (n) -> { currentObject.setWasMediaBypassed(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the lowFrameRateRatio property value. Fraction of the call where frame rate is less than 7.5 frames per second.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getLowFrameRateRatio() {
        return this._lowFrameRateRatio;
    }
    /**
     * Gets the lowVideoProcessingCapabilityRatio property value. Fraction of the call that the client is running less than 70% expected video processing capability.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getLowVideoProcessingCapabilityRatio() {
        return this._lowVideoProcessingCapabilityRatio;
    }
    /**
     * Gets the maxAudioNetworkJitter property value. Maximum of audio network jitter computed over each of the 20 second windows during the session, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaxAudioNetworkJitter() {
        return this._maxAudioNetworkJitter;
    }
    /**
     * Gets the maxJitter property value. Maximum jitter for the stream computed as specified in RFC 3550, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaxJitter() {
        return this._maxJitter;
    }
    /**
     * Gets the maxPacketLossRate property value. Maximum packet loss rate for the stream.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getMaxPacketLossRate() {
        return this._maxPacketLossRate;
    }
    /**
     * Gets the maxRatioOfConcealedSamples property value. Maximum ratio of packets concealed by the healer.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getMaxRatioOfConcealedSamples() {
        return this._maxRatioOfConcealedSamples;
    }
    /**
     * Gets the maxRoundTripTime property value. Maximum network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaxRoundTripTime() {
        return this._maxRoundTripTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the packetUtilization property value. Packet count for the stream.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPacketUtilization() {
        return this._packetUtilization;
    }
    /**
     * Gets the postForwardErrorCorrectionPacketLossRate property value. Packet loss rate after FEC has been applied aggregated across all video streams and codecs.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getPostForwardErrorCorrectionPacketLossRate() {
        return this._postForwardErrorCorrectionPacketLossRate;
    }
    /**
     * Gets the startDateTime property value. UTC time when the stream started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the streamDirection property value. The streamDirection property
     * @return a mediaStreamDirection
     */
    @javax.annotation.Nullable
    public MediaStreamDirection getStreamDirection() {
        return this._streamDirection;
    }
    /**
     * Gets the streamId property value. Unique identifier for the stream.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStreamId() {
        return this._streamId;
    }
    /**
     * Gets the videoCodec property value. Codec name used to encode video for transmission on the network. Possible values are: unknown, invalid, av1, h263, h264, h264s, h264uc, h265, rtvc1, rtVideo, xrtvc1, unknownFutureValue.
     * @return a videoCodec
     */
    @javax.annotation.Nullable
    public VideoCodec getVideoCodec() {
        return this._videoCodec;
    }
    /**
     * Gets the wasMediaBypassed property value. True if the media stream bypassed the Mediation Server and went straight between client and PSTN Gateway/PBX, false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWasMediaBypassed() {
        return this._wasMediaBypassed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("audioCodec", this.getAudioCodec());
        writer.writeFloatValue("averageAudioDegradation", this.getAverageAudioDegradation());
        writer.writePeriodValue("averageAudioNetworkJitter", this.getAverageAudioNetworkJitter());
        writer.writeLongValue("averageBandwidthEstimate", this.getAverageBandwidthEstimate());
        writer.writePeriodValue("averageJitter", this.getAverageJitter());
        writer.writeFloatValue("averagePacketLossRate", this.getAveragePacketLossRate());
        writer.writeFloatValue("averageRatioOfConcealedSamples", this.getAverageRatioOfConcealedSamples());
        writer.writeFloatValue("averageReceivedFrameRate", this.getAverageReceivedFrameRate());
        writer.writePeriodValue("averageRoundTripTime", this.getAverageRoundTripTime());
        writer.writeFloatValue("averageVideoFrameLossPercentage", this.getAverageVideoFrameLossPercentage());
        writer.writeFloatValue("averageVideoFrameRate", this.getAverageVideoFrameRate());
        writer.writeFloatValue("averageVideoPacketLossRate", this.getAverageVideoPacketLossRate());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeFloatValue("lowFrameRateRatio", this.getLowFrameRateRatio());
        writer.writeFloatValue("lowVideoProcessingCapabilityRatio", this.getLowVideoProcessingCapabilityRatio());
        writer.writePeriodValue("maxAudioNetworkJitter", this.getMaxAudioNetworkJitter());
        writer.writePeriodValue("maxJitter", this.getMaxJitter());
        writer.writeFloatValue("maxPacketLossRate", this.getMaxPacketLossRate());
        writer.writeFloatValue("maxRatioOfConcealedSamples", this.getMaxRatioOfConcealedSamples());
        writer.writePeriodValue("maxRoundTripTime", this.getMaxRoundTripTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("packetUtilization", this.getPacketUtilization());
        writer.writeFloatValue("postForwardErrorCorrectionPacketLossRate", this.getPostForwardErrorCorrectionPacketLossRate());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("streamDirection", this.getStreamDirection());
        writer.writeStringValue("streamId", this.getStreamId());
        writer.writeEnumValue("videoCodec", this.getVideoCodec());
        writer.writeBooleanValue("wasMediaBypassed", this.getWasMediaBypassed());
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
     * Sets the audioCodec property value. Codec name used to encode audio for transmission on the network. Possible values are: unknown, invalid, cn, pcma, pcmu, amrWide, g722, g7221, g7221c, g729, multiChannelAudio, muchv2, opus, satin, satinFullband, rtAudio8, rtAudio16, silk, silkNarrow, silkWide, siren, xmsRTA, unknownFutureValue.
     * @param value Value to set for the audioCodec property.
     * @return a void
     */
    public void setAudioCodec(@javax.annotation.Nullable final AudioCodec value) {
        this._audioCodec = value;
    }
    /**
     * Sets the averageAudioDegradation property value. Average Network Mean Opinion Score degradation for stream. Represents how much the network loss and jitter has impacted the quality of received audio.
     * @param value Value to set for the averageAudioDegradation property.
     * @return a void
     */
    public void setAverageAudioDegradation(@javax.annotation.Nullable final Float value) {
        this._averageAudioDegradation = value;
    }
    /**
     * Sets the averageAudioNetworkJitter property value. Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the averageAudioNetworkJitter property.
     * @return a void
     */
    public void setAverageAudioNetworkJitter(@javax.annotation.Nullable final Period value) {
        this._averageAudioNetworkJitter = value;
    }
    /**
     * Sets the averageBandwidthEstimate property value. Average estimated bandwidth available between two endpoints in bits per second.
     * @param value Value to set for the averageBandwidthEstimate property.
     * @return a void
     */
    public void setAverageBandwidthEstimate(@javax.annotation.Nullable final Long value) {
        this._averageBandwidthEstimate = value;
    }
    /**
     * Sets the averageJitter property value. Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the averageJitter property.
     * @return a void
     */
    public void setAverageJitter(@javax.annotation.Nullable final Period value) {
        this._averageJitter = value;
    }
    /**
     * Sets the averagePacketLossRate property value. Average packet loss rate for stream.
     * @param value Value to set for the averagePacketLossRate property.
     * @return a void
     */
    public void setAveragePacketLossRate(@javax.annotation.Nullable final Float value) {
        this._averagePacketLossRate = value;
    }
    /**
     * Sets the averageRatioOfConcealedSamples property value. Ratio of the number of audio frames with samples generated by packet loss concealment to the total number of audio frames.
     * @param value Value to set for the averageRatioOfConcealedSamples property.
     * @return a void
     */
    public void setAverageRatioOfConcealedSamples(@javax.annotation.Nullable final Float value) {
        this._averageRatioOfConcealedSamples = value;
    }
    /**
     * Sets the averageReceivedFrameRate property value. Average frames per second received for all video streams computed over the duration of the session.
     * @param value Value to set for the averageReceivedFrameRate property.
     * @return a void
     */
    public void setAverageReceivedFrameRate(@javax.annotation.Nullable final Float value) {
        this._averageReceivedFrameRate = value;
    }
    /**
     * Sets the averageRoundTripTime property value. Average network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the averageRoundTripTime property.
     * @return a void
     */
    public void setAverageRoundTripTime(@javax.annotation.Nullable final Period value) {
        this._averageRoundTripTime = value;
    }
    /**
     * Sets the averageVideoFrameLossPercentage property value. Average percentage of video frames lost as displayed to the user.
     * @param value Value to set for the averageVideoFrameLossPercentage property.
     * @return a void
     */
    public void setAverageVideoFrameLossPercentage(@javax.annotation.Nullable final Float value) {
        this._averageVideoFrameLossPercentage = value;
    }
    /**
     * Sets the averageVideoFrameRate property value. Average frames per second received for a video stream, computed over the duration of the session.
     * @param value Value to set for the averageVideoFrameRate property.
     * @return a void
     */
    public void setAverageVideoFrameRate(@javax.annotation.Nullable final Float value) {
        this._averageVideoFrameRate = value;
    }
    /**
     * Sets the averageVideoPacketLossRate property value. Average fraction of packets lost, as specified in [RFC 3550][], computed over the duration of the session.
     * @param value Value to set for the averageVideoPacketLossRate property.
     * @return a void
     */
    public void setAverageVideoPacketLossRate(@javax.annotation.Nullable final Float value) {
        this._averageVideoPacketLossRate = value;
    }
    /**
     * Sets the endDateTime property value. UTC time when the stream ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the lowFrameRateRatio property value. Fraction of the call where frame rate is less than 7.5 frames per second.
     * @param value Value to set for the lowFrameRateRatio property.
     * @return a void
     */
    public void setLowFrameRateRatio(@javax.annotation.Nullable final Float value) {
        this._lowFrameRateRatio = value;
    }
    /**
     * Sets the lowVideoProcessingCapabilityRatio property value. Fraction of the call that the client is running less than 70% expected video processing capability.
     * @param value Value to set for the lowVideoProcessingCapabilityRatio property.
     * @return a void
     */
    public void setLowVideoProcessingCapabilityRatio(@javax.annotation.Nullable final Float value) {
        this._lowVideoProcessingCapabilityRatio = value;
    }
    /**
     * Sets the maxAudioNetworkJitter property value. Maximum of audio network jitter computed over each of the 20 second windows during the session, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the maxAudioNetworkJitter property.
     * @return a void
     */
    public void setMaxAudioNetworkJitter(@javax.annotation.Nullable final Period value) {
        this._maxAudioNetworkJitter = value;
    }
    /**
     * Sets the maxJitter property value. Maximum jitter for the stream computed as specified in RFC 3550, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the maxJitter property.
     * @return a void
     */
    public void setMaxJitter(@javax.annotation.Nullable final Period value) {
        this._maxJitter = value;
    }
    /**
     * Sets the maxPacketLossRate property value. Maximum packet loss rate for the stream.
     * @param value Value to set for the maxPacketLossRate property.
     * @return a void
     */
    public void setMaxPacketLossRate(@javax.annotation.Nullable final Float value) {
        this._maxPacketLossRate = value;
    }
    /**
     * Sets the maxRatioOfConcealedSamples property value. Maximum ratio of packets concealed by the healer.
     * @param value Value to set for the maxRatioOfConcealedSamples property.
     * @return a void
     */
    public void setMaxRatioOfConcealedSamples(@javax.annotation.Nullable final Float value) {
        this._maxRatioOfConcealedSamples = value;
    }
    /**
     * Sets the maxRoundTripTime property value. Maximum network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     * @param value Value to set for the maxRoundTripTime property.
     * @return a void
     */
    public void setMaxRoundTripTime(@javax.annotation.Nullable final Period value) {
        this._maxRoundTripTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the packetUtilization property value. Packet count for the stream.
     * @param value Value to set for the packetUtilization property.
     * @return a void
     */
    public void setPacketUtilization(@javax.annotation.Nullable final Long value) {
        this._packetUtilization = value;
    }
    /**
     * Sets the postForwardErrorCorrectionPacketLossRate property value. Packet loss rate after FEC has been applied aggregated across all video streams and codecs.
     * @param value Value to set for the postForwardErrorCorrectionPacketLossRate property.
     * @return a void
     */
    public void setPostForwardErrorCorrectionPacketLossRate(@javax.annotation.Nullable final Float value) {
        this._postForwardErrorCorrectionPacketLossRate = value;
    }
    /**
     * Sets the startDateTime property value. UTC time when the stream started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the streamDirection property value. The streamDirection property
     * @param value Value to set for the streamDirection property.
     * @return a void
     */
    public void setStreamDirection(@javax.annotation.Nullable final MediaStreamDirection value) {
        this._streamDirection = value;
    }
    /**
     * Sets the streamId property value. Unique identifier for the stream.
     * @param value Value to set for the streamId property.
     * @return a void
     */
    public void setStreamId(@javax.annotation.Nullable final String value) {
        this._streamId = value;
    }
    /**
     * Sets the videoCodec property value. Codec name used to encode video for transmission on the network. Possible values are: unknown, invalid, av1, h263, h264, h264s, h264uc, h265, rtvc1, rtVideo, xrtvc1, unknownFutureValue.
     * @param value Value to set for the videoCodec property.
     * @return a void
     */
    public void setVideoCodec(@javax.annotation.Nullable final VideoCodec value) {
        this._videoCodec = value;
    }
    /**
     * Sets the wasMediaBypassed property value. True if the media stream bypassed the Mediation Server and went straight between client and PSTN Gateway/PBX, false otherwise.
     * @param value Value to set for the wasMediaBypassed property.
     * @return a void
     */
    public void setWasMediaBypassed(@javax.annotation.Nullable final Boolean value) {
        this._wasMediaBypassed = value;
    }
}