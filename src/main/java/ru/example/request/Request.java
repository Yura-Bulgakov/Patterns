package ru.example.request;

public class Request {
    private String fullName;
    private String phoneNumber;
    private String email;
    private double income;
    private boolean goodCreditHistory;
    private double interest;
    private double creditAmount;
    private double minPayment;
    private boolean complianceFriendly;

    public Request(String fullName, String phoneNumber, String email, double income, boolean goodCreditHistory,
                   double interest, double creditAmount, double minPayment, boolean complianceFriendly) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.income = income;
        this.goodCreditHistory = goodCreditHistory;
        this.interest = interest;
        this.creditAmount = creditAmount;
        this.minPayment = minPayment;
        this.complianceFriendly = complianceFriendly;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public double getIncome() {
        return income;
    }

    public boolean isGoodCreditHistory() {
        return goodCreditHistory;
    }

    public double getInterest() {
        return interest;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public double getMinPayment() {
        return minPayment;
    }

    public boolean isComplianceFriendly() {
        return complianceFriendly;
    }
}
