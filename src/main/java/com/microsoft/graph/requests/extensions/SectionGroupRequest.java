// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Section Group Request.
 */
public class SectionGroupRequest extends BaseRequest implements ISectionGroupRequest {
	
    /**
     * The request for the SectionGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SectionGroupRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SectionGroup.class);
    }

    /**
     * Gets the SectionGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SectionGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SectionGroup from the service
     *
     * @return the SectionGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SectionGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SectionGroup> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SectionGroup with a source
     *
     * @param sourceSectionGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SectionGroup sourceSectionGroup, final ICallback<SectionGroup> callback) {
        send(HttpMethod.PATCH, callback, sourceSectionGroup);
    }

    /**
     * Patches this SectionGroup with a source
     *
     * @param sourceSectionGroup the source object with updates
     * @return the updated SectionGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SectionGroup patch(final SectionGroup sourceSectionGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceSectionGroup);
    }

    /**
     * Creates a SectionGroup with a new object
     *
     * @param newSectionGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SectionGroup newSectionGroup, final ICallback<SectionGroup> callback) {
        send(HttpMethod.POST, callback, newSectionGroup);
    }

    /**
     * Creates a SectionGroup with a new object
     *
     * @param newSectionGroup the new object to create
     * @return the created SectionGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SectionGroup post(final SectionGroup newSectionGroup) throws ClientException {
        return send(HttpMethod.POST, newSectionGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISectionGroupRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SectionGroupRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISectionGroupRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SectionGroupRequest)this;
     }

}

