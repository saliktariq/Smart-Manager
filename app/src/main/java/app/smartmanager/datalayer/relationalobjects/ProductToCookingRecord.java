package app.smartmanager.datalayer.relationalobjects;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import app.smartmanager.datalayer.entity.CookingRecord;
import app.smartmanager.datalayer.entity.Product;

public class ProductToCookingRecord {
    @Embedded public Product product;
    @Relation(
            parentColumn = "productID",
            entityColumn = "associatedProductID"
    )
    public List<CookingRecord> cookingRecordList;
}
