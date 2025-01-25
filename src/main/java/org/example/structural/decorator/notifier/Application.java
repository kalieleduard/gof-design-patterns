package org.example.structural.decorator.notifier;

public class Application {
    public static void main(String[] args) {
        final var emailNotifier = new EmailNotifier();
        final var smsDecorator = new SMSDecorator(emailNotifier);
        smsDecorator.sendMessage("Here is your PDF contract attached");
    }
}
