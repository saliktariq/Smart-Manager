package app.smartmanager.datalayer.relationalobjects;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import app.smartmanager.datalayer.entity.Product;
import app.smartmanager.datalayer.entity.SupplierList;

public class SupplierListToProduct {
    @Embedded public SupplierList supplierList;
    @Relation(
            parentColumn = "supplierID",
            entityColumn = "associatedSupplierID"
    )
    public List<Product> products;
}
