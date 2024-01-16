package ru.example;

import ru.example.request.Request;
import ru.example.request.handler.AbstractRequestHandler;
import ru.example.request.handler.RequestAcceptanceHandler;
import ru.example.request.handler.RequestComplianceHandler;
import ru.example.request.handler.RequestSchemaHandler;

public class Task2 {

    public static void main(String[] args) {
        AbstractRequestHandler requestSchemaHandler = new RequestSchemaHandler();
        AbstractRequestHandler requestComplianceHandler = new RequestComplianceHandler();
        AbstractRequestHandler requestAcceptanceHandler = new RequestAcceptanceHandler();
        requestSchemaHandler.setNext(requestComplianceHandler);
        requestComplianceHandler.setNext(requestAcceptanceHandler);
        Request request = new Request("АБ", "123", "@mail", 10, true,
                1, 10, 5, true);
        requestSchemaHandler.handleRequest(request);
    }
}
