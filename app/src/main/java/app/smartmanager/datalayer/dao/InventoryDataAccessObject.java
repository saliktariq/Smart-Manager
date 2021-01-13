package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.Inventory;

@Dao
public interface InventoryDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Inventory inventory);

    @Query("DELETE FROM Inventory")
    void deleteAll();

    @Query("SELECT * FROM Inventory ORDER BY inventoryRecordID ASC")
    List<Inventory> getAllInventoryData();

}
