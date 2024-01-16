package ru.example.notifier;

public class EmailNotifyCommand implements NotifyCommand {
    @Override
    public void execute() {
        System.out.println("Отправлено email сообщение с пдф файлом + смс с оповещением");
    }
}
