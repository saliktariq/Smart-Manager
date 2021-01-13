package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
import app.smartmanager.datalayer.entity.Equipment;


@Dao
public interface EquipmentDataAccessObject {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Equipment equipment);

    @Query("DELETE FROM Equipment")
    void deleteAll();

    @Query("SELECT * FROM Equipment ORDER BY equipmentID ASC")
    List<Equipment> getEquipmentData();
}
