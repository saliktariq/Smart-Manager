package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ProductList {

    @PrimaryKey(autoGenerate = true)
    private int productID;
    private int associatedSupplierID;
    private String productName;
    private boolean criticalControlRequired;
    private int quantityPerUnitReceived;

    public ProductList(int productID, int associatedSupplierID, String productName, boolean criticalControlRequired, int quantityPerUnitReceived) {
        this.productID = productID;
        this.associatedSupplierID = associatedSupplierID;
        this.productName = productName;
        this.criticalControlRequired = criticalControlRequired;
        this.quantityPerUnitReceived = quantityPerUnitReceived;
    }

    public int getProductID() {
        return productID;
    }

    public int getAssociatedSupplierID() {
        return associatedSupplierID;
    }

    public String getProductName() {
        return productName;
    }

    public boolean isCriticalControlRequired() {
        return criticalControlRequired;
    }

    public int getQuantityPerUnitReceived() {
        return quantityPerUnitReceived;
    }
}
