package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.CookingRecord;

@Dao
public interface CookingRecordDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(CookingRecord cookingRecord);

    @Query("DELETE from CookingRecord")
    void deleteAll();

    @Query("Select * from CookingRecord ORDER BY cookingRecordID ASC")
    List<CookingRecord> getAllCookingRecordData();


}
