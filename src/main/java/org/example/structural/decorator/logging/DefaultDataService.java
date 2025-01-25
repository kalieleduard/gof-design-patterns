package org.example.structural.decorator.logging;

public class DefaultDataService implements DataService {

    @Override
    public String create() {
        return "Created object";
    }

    @Override
    public String update() {
        return "Updated object";
    }

    @Override
    public String delete() {
        return "Deleted object";
    }

    @Override
    public String read() {
        return "Read object";
    }
}
