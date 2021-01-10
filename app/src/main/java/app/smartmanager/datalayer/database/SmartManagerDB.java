package app.smartmanager.datalayer.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import app.smartmanager.datalayer.dao.ProbeDataAccessObject;
import app.smartmanager.datalayer.entity.Probe;
import app.smartmanager.helper.MyApplication;

//Implementation following https://developer.android.com/codelabs/android-room-with-a-view#7

@Database(entities = {Probe.class}, version = 1, exportSchema = false)
    public abstract class SmartManagerDB extends RoomDatabase {

        public abstract ProbeDataAccessObject probeDao();

        private static volatile SmartManagerDB INSTANCE;
        private static final int NO_OF_THREADS = 4;
        public static final ExecutorService databaseWriteExecutor =
                Executors.newFixedThreadPool(NO_OF_THREADS);

        // Creating a SINGLETON of the Database class
        public static SmartManagerDB getDatabase(final Context context){
            if(INSTANCE == null) {
                //Making sure the database class is synchronised among all instances
                synchronized (SmartManagerDB.class){
                    if(INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(MyApplication.getContext(), SmartManagerDB.class, "smart_manager").build();
                    }
                }
            }
            return INSTANCE;
        }

    }
