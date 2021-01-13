package app.smartmanager.datalayer.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.MandatoryChecksRecord;

@Dao
public interface MandatoryChecksRecordDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(MandatoryChecksRecord mandatoryChecksRecord);

    @Query("DELETE FROM MandatoryChecksRecord")
    void deleteAll();

    @Query("SELECT * FROM MandatoryChecksRecord ORDER BY mandatoryChecksRecordID ASC")
    List<MandatoryChecksRecord> getAllMandatoryChecksRecordData();
}
