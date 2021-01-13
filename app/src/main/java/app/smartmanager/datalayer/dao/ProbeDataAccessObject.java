package app.smartmanager.datalayer.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

import app.smartmanager.datalayer.entity.Probe;
import app.smartmanager.datalayer.relationalobjects.ProbeWithAssociatedTemperatures;

@Dao
public interface ProbeDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Probe probe);

    @Query("DELETE FROM Probe")
    void deleteAll();

    @Query("SELECT * FROM Probe ORDER BY probeID ASC")
    List<Probe> getAllProbeData();

    //Method to observe data change in the database
    @Query("SELECT * FROM Probe ORDER BY probeID ASC")
    LiveData<List<Probe>> liveProbeData();

    //Method to retrieve all temperature data associated to a probeID
    @Transaction
    @Query("SELECT * from Probe WHERE probeID LIKE :probeID")
    List<ProbeWithAssociatedTemperatures> getTemperatureDataForProbe(int probeID);
}
