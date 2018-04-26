package deliveryinfo;

import enums.ShipmentState;
import iteminfo.Item;
import userinfo.Address;
import userinfo.User;

import java.util.Date;

public class Shipment {

    private int inspectionPeriodDays;
    private ShipmentState state;
    private Date created;
    private Item item;
    private User buyman;
    private User sellman;
    private Address shippingAddress;

    public void setInspectionPeriodDays(int inspectionPeriodDays) {
        this.inspectionPeriodDays = inspectionPeriodDays;
    }

    public void setState(ShipmentState state) {
        this.state = state;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setBuyman(User buyman) {
        this.buyman = buyman;
    }

    public void setSellman(User sellman) {
        this.sellman = sellman;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
