package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.ExpiredProducts;

@Dao
public interface ExpiredProductsDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(ExpiredProducts expiredProducts);

    @Query("DELETE FROM ExpiredProducts")
    void deleteAll();

    @Query("SELECT * FROM ExpiredProducts ORDER BY expiredProductID ASC")
    List<ExpiredProducts> getExpiredProductsData();

}
