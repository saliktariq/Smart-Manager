package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class COSHHProductList {

    @PrimaryKey(autoGenerate = true)
    private int COSHHProductID;
    private int COSHHProductName;
    private String usage;
    private String concentration;

    public COSHHProductList(int COSHHProductID, int COSHHProductName, String usage, String concentration) {
        this.COSHHProductID = COSHHProductID;
        this.COSHHProductName = COSHHProductName;
        this.usage = usage;
        this.concentration = concentration;
    }

    public int getCOSHHProductID() {
        return COSHHProductID;
    }

    public int getCOSHHProductName() {
        return COSHHProductName;
    }

    public String getUsage() {
        return usage;
    }

    public String getConcentration() {
        return concentration;
    }
}
