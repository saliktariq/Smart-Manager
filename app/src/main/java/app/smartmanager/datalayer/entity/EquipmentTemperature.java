package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import app.smartmanager.helper.DateTime;

@Entity
public class EquipmentTemperature {
    @PrimaryKey(autoGenerate = true)
    private int equiTemperatureID;

    private int associatedEquipmentID;
    private float temperature;
    private int associatedUserID;
    private DateTime dateTime;

    public EquipmentTemperature(int equiTemperatureID, int associatedEquipmentID, float temperature, int associatedUserID, DateTime dateTime) {
        this.equiTemperatureID = equiTemperatureID;
        this.associatedEquipmentID = associatedEquipmentID;
        this.temperature = temperature;
        this.associatedUserID = associatedUserID;
        this.dateTime = dateTime;
    }

    public int getEquiTemperatureID() {
        return equiTemperatureID;
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

    public DateTime getDateTime() {
        return dateTime;
    }
}
