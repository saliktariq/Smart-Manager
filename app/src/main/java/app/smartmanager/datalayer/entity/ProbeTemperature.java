package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

import app.smartmanager.helper.DateTime;
import app.smartmanager.helper.enums.ProbeCalibrationMethod;

@Entity
public class ProbeTemperature {
    @PrimaryKey(autoGenerate = true)
    private int ptID;

    private int associatedProbeID;

    private int associatedUserID;

    private int probeCalibrationMethod;

    private float temperature;

    private String temperatureUnit;

    private Date dateTime;

    public ProbeTemperature(int ptID, int associatedProbeID, int associatedUserID, int probeCalibrationMethod, float temperature, String temperatureUnit, Date dateTime) {
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

    public int getProbeCalibrationMethod() {
        return probeCalibrationMethod;
    }

    public float getTemperature() {
        return temperature;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public Date getDateTime() {
        return dateTime;
    }
}
