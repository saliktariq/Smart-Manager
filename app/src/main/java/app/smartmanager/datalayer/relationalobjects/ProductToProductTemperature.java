package app.smartmanager.datalayer.relationalobjects;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import app.smartmanager.datalayer.entity.Product;
import app.smartmanager.datalayer.entity.ProductTemperature;

public class ProductToProductTemperature {
    @Embedded public Product product;
    @Relation(
            parentColumn = "productID",
            entityColumn = "associatedProductID"
    )
    public List<ProductTemperature> temperatures;
}
