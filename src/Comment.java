import java.util.Date;

public class Comment {

    //создаем объекты коментария
    private Rating rating;
    private String text;
    private Date created;

    //создаем коментатора и коментируемую вещь
    private User commentator;
    private Item item;

    //создаем методы для объектов


    public void setCreated(Date created) {    //дата написания коммента
        this.created = created;
    }

    public void setText(String text) {      //текст коммента
        this.text = text;
    }

    public void setRating(Rating rating) {  //проставка рейтинга
        this.rating = rating;
    }

    public void setCommentator(User commentator) { //комментатор
        this.commentator = commentator;
    }

    public void setItem(Item item) {    //товар
        this.item = item;
    }
}
