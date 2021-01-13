package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

import app.smartmanager.helper.DateTime;

@Entity
public class CookingRecord {

    @PrimaryKey(autoGenerate = true)
    private int cookingRecordID;
    private int associatedProductID; //Can be associatedCookedProductID? If not, do I need CookedProductList?
    private int quantityCooked;
    private DateTime cookedTime;
    private DateTime expiredTime;

    public CookingRecord(int cookingRecordID, int associatedProductID, int quantityCooked, DateTime cookedTime, DateTime expiredTime) {
        this.cookingRecordID = cookingRecordID;
        this.associatedProductID = associatedProductID;
        this.quantityCooked = quantityCooked;
        this.cookedTime = cookedTime;
        this.expiredTime = expiredTime;
    }

    public int getCookingRecordID() {
        return cookingRecordID;
    }

    public int getAssociatedProductID() {
        return associatedProductID;
    }

    public int getQuantityCooked() {
        return quantityCooked;
    }

    public DateTime getCookedTime() {
        return cookedTime;
    }

    public DateTime getExpiredTime() {
        return expiredTime;
    }
}
