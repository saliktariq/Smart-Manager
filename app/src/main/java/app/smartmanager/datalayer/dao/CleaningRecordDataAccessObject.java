package app.smartmanager.datalayer.dao;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
import app.smartmanager.datalayer.entity.CleaningRecord;

@Dao
public interface CleaningRecordDataAccessObject {

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        void insert(CleaningRecord cleaningRecord);

        @Query("DELETE FROM CleaningRecord")
        void deleteAll();

        @Query("SELECT * from CleaningRecord ORDER BY cleaningRecordID ASC")
        List<CleaningRecord> getAllCleaningRecordData();

    }
