package app.smartmanager.probe;
import android.content.Context;
import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.IOException;
import java.util.List;

import app.smartmanager.datalayer.dao.ProbeDataAccessObject;
import app.smartmanager.datalayer.database.SmartManagerDB;
import app.smartmanager.datalayer.entity.Probe;

@RunWith(AndroidJUnit4.class)
public class InsertAndRetrieveProbe {
    private ProbeDataAccessObject probeDao;
    private SmartManagerDB database;

    @Before
    public void createDatabase(){
        Context appContext = ApplicationProvider.getApplicationContext();
        database = Room.inMemoryDatabaseBuilder(appContext, SmartManagerDB.class).build();
        probeDao = database.probeDao();
        }

    @After
    public void closeDatabase() throws IOException {
        database.close();
    }

    @Test
    public void insertAndRetrieveProbe() throws Exception{
        Probe probe = new Probe(0,"WHITE COLOR","White");
        probeDao.insert(probe);
        List<Probe> result = probeDao.getAllProbeData();
        Assert.assertEquals(probe.getName(),result.get(0).getName());
        Assert.assertEquals(probe.getIdentifier(),result.get(0).getIdentifier());
    }
}
