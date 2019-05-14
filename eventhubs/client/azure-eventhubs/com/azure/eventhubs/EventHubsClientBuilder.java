package com.azure.eventhubs;

import com.azure.core.http.policy.RetryPolicy;
import com.microsoft.azure.eventhubs.TransportType;

import java.time.Duration;
import java.util.concurrent.ScheduledExecutorService;

class EventHubsClientBuilder {
    EventHubsClientBuilder credentials(Credentials credentials) {
        return this;
    }

    // AMQP or AMQP via Websockets
    EventHubsClientBuilder transportType(TransportType transport) {
        return this;
    }

    EventHubsClientBuilder timeout(Duration duration) {
        return this;
    }

    EventHubsClientBuilder scheduler(ScheduledExecutorService executor) {
        return this;
    }

    EventHubsClientBuilder proxy(ProxyPolicy proxyPolicy) {
        return this;
    }

    EventHubsClientBuilder retry(RetryPolicy retryPolicy) {
        return this;
    }

    EventHubsClient build() {
        return new EventHubsClient();
    }
}
