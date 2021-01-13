package app.smartmanager.datalayer.relationalobjects;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import app.smartmanager.datalayer.entity.CleaningRecord;
import app.smartmanager.datalayer.entity.CleaningTask;

public class CleaningTaskToCleaningRecord {
    @Embedded public CleaningTask cleaningTask;
    @Relation(
            parentColumn = "taskID",
            entityColumn = "associatedTaskID"
    )
    public List<CleaningRecord> cleaningRecords;
}
