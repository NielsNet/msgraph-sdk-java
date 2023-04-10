package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CalendarRoleType implements ValuedEnum {
    None("none"),
    FreeBusyRead("freeBusyRead"),
    LimitedRead("limitedRead"),
    Read("read"),
    Write("write"),
    DelegateWithoutPrivateEventAccess("delegateWithoutPrivateEventAccess"),
    DelegateWithPrivateEventAccess("delegateWithPrivateEventAccess"),
    Custom("custom");
    public final String value;
    CalendarRoleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CalendarRoleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "freeBusyRead": return FreeBusyRead;
            case "limitedRead": return LimitedRead;
            case "read": return Read;
            case "write": return Write;
            case "delegateWithoutPrivateEventAccess": return DelegateWithoutPrivateEventAccess;
            case "delegateWithPrivateEventAccess": return DelegateWithPrivateEventAccess;
            case "custom": return Custom;
            default: return null;
        }
    }
}
