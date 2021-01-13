package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CleaningTask {

    @PrimaryKey(autoGenerate = true)
    private int taskID;
    private String description;
    private int associatedEquipmentID; //Optional
    private int taskFrequency; // 0: Optional 1: Daily 7: Weekly

    public CleaningTask(int taskID, String description, int associatedEquipmentID, int taskFrequency) {
        this.taskID = taskID;
        this.description = description;
        this.associatedEquipmentID = associatedEquipmentID;
        this.taskFrequency = taskFrequency;
    }

    public int getTaskID() {
        return taskID;
    }

    public String getDescription() {
        return description;
    }

    public int getAssociatedEquipmentID() {
        return associatedEquipmentID;
    }

    public int getTaskFrequency() {
        return taskFrequency;
    }
}
