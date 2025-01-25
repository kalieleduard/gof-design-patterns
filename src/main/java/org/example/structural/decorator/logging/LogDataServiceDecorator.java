package org.example.structural.decorator.logging;

public abstract class LogDataServiceDecorator implements DataService {

    private final DataService dataService;

    protected LogDataServiceDecorator(final DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String create() {
        return dataService.create();
    }

    @Override
    public String update() {
        return dataService.update();
    }

    @Override
    public String delete() {
        return dataService.delete();
    }

    @Override
    public String read() {
        return dataService.read();
    }
}
