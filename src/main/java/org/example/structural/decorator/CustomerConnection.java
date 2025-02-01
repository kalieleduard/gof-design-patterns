package org.example.structural.decorator;

import java.util.HashMap;
import java.util.Map;

public enum CustomerConnection {
    INSTANCE;

    private final Map<Long, String> connection;

    CustomerConnection() {
        connection = new HashMap<>();
    }

    public String insert(final long anId, final String aName) {
        connection.put(anId, aName);
        return connection.get(anId);
    }

    public String read(final long anId) {
        return connection.get(anId);
    }

    public String update(final long anId, final String aName) {
        connection.replace(anId, aName);
        return connection.get(anId);
    }

    public void delete(final long anId) {
        connection.remove(anId);
    }
}
