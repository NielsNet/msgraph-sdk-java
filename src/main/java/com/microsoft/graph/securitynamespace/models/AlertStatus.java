// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Alert Status.
*/
public enum AlertStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * new
    */
    NEW,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * resolved
    */
    RESOLVED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AlertStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
