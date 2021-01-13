package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ExpiredProducts {

    @PrimaryKey(autoGenerate = true)
    private int expiredProductID;

    private int associatedCookingRecordId;
    private int quantity;

    public ExpiredProducts(int expiredProductID, int associatedCookingRecordId, int quantity) {
        this.expiredProductID = expiredProductID;
        this.associatedCookingRecordId = associatedCookingRecordId;
        this.quantity = quantity;
    }

    public int getExpiredProductID() {
        return expiredProductID;
    }

    public int getAssociatedCookingRecordId() {
        return associatedCookingRecordId;
    }

    public int getQuantity() {
        return quantity;
    }
}
