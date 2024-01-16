package ru.example.request.handler;

import ru.example.request.Request;

public class RequestSchemaHandler extends AbstractRequestHandler {
    @Override
    protected boolean makeCheck(Request request) {
        if (checkRequestEmptyFields(request)) {
            System.out.println("Заявка отклонена! Все поля должны быть заполнены!");
            return false;
        }
        System.out.println("Проверка на заполненность заявки прошла успешно!");
        return true;
    }

    private boolean checkRequestEmptyFields(Request request) {
        return request.getCreditAmount() <= 0 ||
                request.getFullName().isEmpty() ||
                request.getEmail().isEmpty() ||
                request.getPhoneNumber().isEmpty() ||
                request.getInterest() <= 0 ||
                request.getIncome() <= 0 ||
                request.getMinPayment() <= 0;
    }
}
