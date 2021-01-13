package app.smartmanager.repository;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;
import app.smartmanager.datalayer.dao.ProbeDataAccessObject;
import app.smartmanager.datalayer.database.SmartManagerDB;
import app.smartmanager.datalayer.entity.Probe;

public class Repository {

    private ProbeDataAccessObject probeDao;
    private LiveData<List<Probe>> liveProbeData;


    Repository(Application app){
        SmartManagerDB database = SmartManagerDB.getDatabase(app);
        probeDao = database.probeDao();
        //LiveData object in constructor to continuously observe changes in the database
        liveProbeData = probeDao.liveProbeData();
    }

    //Repository method to get updated list of data held in DB
    LiveData<List<Probe>> liveProbeData(){
        return liveProbeData;
    }

    //Insert data into Probe tabse
    void insert(Probe probe){
        SmartManagerDB.databaseWriteExecutor.execute(() -> {
            probeDao.insert(probe);
        });
    }

    //Get all probe data upon query
    void getAllProbeData(){
        SmartManagerDB.databaseWriteExecutor.execute(()->{
            probeDao.getAllProbeData();
        });
    }


}
