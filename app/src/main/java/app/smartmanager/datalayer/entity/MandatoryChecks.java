package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import app.smartmanager.helper.enums.CheckType;

@Entity
public class MandatoryChecks {
    @PrimaryKey(autoGenerate = true)
    private int mandatoryChecksID;
    private CheckType checkType;
    private String checkDescription;

    public MandatoryChecks(int mandatoryChecksID, CheckType checkType, String checkDescription) {
        this.mandatoryChecksID = mandatoryChecksID;
        this.checkType = checkType;
        this.checkDescription = checkDescription;
    }

    public int getMandatoryChecksID() {
        return mandatoryChecksID;
    }

    public CheckType getCheckType() {
        return checkType;
    }

    public String getCheckDescription() {
        return checkDescription;
    }
}
