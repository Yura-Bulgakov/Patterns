package ru.example.card.factory;

import ru.example.card.Card;
import ru.example.card.CreditCard;

public class CreditCardFactory implements CardFactory {
    private int limit;

    public CreditCardFactory(int limit) {
        this.limit = limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public Card createCard() {
        System.out.println("Создана кредитная карта");
        return new CreditCard(limit);
    }
}
