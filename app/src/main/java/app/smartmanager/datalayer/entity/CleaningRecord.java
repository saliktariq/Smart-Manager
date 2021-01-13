package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import app.smartmanager.helper.DateTime;

@Entity
public class CleaningRecord {

    @PrimaryKey(autoGenerate = true)
    private int cleaningRecordID;
    private int associatedTaskID;
    private int associatedUserID;
    private DateTime dateTime;

    public CleaningRecord(int cleaningRecordID, int associatedTaskID, int associatedUserID, DateTime dateTime) {
        this.cleaningRecordID = cleaningRecordID;
        this.associatedTaskID = associatedTaskID;
        this.associatedUserID = associatedUserID;
        this.dateTime = dateTime;
    }

    public int getCleaningRecordID() {
        return cleaningRecordID;
    }

    public int getAssociatedTaskID() {
        return associatedTaskID;
    }

    public int getAssociatedUserID() {
        return associatedUserID;
    }

    public DateTime getDateTime() {
        return dateTime;
    }
}
