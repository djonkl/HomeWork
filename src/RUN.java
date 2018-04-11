public class RUN {
    public static void main(String[] args) {


        User buyman = createUser();
        buyman.setAdmin(false);
        User sellman = createUser();
        sellman.setAdmin(false);
        Item sellcar = new Item();
        sellcar.setSellman(sellman);
        Category lada = new Category();
        Category car = new Category();
        car.addChildCategory(lada);
        lada.setParent(car);
        Comment comment = new Comment();
        comment.setCommentator(buyman);
        comment.setItem(sellcar);
        Bid bid = new Bid();
        bid.setCreator(buyman);
        sellcar.addBid(bid);
        Shipment shipment = new Shipment();
        shipment.setBuyman(buyman);
        shipment.setSellman(sellman);
        shipment.setShippingAddress(buyman.getShippingAddress());
        shipment.setItem(sellcar);
        System.out.println("за час до доставки сообщить клиенту");

    }

    private static User createUser() {
        User user = new User();
        user.setFirstname("Евгений");
        user.setLastname("Клочков");
        user.setUsername("djonkl");
        user.setPassword("homework");
        user.setEmail("eklochkov@croc.ru");
        user.setAdmin(true);
        user.setRanking(5);
        Address home = new Address();
        Address billing = new Address();
        Address shipping = new Address();
        home.setCity("Москва");
        home.setStreet("Ленина");
        home.setZipcode("123123");
        billing.setCity("Москва");
        billing.setStreet("Проспект Мира");
        billing.setZipcode("123234");
        shipping.setCity("Киров");
        shipping.setStreet("Гоголя");
        shipping.setZipcode("249441");

        user.setShippingAddress(shipping);
        user.setBillingAddress(billing);
        user.setHomeAddress(home);
        user.addBillingDetails(new CreditCard(
                user.getFirstName() + " " + user.getLastName(),
                "0546371057841695",
                "04",
                "2020",
                CreditCardType.Visa));
        user.addBillingDetails(new BankAccount(user.getFirstName() + " " + user.getLastName(),
                "0001",
                "Tinkoff",
                "1237865"));

        System.out.println(user.toString());
        return user;
    }
}


