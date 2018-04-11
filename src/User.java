import java.util.ArrayList;
import java.util.List;

public class User {


    private String username;
    private Address address;
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private int ranking;
    private boolean admin;
    private List<BillingDetails> billingDetailsList = new ArrayList(); //создание списка реквизитов
    private BillingDetails defaultBillingDetails;
    private List<Item> boughtItems = new ArrayList<>(); // список куполенных вещей
    private List<Item> soldItems = new ArrayList<>(); //список проданных вещей
    private Address billingAddress;
    private Address shippingAddress;

    public Address getShippingAddress () {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public void addBoughtItem(Item item) {
        boughtItems.add(item);
    }
    public void addSoldItem(Item item) {
        soldItems.add(item);
    }
    public BillingDetails getDefaultBillingDetails() {
        return defaultBillingDetails;
    }

    public void setDefaultBillingDetails(BillingDetails billingDetailsList) {
        this.defaultBillingDetails = billingDetailsList;
    }


    public void addBillingDetails(BillingDetails billingDetails) {
        billingDetailsList.add(billingDetails);
        if (billingDetailsList.size() == 1) {
            setDefaultBillingDetails(billingDetails);
        }
    }


    public void setHomeAddress(Address address) {
        this.address = address;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getUserName() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }



    @Override
    public String toString() {  // пишем во едино данные о пользователе
        return "Пользователь: " + '\n' +
                "Реквизиты пользователя: " + billingDetailsList + '\n' +
                "Первичные реквизиты: " + defaultBillingDetails + '\n' +
                "Домашний адрес: " + address + '\n' +
                "Адрес покупки: " + billingAddress + '\n' +
                "Адрес доставки: " + shippingAddress + '\n' +
                "Имя: " + firstname + '\n' +
                "Фамилия: " + lastname + '\n' +
                "Логин: " + username + '\n' +
                "Пароль: " + password + '\n' +
                "e-mail: " + email + '\n' +
                "Ранг: " + ranking + '\n' +
                "Наличие прав администратора: " + admin;


    }

}
