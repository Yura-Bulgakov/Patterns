package ru.example;

import ru.example.card.Card;
import ru.example.card.factory.CardFactory;
import ru.example.card.factory.CreditCardFactory;
import ru.example.card.factory.DebitCardFactory;

public class Task1 {
    public static void main(String[] args) {
        CardFactory creditCardFactory = new CreditCardFactory(5000);
        CardFactory debitCardFactory = new DebitCardFactory(5);
        Card creditCard = creditCardFactory.createCard();
        creditCard.showCardInfo();
        Card debitCard = debitCardFactory.createCard();
        debitCard.showCardInfo();
    }
}