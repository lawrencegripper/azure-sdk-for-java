package com.azure.eventhubs;

import java.nio.ByteBuffer;
import java.util.Map;

class EventData {
    // Creates an event containing the data.
    EventData(byte[] data) {

    }

    EventData(ByteBuffer data) {

    }

    // Application properties
    EventData properties(Map<String, Object> properties) {
        return this;
    }

    EventData partitionKey(String partitionKey) {
        return this;
    }

    // System properties set by Event Hubs service.
    EventData.SystemProperties systemProperties() {
        return new SystemProperties();
    }

    class SystemProperties {
    }
}
