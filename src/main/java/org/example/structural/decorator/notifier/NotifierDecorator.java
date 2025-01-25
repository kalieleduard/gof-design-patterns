package org.example.structural.decorator.notifier;

public abstract class NotifierDecorator implements Notifier {

    private final Notifier notifier;

    protected NotifierDecorator(final Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMessage(final String aMessage) {
        notifier.sendMessage(aMessage);
    }
}
