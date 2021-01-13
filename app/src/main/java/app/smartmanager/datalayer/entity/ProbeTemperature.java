package app.smartmanager.datalayer.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import app.smartmanager.helper.DateTime;

@Entity
public class ProbeTemperature {
    @PrimaryKey(autoGenerate = true)
    private int ptID;

    @NonNull
    private int associatedProbeID;

    @NonNull
    private int associatedUserID;

    private String testMethod;

    private float temperature;

    private String temperatureUnit;

    private DateTime dateTime; //Signature DateTime(int minute, int hour, int day, int month, int year)

    public ProbeTemperature(int ptID, int associatedProbeID, int associatedUserID, String testMethod, float temperature, String temperatureUnit, DateTime dateTime) {
        this.ptID = ptID;
        this.associatedProbeID = associatedProbeID;
        this.associatedUserID = associatedUserID;
        this.testMethod = testMethod;
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

    public String getTestMethod() {
        return testMethod;
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
