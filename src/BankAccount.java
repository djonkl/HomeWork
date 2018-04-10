public class BankAccount extends BillingDetails {

    String number;
    String bankname;
    String swift;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public BankAccount (String ownerName, String number, String bankname, String swift) {
        this.ownerName = ownerName;
        this.number = number;
        this.bankname = bankname;
        this.swift = swift;
    }

    @Override
    public String toString() {
        return "Банковский аккаунт клиента: " +
                "id" + number + '\n' +
                "Название банка" + bankname + '\n' +
                "swift" + swift + '\n' +
                "Владелец карты" + ownerName + '\n';
    }

}
