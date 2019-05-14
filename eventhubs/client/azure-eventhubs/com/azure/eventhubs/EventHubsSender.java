package com.azure.eventhubs;


import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

class EventHubsSender implements AutoCloseable {
//    Mono<Void> send(com.microsoft.azure.eventhubs.EventData... events) {
//        return Mono.empty();
//    }

    Mono<Void> send(Publisher<EventData> events) {
        return Mono.empty();
    }

    @Override
    public void close() {

    }
}

