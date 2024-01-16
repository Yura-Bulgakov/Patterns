package ru.example.request.handler;

import ru.example.request.Request;

public class RequestComplianceHandler extends AbstractRequestHandler {
    @Override
    protected boolean makeCheck(Request request) {
        if (!request.isComplianceFriendly()) {
            System.out.println("Клиент не прошел комплаенс проверку!");
            return false;
        }
        System.out.println("Комплаенс проверка прошла успешно!");
        return true;
    }
}
