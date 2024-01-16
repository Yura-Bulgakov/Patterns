package ru.example.request.handler;

import ru.example.request.Request;

public abstract class AbstractRequestHandler implements RequestHandler {
    protected RequestHandler next;

    public RequestHandler setNext(RequestHandler requestHandler) {
        next = requestHandler;
        return next;
    }

    @Override
    public void handleRequest(Request request) {
        if (makeCheck(request) && next != null) {
            next.handleRequest(request);
        }
    }

    protected abstract boolean makeCheck(Request request);
}
