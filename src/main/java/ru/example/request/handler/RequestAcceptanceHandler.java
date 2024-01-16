package ru.example.request.handler;

import ru.example.request.Request;

public class RequestAcceptanceHandler extends AbstractRequestHandler {
    @Override
    protected boolean makeCheck(Request request) {
        if (!request.isGoodCreditHistory()) {
            System.out.println("Заявка на кредит отклонена!");
            return false;
        }
        System.out.println("ЗАявка принята! Кредит одобрен!");
        return true;
    }
}
