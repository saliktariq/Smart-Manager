package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CookedProductList {

    @PrimaryKey(autoGenerate = true)
    private int cookedProductListID;
    private int cookedProductID;

    public CookedProductList(int cookedProductListID, int cookedProductID) {
        this.cookedProductListID = cookedProductListID;
        this.cookedProductID = cookedProductID;

    }

    public int getCookedProductListID() {
        return cookedProductListID;
    }

    public int getCookedProductID() {
        return cookedProductID;
    }
}
