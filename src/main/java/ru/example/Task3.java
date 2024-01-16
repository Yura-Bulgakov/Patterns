package ru.example;

import ru.example.notifier.*;

public class Task3 {

    public static void main(String[] args) {
        NotifyCommand smsNotifyCommand = new SMSNotifyCommand();
        NotifyCommand emailNotifyCommand = new EmailNotifyCommand();
        NotifyCommand smsEmailNotifyCommand = new SMSAndEmailNotifyCommand(smsNotifyCommand, emailNotifyCommand);
        NotifyService notifyService = new NotifyService();

        notifyService.setNotifier(smsNotifyCommand);
        notifyService.inform();

        notifyService.setNotifier(emailNotifyCommand);
        notifyService.inform();

        notifyService.setNotifier(smsEmailNotifyCommand);
        notifyService.inform();
    }
}
