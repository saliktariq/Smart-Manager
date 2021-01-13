package app.smartmanager.datalayer.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import app.smartmanager.helper.DateTime;
import app.smartmanager.helper.enums.ProbeCalibrationMethod;

@Entity
public class ProbeTemperature {
    @PrimaryKey(autoGenerate = true)
    private int ptID;

    private int associatedProbeID;

    private int associatedUserID;

    private ProbeCalibrationMethod probeCalibrationMethod;

    private float temperature;

    private String temperatureUnit;

    private DateTime dateTime; //Signature DateTime(int minute, int hour, int day, int month, int year)

    public ProbeTemperature(int ptID, int associatedProbeID, int associatedUserID, ProbeCalibrationMethod probeCalibrationMethod, float temperature, String temperatureUnit, DateTime dateTime) {
        this.ptID = ptID;
        this.associatedProbeID = associatedProbeID;
        this.associatedUserID = associatedUserID;
        this.probeCalibrationMethod = probeCalibrationMethod;
        this.temperature = temperature;
        this.temperatureUnit = temperatureUnit;
        this.dateTime = dateTime;
    }

    public int getPtID() {
        return ptID;
    }

    public int getAssociatedProbeID() {
        return associatedProbeID;
    }

    public int getAssociatedUserID() {
        return associatedUserID;
    }

    public ProbeCalibrationMethod getProbeCalibrationMethod() {
        return probeCalibrationMethod;
    }

    public float getTemperature() {
        return temperature;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public DateTime getDateTime() {
        return dateTime;
    }
}
