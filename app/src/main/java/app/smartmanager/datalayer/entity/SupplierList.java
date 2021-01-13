package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class SupplierList {
    @PrimaryKey(autoGenerate = true)
    private int supplierID;
    private String supplierName;
    private String supplierEmailAddress;
    private String supplierMainPhoneNumber;
    private String supplierAddress;
    private String supplierAccountManagerName;

    public SupplierList(int supplierID, String supplierName, String supplierEmailAddress, String supplierMainPhoneNumber, String supplierAddress, String supplierAccountManagerName) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.supplierEmailAddress = supplierEmailAddress;
        this.supplierMainPhoneNumber = supplierMainPhoneNumber;
        this.supplierAddress = supplierAddress;
        this.supplierAccountManagerName = supplierAccountManagerName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmailAddress() {
        return supplierEmailAddress;
    }

    public String getSupplierMainPhoneNumber() {
        return supplierMainPhoneNumber;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public String getSupplierAccountManagerName() {
        return supplierAccountManagerName;
    }
}
