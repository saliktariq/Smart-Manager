package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.EquipmentTemperature;

@Dao
public interface EquipmentTemperatureDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(EquipmentTemperature equipmentTemperature);

    @Query("DELETE FROM EquipmentTemperature")
    void deleteAll();

    @Query("SELECT * FROM EquipmentTemperature ORDER BY equipTemperatureID ASC")
    List<EquipmentTemperature> getEquipmentTemperatureData();

}
