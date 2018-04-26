package userinfo;

import java.util.ArrayList;
import java.util.List;
import iteminfo.Item;

public class User {


    private String userName;
    private Address address;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int ranking;
    private boolean admin;
    private List<BillingDetails> billingDetailsList = new ArrayList(); //создание списка реквизитов
    private BillingDetails defaultBillingDetails;       //создание списка дефолтных реквизитов
    private List<Item> boughtItems = new ArrayList<>(); // список купленных вещей
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
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public List<Item> getSoldItems() {
        return soldItems;
    }
    public void addSoldItem (Item item) {
        soldItems.add(item);
    }



    @Override
    public String toString() {  // пишем во едино данные о пользователе
        return "Пользователь: " + '\n' +
                "Реквизиты пользователя: " + billingDetailsList + '\n' +
                "Первичные реквизиты: " + defaultBillingDetails + '\n' +
                "Домашний адрес: " + address + '\n' +
                "Адрес покупки: " + billingAddress + '\n' +
                "Адрес доставки: " + shippingAddress + '\n' +
                "Имя: " + firstName + '\n' +
                "Фамилия: " + lastName + '\n' +
                "Логин: " + userName + '\n' +
                "Пароль: " + password + '\n' +
                "e-mail: " + email + '\n' +
                "Ранг: " + ranking + '\n' +
                "Наличие прав администратора: " + admin;


    }

    //создаем пользователя с параметрами: имя, фамилия, мыло, pwd. пока что без указания адресов
    public User(String firstName, String lastName, String email, String userName, String password) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.userName=userName;
        this.password=password;
    }




}
