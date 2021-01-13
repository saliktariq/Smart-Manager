package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
import app.smartmanager.datalayer.entity.CleaningTask;


@Dao
public interface CleaningTaskDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(CleaningTask cleaningTask);

    @Query("DELETE FROM CleaningTask")
    void deleteAll();

    @Query("SELECT * from CleaningTask ORDER BY taskID ASC")
    List<CleaningTask> getAllCleaningTaskData();

}
