package org.example.structural.decorator.logging;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DefaultDataServiceTest {

    @Test
    void givenAValidEntryWhenCreateNewObjectShouldReturnOK() {
        final var expectedName = "Kaliel";
        final var service = new DefaultDataService();

        final String createdCustomer = service.create(1L, "Kaliel");

        Assertions.assertNotNull(createdCustomer);
        Assertions.assertEquals(expectedName, createdCustomer);
    }

    @Test
    void givenAValidEntryWhenUpdatedNewObjectShouldReturnOK() {
        final var expectedUpdated = "Pedro";
        final var service = new DefaultDataService();

        service.create(1L, "Kaliel");
        service.update(1L, "Pedro");

        final String get = service.read(1L);

        Assertions.assertNotNull(get);
        Assertions.assertEquals(expectedUpdated, get);
    }

    @Test
    void givenAValidEntryWhenReadNewObjectShouldReturnOK() {
        final var expectedName = "Pedro";
        final var service = new DefaultDataService();

        service.create(2L, expectedName);

        final String get = service.read(2L);

        Assertions.assertNotNull(get);
        Assertions.assertEquals(expectedName, get);
    }
}