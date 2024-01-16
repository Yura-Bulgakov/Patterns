package ru.example.card;

public class DebitCard implements Card {
    private int interest;

    public DebitCard(int interest) {
        this.interest = interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    @Override
    public void showCardInfo() {
        System.out.println("Процент на остаток по дебетовой карте: " + interest);
    }
}
