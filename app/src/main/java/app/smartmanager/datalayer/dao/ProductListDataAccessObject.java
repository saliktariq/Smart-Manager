package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.ProductList;

@Dao
public interface ProductListDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(ProductList productList);

    @Query("DELETE FROM ProductList")
    void deleteAll();

    @Query("SELECT * FROM ProductList ORDER BY productID ASC")
    List<ProductList> getAllProductListData();
}
