package org.example.structural.decorator.logging;

import org.example.structural.decorator.CustomerConnection;

public class DefaultDataService implements DataService {

    @Override
    public String create(final long anId, final String aName) {
        return CustomerConnection.INSTANCE.insert(anId, aName);
    }

    @Override
    public String update(final long anId, final String aName) {
        return CustomerConnection.INSTANCE.update(anId, aName);
    }

    @Override
    public void delete(final long anId) {
        CustomerConnection.INSTANCE.delete(anId);
    }

    @Override
    public String read(final long anId) {
        return CustomerConnection.INSTANCE.read(anId);
    }
}
