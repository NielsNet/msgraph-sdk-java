// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.authentication.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.logger.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.serializer.*;

import com.google.gson.JsonObject;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Graph Service Client
 */
public class GraphServiceClient extends BaseGraphServiceClient implements IGraphServiceClient {

    /**
     * Restricted constructor
     */
    protected GraphServiceClient() {
    }

    /**
     * Send a custom request to Graph
     * 
     * @param url
     *            the full URL to make a request with
     * @param responseType
     *            the response class to deserialize the response into
     * @return the instance of this builder
     */
    public <T> CustomRequestBuilder<T> customRequest(final String url, final Class<T> responseType) {
        return new CustomRequestBuilder<T>(getServiceRoot() + url, (IGraphServiceClient) this, null, responseType);
    }

    /**
     * Send a custom request to Graph
     * 
     * @param url
     *            the full URL to make a request with
     * @return the instance of this builder
     */
    public CustomRequestBuilder<JsonObject> customRequest(final String url) {
        return new CustomRequestBuilder<JsonObject>(getServiceRoot() + url, (IGraphServiceClient) this, null,
                JsonObject.class);
    }

    /**
     * Returns a Graph service client using the given configuration.
     * 
     * @param config
     *            the client configuration
     * @return a Graph service client
     */
    public static IGraphServiceClient fromConfig(final IClientConfig config) {
        GraphServiceClient client = new GraphServiceClient();
        client.setAuthenticationProvider(config.getAuthenticationProvider());
        client.setExecutors(config.getExecutors());
        client.setHttpProvider(config.getHttpProvider());
        client.setLogger(config.getLogger());
        client.setSerializer(config.getSerializer());
        client.validate();
        return client;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The builder for this GraphServiceClient
     */
    public static final class Builder {

        private ISerializer serializer;
        private IHttpProvider httpProvider;
        private IAuthenticationProvider authenticationProvider;
        private IExecutors executors;
        private ILogger logger;

        Builder() {
            // ensure instantiation only from static factory method
        }

        /**
         * Sets the serializer.
         * 
         * @param serializer
         *            the serializer
         * @return the instance of this builder
         */
        public Builder serializer(final ISerializer serializer) {
            this.serializer = serializer;
            return this;
        }

        /**
         * Sets the httpProvider
         * 
         * @param httpProvider
         *            the httpProvider
         * @return the instance of this builder
         */
        public Builder httpProvider(final IHttpProvider httpProvider) {
            this.httpProvider = httpProvider;
            return this;
        }

        /**
         * Sets the authentication provider
         * 
         * @param authenticationProvider
         *            the authentication provider
         * @return the instance of this builder
         */
        public Builder authenticationProvider(final IAuthenticationProvider authenticationProvider) {
            this.authenticationProvider = authenticationProvider;
            return this;
        }

        /**
         * Sets the executors
         * 
         * @param executors
         *            the executors
         * @return the instance of this builder
         */
        public Builder executors(final IExecutors executors) {
            this.executors = executors;
            return this;
        }

        /**
         * Sets the logger
         * 
         * @param logger
         *            the logger
         * @return the instance of this builder
         */
        public Builder logger(final ILogger logger) {
            this.logger = logger;
            return this;
        }

        /**
         * Builds and returns the Graph service client.
         * 
         * @return the Graph service client object
         * @throws ClientException
         *             if there was an exception creating the client
         */
        public IGraphServiceClient buildClient() throws ClientException {
            DefaultClientConfig config = new DefaultClientConfig() {

                @Override
                public IAuthenticationProvider getAuthenticationProvider() {
                    if (authenticationProvider != null) {
                        return authenticationProvider;
                    } else {
                        return super.getAuthenticationProvider();
                    }
                }

                @Override
                public IHttpProvider getHttpProvider() {
                    if (httpProvider != null) {
                        return httpProvider;
                    } else {
                        return super.getHttpProvider();
                    }
                }

                @Override
                public IExecutors getExecutors() {
                    if (executors != null) {
                        return executors;
                    } else {
                        return super.getExecutors();
                    }
                }

                @Override
                public ILogger getLogger() {
                    if (logger !=null) {
                        return logger;
                    } else {
                        return super.getLogger();
                    }
                }

                @Override
                public ISerializer getSerializer() {
                    if (serializer != null) {
                        return serializer;
                    } else {
                        return super.getSerializer();
                    }
                }
            };
            return GraphServiceClient.fromConfig(config);
        }
    }
    
}
