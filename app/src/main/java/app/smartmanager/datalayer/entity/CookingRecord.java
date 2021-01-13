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
    private Date cookedTime;
    private Date expiredTime;

    public CookingRecord(int cookingRecordID, int associatedProductID, int quantityCooked, Date cookedTime, Date expiredTime) {
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

    public Date getCookedTime() {
        return cookedTime;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }
}
