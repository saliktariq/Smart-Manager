package app.smartmanager.datalayer.relationalobjects;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import app.smartmanager.datalayer.entity.Inventory;
import app.smartmanager.datalayer.entity.Product;

public class ProductToInventory {
    @Embedded public Product product;
    @Relation(
            parentColumn = "productID",
            entityColumn = "associatedProductID"
    )
    public List<Inventory> inventoryList;
}
