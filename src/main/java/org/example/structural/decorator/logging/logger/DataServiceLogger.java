package org.example.structural.decorator.logging.logger;

import org.example.structural.decorator.logging.DataService;

import java.time.Instant;

public class DataServiceLogger extends DataServiceLoggerDecorator {

    public DataServiceLogger(DataService dataService) {
        super(dataService);
    }

    @Override
    public String create(long anId, String aName) {
        final var customer = super.create(anId, aName);
        System.out.println("Starting creating object at: "
                + Instant.now()
                + "\n"
                + customer
                + "\n"
                + "Successfully created object at: "
                + Instant.now());

        return customer;
    }

    @Override
    public String update(long anId, String aName) {
        final var customer = super.update(anId, aName);
        System.out.println("Starting updating object at: "
                + Instant.now()
                + "\n"
                + customer
                + "\n"
                + "Successfully updated object at: "
                + Instant.now());

        return customer;
    }

    @Override
    public void delete(long anId) {
        super.delete(anId);
        System.out.println("Starting deleting object at: "
                + Instant.now()
                + "\n"
                + anId
                + "\n"
                + "Successfully deleted object at: "
                + Instant.now());
    }

    @Override
    public String read(long anId) {
        System.out.println("Starting reading object at: " + Instant.now());
        final var customer = super.read(anId);
        System.out.println(
                customer
                + "\n"
                + "Successfully read object at: "
                + Instant.now());

        return customer;
    }
}
