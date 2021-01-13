package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import app.smartmanager.helper.DateTime;

@Entity
public class MandatoryChecksRecord {

    @PrimaryKey(autoGenerate = true)
    private int mandatoryChecksRecordID;
    private int associatedMandatoryCheckID;
    private DateTime dateTime;
    private int associatedUserID;

    public MandatoryChecksRecord(int mandatoryChecksRecordID, int associatedMandatoryCheckID, DateTime dateTime, int associatedUserID) {
        this.mandatoryChecksRecordID = mandatoryChecksRecordID;
        this.associatedMandatoryCheckID = associatedMandatoryCheckID;
        this.dateTime = dateTime;
        this.associatedUserID = associatedUserID;
    }

    public int getMandatoryChecksRecordID() {
        return mandatoryChecksRecordID;
    }

    public int getAssociatedMandatoryCheckID() {
        return associatedMandatoryCheckID;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public int getAssociatedUserID() {
        return associatedUserID;
    }
}
