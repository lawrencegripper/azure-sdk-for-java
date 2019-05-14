package com.azure.eventhubs;

public class ReceiverOptions {
    private final EventPosition position;

    // This is a mandatory field when specifying options.
    public ReceiverOptions(EventPosition position) {
        this.position = position;
    }

    ReceiverOptions id(String id) {
        return this;
    }
    ReceiverOptions consumerGroup(String consumerGroupName) {
        return this;
    }
    ReceiverOptions partitionKey(String partitionKey) {
        return this;
    }

    // If specified, this becomes an Epoch EventHubsReceiver.
    // (Only one EventHubsReceiver can listen to the {partition-consumerGroup}.)
    ReceiverOptions epoch(long epoch) {
        return this;
    }
}
