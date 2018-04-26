import deliveryinfo.Shipment;
import enums.CreditCardType;
import iteminfo.Bid;
import iteminfo.Category;
import iteminfo.Comment;
import iteminfo.Item;
import userinfo.Address;
import userinfo.BankAccount;
import userinfo.CreditCard;
import userinfo.User;

public class RUN {
    public static void main(String[] args) {

       /* //создаем покупателя
        User buyman = createUser();
        //без прав админа
        buyman.setAdmin(false);
        //моздаем продавца
        User sellman = createUser();
        //без прав админа
        sellman.setAdmin(false);
        //создаем товар
        Item sellcar = new Item();
        //присваиваем принадлежность товара к продавцу
        sellcar.setSellman(sellman);
        //создаем категории товаров
        Category lada = new Category();
        Category car = new Category();
        //указываем какая из категорий дочерняя
        car.addChildCategory(lada);
        //указываем какая из категорий родительская
        lada.setParent(car);
        //создаем коменты
        Comment comment = new Comment();
        //сетКоментатор - коммент от покупашки
        comment.setCommentator(buyman);
        //коммент(описание) к товару от продавца
        comment.setItem(sellcar);
        //создаем ставки для аукциона
        Bid bid = new Bid();
        //устанавливаем начальную ставку от продавца
        bid.setCreator(buyman);
        //делаем ставку от покупашки
        sellcar.addBid(bid);
        //создаем адреса
        Shipment shipment = new Shipment();
        //указываем адрес покупашки
        shipment.setBuyman(buyman);
        //указываем адрес продавца
        shipment.setSellman(sellman);
        //в адрес доставки указываем адрес доставки, указанный покупашкой
        shipment.setShippingAddress(buyman.getShippingAddress());
        //указываем адрес нахождения товара
        shipment.setItem(sellcar);

        //не вижу тут смысла в этой строке
        //System.out.println("за час до доставки сообщить клиенту");*/

    }


    //создаем пользователя с данными
   /* private static User createUser() {
        User user = new User();
        user.setFirstName("Евгений");
        user.setLastName("Клочков");
        user.setUserName("djonkl");
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
    }*/
}


