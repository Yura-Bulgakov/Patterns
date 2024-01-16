package ru.example.card;

public class CreditCard implements Card {
    private int limit;

    public CreditCard(int limit) {
        this.limit = limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void showCardInfo() {
        System.out.printf("Кредитный лимит по карте: %d рублей %n", limit);
    }
}
