package ru.example.notifier;

public class SMSAndEmailNotifyCommand implements NotifyCommand {
    private final NotifyCommand smsNotifyCommand;
    private final NotifyCommand emailNotifyCommand;

    public SMSAndEmailNotifyCommand(NotifyCommand smsNotifyCommand, NotifyCommand emailNotifyCommand) {
        this.smsNotifyCommand = smsNotifyCommand;
        this.emailNotifyCommand = emailNotifyCommand;
    }

    @Override
    public void execute() {
        smsNotifyCommand.execute();
        emailNotifyCommand.execute();
    }
}
