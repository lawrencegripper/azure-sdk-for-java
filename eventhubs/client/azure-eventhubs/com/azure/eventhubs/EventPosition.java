package com.azure.eventhubs;

import java.time.Instant;

// This is from the existing EventPosition class in the client library.
// https://static.javadoc.io/com.microsoft.azure/azure-eventhubs/2.3.1/com/microsoft/azure/eventhubs/EventPosition.html
class EventPosition {
    static EventPosition fromEndOfSream() {
        return new EventPosition();
    }
    static EventPosition fromEnqueuedTime(Instant datetime) {
        return new EventPosition();
    }
    static EventPosition fromOffset(String offset) {
        return new EventPosition();
    }
    static EventPosition fromSequenceNumber(long sequenceNumber) {
        return new EventPosition();
    }
    static EventPosition fromStartOfStream() {
        return new EventPosition();
    }
}
