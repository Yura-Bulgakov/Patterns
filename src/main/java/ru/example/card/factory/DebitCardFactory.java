package ru.example.card.factory;

import ru.example.card.Card;
import ru.example.card.DebitCard;

public class DebitCardFactory implements CardFactory{
    private int interest;

    public DebitCardFactory(int interest) {
        this.interest = interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    @Override
    public Card createCard() {
        System.out.println("Создана новая дебетовая карта!");
        return new DebitCard(interest);
    }
}
