package org.example.structural.decorator.logging.logger;

import org.example.structural.decorator.logging.DataService;

public abstract class DataServiceLoggerDecorator implements DataService {

    private final DataService dataService;

    protected DataServiceLoggerDecorator(final DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String create(long anId, String aName) {
        return dataService.create(anId, aName);
    }

    @Override
    public String update(long anId, String aName) {
        return dataService.update(anId, aName);
    }

    @Override
    public void delete(long anId) {
        dataService.delete(anId);
    }

    @Override
    public String read(long anId) {
        return dataService.read(anId);
    }
}
