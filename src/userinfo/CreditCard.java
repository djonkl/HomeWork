package userinfo;

import enums.CreditCardType;

public class CreditCard extends BillingDetails {

    private String number;
    private String expMonth;
    private String expYear;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    public void setType(CreditCardType type) {
        this.type = type;
    }

    CreditCardType type;

    @Override
    public String toString () {
        return "Банковская карта: " +'\n' +
                "Номер карты: " + number + '\n' +
                "Месяц окончания срока действия: " + expMonth + '\n' +
                "Год окончания срока действия: " + expYear + '\n' +
                "Тип карты: " + type + '\n' +
                "Имя держателя карты: " + ownerName + '\n';
    }

    public CreditCard (String ownerName, String number, String expMonth, String expYear, CreditCardType type) {
        this.ownerName = ownerName;
        this.number = number;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.type = type;
    }
}
