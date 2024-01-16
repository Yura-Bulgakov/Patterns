package ru.example.notifier;

public class SMSNotifyCommand implements NotifyCommand {
    @Override
    public void execute() {
        System.out.println("Отправлено смс сообщение!");
    }
}
