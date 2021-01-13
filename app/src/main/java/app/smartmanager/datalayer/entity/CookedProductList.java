package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CookedProductList {

    @PrimaryKey(autoGenerate = true)
    private int cookedProductListID;
    private int associatedProductID;

    public CookedProductList(int cookedProductListID, int associatedProductID) {
        this.cookedProductListID = cookedProductListID;
        this.associatedProductID = associatedProductID;

    }

    public int getCookedProductListID() {
        return cookedProductListID;
    }
    public int getAssociatedProductID() { return associatedProductID;}
}
