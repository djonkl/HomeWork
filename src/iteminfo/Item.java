package iteminfo;

import enums.ItemState;
import userinfo.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Item {

    private String Name;
    private String description;
    private BigDecimal initialPrice;
    private BigDecimal reservePrice;
    private Date startDate;
    private Date endDate;
    private ItemState state;
    private Date approvalDatetime;
    private List<Bid> bidList = new ArrayList<>();
    private Bid successBid;
    private User sellman;
    private List<Category> categoryList = new ArrayList<>();

    public void addBid(Bid bid) {
        bidList.add(bid);
    }

    public void setSuccessBid(Bid successBid) {
        this.successBid = successBid;
    }

    public User getSellman() {
        return sellman;
    }

    public void setSellman(User sellman) {
        this.sellman = sellman;
    }

    public void addCategory(Category category) {
        categoryList.add(category);
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInitialPrice(BigDecimal initialPrice) {
        this.initialPrice = initialPrice;
    }

    public void setReservePrice(BigDecimal reservePrice) {
        this.reservePrice = reservePrice;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setApprovalDatetime(Date approvalDatetime) {
        this.approvalDatetime = approvalDatetime;
    }

    public void setState(ItemState state) {
        this.state = state;
    }
}


