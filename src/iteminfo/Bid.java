package iteminfo;

import userinfo.User;

import java.math.BigDecimal;
import java.util.Date;

public class Bid {

    private BigDecimal amount;
    private Date created;
    private User creator;

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
