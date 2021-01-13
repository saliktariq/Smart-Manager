package app.smartmanager.datalayer.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Equipment {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int equipmentID;

    private String equipmentName;
    private boolean criticalControlRequired;

    public Equipment(int equipmentID, String equipmentName, boolean criticalControlRequired) {
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.criticalControlRequired = criticalControlRequired;
    }

    public int getEquipmentID() {
        return equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public boolean isCriticalControlRequired() {
        return criticalControlRequired;
    }
}
