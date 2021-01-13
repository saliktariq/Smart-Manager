package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.MandatoryChecks;

@Dao
public interface MandatoryChecksDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(MandatoryChecks mandatoryChecks);

    @Query("DELETE FROM MandatoryChecks")
    void deleteAll();

    @Query("SELECT * FROM MandatoryChecks ORDER BY mandatoryChecksID ASC")
    List<MandatoryChecks> getAllMandatoryChecksData();

}
