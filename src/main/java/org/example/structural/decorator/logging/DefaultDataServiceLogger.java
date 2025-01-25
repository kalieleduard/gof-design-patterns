package org.example.structural.decorator.logging;

import java.time.Instant;

public class DefaultDataServiceLogger extends LogDataServiceDecorator {

    protected DefaultDataServiceLogger(DataService dataService) {
        super(dataService);
    }

    @Override
    public String read() {
        return "Starting reading object at: "
                + Instant.now()
                + "\n"
                + super.update()
                + "\n"
                + "Successfully read object at: "
                + Instant.now();
    }

    @Override
    public String delete() {
        return "Starting deleting object at: "
                + Instant.now()
                + "\n"
                + super.update()
                + "\n"
                + "Successfully deleted object at: "
                + Instant.now();
    }

    @Override
    public String update() {
        return "Starting updating object at: "
                + Instant.now()
                + "\n"
                + super.update()
                + "\n"
                + "Successfully updated object at: "
                + Instant.now();
    }

    @Override
    public String create() {
        return "Starting creating object at: "
                + Instant.now()
                + "\n"
                + super.update()
                + "\n"
                + "Successfully created object at: "
                + Instant.now();
    }
}
