package app.smartmanager.probe;

import android.content.Context;
import android.util.Log;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import app.smartmanager.datalayer.dao.ProbeDataAccessObject;
import app.smartmanager.datalayer.dao.ProbeTemperatureDataAccessObject;
import app.smartmanager.datalayer.database.SmartManagerDB;
import app.smartmanager.datalayer.entity.Probe;
import app.smartmanager.datalayer.entity.ProbeTemperature;
import app.smartmanager.datalayer.relationalobjects.ProbeWithAssociatedTemperatures;

@RunWith(AndroidJUnit4.class)
public class ProbeProbeTemperatureRelationship {

    private ProbeDataAccessObject probeDao;
    private ProbeTemperatureDataAccessObject probeTemperatureDao;
    private SmartManagerDB database;

    @Before
    public void createDatabase(){
        Context appContext = ApplicationProvider.getApplicationContext();
        database = Room.inMemoryDatabaseBuilder(appContext, SmartManagerDB.class).build();
        probeDao = database.probeDao();
        probeTemperatureDao = database.probeTemperatureDao();
    }

    @After
    public void closeDatabase() throws IOException {
        database.close();
    }

    @Test
    public void probeProbeTemperatureRelationshipTest() throws Exception{
        probeDao.deleteAll();
        probeTemperatureDao.deleteAll();

        //Inserting probe data into Probe table
        Probe probe = new Probe(0,"WHITE COLOR","White");
        probeDao.insert(probe);

        //Create ProbeTemperature data
        ProbeTemperature probeTemperature = new ProbeTemperature(0,1,1,1,2.5,"F",new Date(2020,1,11,21,10,5));
        ProbeTemperature probeTemperature2 = new ProbeTemperature(0,1,1,2,3.5,"F",new Date(2020,1,12,22,20,15));
        ProbeTemperature probeTemperature3 = new ProbeTemperature(0,1,1,2,2.0,"F",new Date(2020,1,13,23,30,25));

        probeTemperatureDao.insert(probeTemperature);
        probeTemperatureDao.insert(probeTemperature2);
        probeTemperatureDao.insert(probeTemperature3);

        List<ProbeWithAssociatedTemperatures> resultRetrieved = probeDao.getTemperatureDataForProbe(1);
        ArrayList<Double> resultSet = new ArrayList<Double>();
        for(ProbeWithAssociatedTemperatures entries: resultRetrieved){
            for(ProbeTemperature temp: entries.temperatures){
                resultSet.add(temp.getTemperature());
            }
        }

        Assert.assertEquals(probeTemperature.getTemperature(),resultSet.get(0),0.0);
        Assert.assertEquals(probeTemperature2.getTemperature(),resultSet.get(1),0.0);
        Assert.assertEquals(probeTemperature3.getTemperature(),resultSet.get(2),0.0);
    }

}
