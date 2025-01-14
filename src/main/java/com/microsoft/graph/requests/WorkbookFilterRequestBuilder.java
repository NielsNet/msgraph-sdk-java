// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookFilter;
import com.microsoft.graph.models.WorkbookFilterCriteria;
import com.microsoft.graph.models.WorkbookIcon;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.WorkbookFilterApplyParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyBottomItemsFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyBottomPercentFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyCellColorFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyCustomFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyDynamicFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyFontColorFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyIconFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyTopItemsFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyTopPercentFilterParameterSet;
import com.microsoft.graph.models.WorkbookFilterApplyValuesFilterParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Request Builder.
 */
public class WorkbookFilterRequestBuilder extends BaseRequestBuilder<WorkbookFilter> {

    /**
     * The request builder for the WorkbookFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFilterRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WorkbookFilterRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyRequestBuilder apply(@Nonnull final WorkbookFilterApplyParameterSet parameters) {
        return new WorkbookFilterApplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.apply"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyBottomItemsFilterRequestBuilder applyBottomItemsFilter(@Nonnull final WorkbookFilterApplyBottomItemsFilterParameterSet parameters) {
        return new WorkbookFilterApplyBottomItemsFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyBottomItemsFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyBottomPercentFilterRequestBuilder applyBottomPercentFilter(@Nonnull final WorkbookFilterApplyBottomPercentFilterParameterSet parameters) {
        return new WorkbookFilterApplyBottomPercentFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyBottomPercentFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyCellColorFilterRequestBuilder applyCellColorFilter(@Nonnull final WorkbookFilterApplyCellColorFilterParameterSet parameters) {
        return new WorkbookFilterApplyCellColorFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyCellColorFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyCustomFilterRequestBuilder applyCustomFilter(@Nonnull final WorkbookFilterApplyCustomFilterParameterSet parameters) {
        return new WorkbookFilterApplyCustomFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyCustomFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyDynamicFilterRequestBuilder applyDynamicFilter(@Nonnull final WorkbookFilterApplyDynamicFilterParameterSet parameters) {
        return new WorkbookFilterApplyDynamicFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyDynamicFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyFontColorFilterRequestBuilder applyFontColorFilter(@Nonnull final WorkbookFilterApplyFontColorFilterParameterSet parameters) {
        return new WorkbookFilterApplyFontColorFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyFontColorFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyIconFilterRequestBuilder applyIconFilter(@Nonnull final WorkbookFilterApplyIconFilterParameterSet parameters) {
        return new WorkbookFilterApplyIconFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyIconFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyTopItemsFilterRequestBuilder applyTopItemsFilter(@Nonnull final WorkbookFilterApplyTopItemsFilterParameterSet parameters) {
        return new WorkbookFilterApplyTopItemsFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyTopItemsFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyTopPercentFilterRequestBuilder applyTopPercentFilter(@Nonnull final WorkbookFilterApplyTopPercentFilterParameterSet parameters) {
        return new WorkbookFilterApplyTopPercentFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyTopPercentFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFilterApplyValuesFilterRequestBuilder applyValuesFilter(@Nonnull final WorkbookFilterApplyValuesFilterParameterSet parameters) {
        return new WorkbookFilterApplyValuesFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyValuesFilter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookFilterClearRequestBuilder clear() {
        return new WorkbookFilterClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null);
    }
}
