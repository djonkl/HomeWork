package userinfo;

public class BankAccount extends BillingDetails {

    String number;
    String bankName;
    String swift;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public BankAccount (String ownerName, String number, String bankName, String swift) {
        this.ownerName = ownerName;
        this.number = number;
        this.bankName = bankName;
        this.swift = swift;
    }

    @Override
    public String toString() {
        return "Банковский аккаунт клиента: " +
                "id клиента: " + number + '\n' +
                "Название банка: " + bankName + '\n' +
                "swift: " + swift + '\n' +
                "Владелец карты: " + ownerName + '\n';
    }

}
