package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.Probe;
import app.smartmanager.datalayer.entity.ProbeTemperature;

@Dao
public interface ProbeTemperatureDataAccessObject {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(ProbeTemperature probeTemperature);

    @Query("DELETE FROM ProbeTemperature")
    void deleteAll();

    @Query("SELECT * FROM ProbeTemperature ORDER BY ptID ASC")
    List<ProbeTemperature> getAllProbeTemperatureData();


}
