package com.azure.eventhubs;


import com.microsoft.azure.eventhubs.EventData;
import reactor.core.publisher.Flux;

class EventHubsReceiver implements AutoCloseable {
    // Continue receiving events until close() is called or the EventHubsClientBuilder.timeout() is
    // reached without receiving an event.
    Flux<EventData> receive() {
        return Flux.empty();
    }

    @Override
    public void close() throws Exception {

    }
}
