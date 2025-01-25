package org.example.structural.decorator.notifier;

public class SMSDecorator extends NotifierDecorator {

    protected SMSDecorator(final Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String aMessage) {
        super.sendMessage(aMessage);
        sendSMS(aMessage);
    }

    private void sendSMS(final String aMessage) {
        System.out.println("Sending SMS... Message: "  + aMessage);
    }
}
