package app.smartmanager.datalayer.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.Probe;

@Dao
public interface ProbeDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Probe probe);

    @Query("DELETE FROM Probe")
    void deleteAll();

    @Query("SELECT * FROM Probe ORDER BY probeID ASC")
    List<Probe> getAllProbeData();

    //Function to observe data change in the database
    @Query("SELECT * FROM Probe ORDER BY probeID ASC")
    LiveData<List<Probe>> liveProbeData();
}
