package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.ProductTemperature;

@Dao
public interface ProductTemperatureDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(ProductTemperature productTemperature);

    @Query("DELETE FROM ProductTemperature")
    void deleteAll();

    @Query("SELECT * FROM ProductTemperature ORDER BY productTemperatureID ASC")
    List<ProductTemperature> getAllProductTemperatureData();
}
