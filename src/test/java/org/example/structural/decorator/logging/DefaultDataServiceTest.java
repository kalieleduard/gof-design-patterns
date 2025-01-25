package org.example.structural.decorator.logging;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DefaultDataServiceTest {

    @Test
    void givenAValidEntryWhenCreateNewObjectShouldReturnOK() {
        final var expectedMessage = "Created object";
        final var service = new DefaultDataService();

        final String createdMessage = service.create();

        Assertions.assertNotNull(createdMessage);
        Assertions.assertEquals(expectedMessage, createdMessage);
    }

    @Test
    void givenAValidEntryWhenUpdatedNewObjectShouldReturnOK() {
        final var expectedMessage = "Updated object";
        final var service = new DefaultDataService();

        final String updatedMessage = service.update();

        Assertions.assertNotNull(updatedMessage);
        Assertions.assertEquals(expectedMessage, updatedMessage);
    }

    @Test
    void givenAValidEntryWhenDeleteNewObjectShouldReturnOK() {
        final var expectedMessage = "Deleted object";
        final var service = new DefaultDataService();

        final String deletedMessage = service.delete();

        Assertions.assertNotNull(deletedMessage);
        Assertions.assertEquals(expectedMessage, deletedMessage);
    }

    @Test
    void givenAValidEntryWhenReadNewObjectShouldReturnOK() {
        final var expectedMessage = "Read object";
        final var service = new DefaultDataService();

        final String readMessage = service.read();

        Assertions.assertNotNull(readMessage);
        Assertions.assertEquals(expectedMessage, readMessage);
    }
}