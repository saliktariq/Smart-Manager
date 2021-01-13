package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.Product;

@Dao
public interface ProductListDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Product product);

    @Query("DELETE FROM Product")
    void deleteAll();

    @Query("SELECT * FROM Product ORDER BY productID ASC")
    List<Product> getAllProductListData();
}
