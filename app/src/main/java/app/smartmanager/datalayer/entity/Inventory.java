package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import app.smartmanager.helper.DateTime;
import app.smartmanager.helper.enums.Frequency;

@Entity
public class Inventory {

    @PrimaryKey(autoGenerate = true)
    private int inventoryRecordID;

    private int associatedProductID;
    private int associatedUserID;
    private DateTime dateTime;
    private Frequency inventoryType;

    public Inventory(int inventoryRecordID, int associatedProductID, int associatedUserID, DateTime dateTime, Frequency inventoryType) {
        this.inventoryRecordID = inventoryRecordID;
        this.associatedProductID = associatedProductID;
        this.associatedUserID = associatedUserID;
        this.dateTime = dateTime;
        this.inventoryType = inventoryType;
    }

    public int getInventoryRecordID() {
        return inventoryRecordID;
    }

    public int getAssociatedProductID() {
        return associatedProductID;
    }

    public int getAssociatedUserID() {
        return associatedUserID;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public Frequency getInventoryType() {
        return inventoryType;
    }
}
