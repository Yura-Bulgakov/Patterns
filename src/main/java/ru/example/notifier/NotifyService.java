package ru.example.notifier;

public class NotifyService {
    private NotifyCommand notifyCommand;

    public void setNotifier(NotifyCommand notifyCommand) {
        this.notifyCommand = notifyCommand;
    }

    public void inform() {
        notifyCommand.execute();
    }
}
