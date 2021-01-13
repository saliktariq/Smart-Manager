package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class COSHHProductList {

    @PrimaryKey(autoGenerate = true)
    private int coshhproductid;
    private int coshhproductname;
    private String usage;
    private String concentration;

    public COSHHProductList(int coshhProductID, int coshhproductname, String usage, String concentration) {
        this.coshhproductid = coshhProductID;
        this.coshhproductname = coshhproductname;
        this.usage = usage;
        this.concentration = concentration;
    }

    public int getCoshhproductid() {
        return coshhproductid;
    }

    public int getCoshhproductname() {
        return coshhproductname;
    }

    public String getUsage() {
        return usage;
    }

    public String getConcentration() {
        return concentration;
    }
}
