package org.example.structural.decorator.notifier;

public class EmailNotifier implements Notifier {

    @Override
    public void sendMessage(final String aMessage) {
        System.out.println("Sending email... Message: " + aMessage);
    }
}
