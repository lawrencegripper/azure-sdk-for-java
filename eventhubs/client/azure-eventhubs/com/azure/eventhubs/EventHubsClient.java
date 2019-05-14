package com.azure.eventhubs;


// Each time a build method is called, a new receiver or sender is created.
class EventHubsClient implements AutoCloseable {
    // Creates a new sender.
    EventHubsSender createSender() {
        return new EventHubsSender();
    }

    EventHubsSender createSender(String partitionId) {
        return new EventHubsSender();
    }

    // Creates a partition receiver that listens to the $DEFAULT consumer group starting at
    // the given position.
    // Throw exception at that point
    EventHubsReceiver createReceiver(EventPosition position) {
        return new EventHubsReceiver();
    }

    EventHubsReceiver createReceiver(ReceiverOptions options) {
        return new EventHubsReceiver();
    }

    @Override
    public void close() throws Exception {

    }
}
