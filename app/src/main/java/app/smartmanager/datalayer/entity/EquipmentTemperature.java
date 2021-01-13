package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

import app.smartmanager.helper.DateTime;

@Entity
public class EquipmentTemperature {
    @PrimaryKey(autoGenerate = true)
    private int equipTemperatureID;

    private int associatedEquipmentID;
    private float temperature;
    private int associatedUserID;
    private Date dateTime;

    public EquipmentTemperature(int equipTemperatureID, int associatedEquipmentID, float temperature, int associatedUserID, Date dateTime) {
        this.equipTemperatureID = equipTemperatureID;
        this.associatedEquipmentID = associatedEquipmentID;
        this.temperature = temperature;
        this.associatedUserID = associatedUserID;
        this.dateTime = dateTime;
    }

    public int getEquipTemperatureID() {
        return equipTemperatureID;
    }

    public int getAssociatedEquipmentID() {
        return associatedEquipmentID;
    }

    public float getTemperature() {
        return temperature;
    }

    public int getAssociatedUserID() {
        return associatedUserID;
    }

    public Date getDateTime() {
        return dateTime;
    }
}
