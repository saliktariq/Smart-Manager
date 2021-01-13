package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

import app.smartmanager.helper.DateTime;

@Entity
public class ProductTemperature {
    @PrimaryKey(autoGenerate = true)
    private int productTemperatureID;
    private int associatedProductID;
    private int associatedUserID;
    private double temperature;
    private Date dateTime;

    public ProductTemperature(int productTemperatureID, int associatedProductID, int associatedUserID, double temperature, Date dateTime) {
        this.productTemperatureID = productTemperatureID;
        this.associatedProductID = associatedProductID;
        this.associatedUserID = associatedUserID;
        this.temperature = temperature;
        this.dateTime = dateTime;
    }

    public int getProductTemperatureID() {
        return productTemperatureID;
    }

    public int getAssociatedProductID() {
        return associatedProductID;
    }

    public int getAssociatedUserID() {
        return associatedUserID;
    }

    public double getTemperature() {
        return temperature;
    }

    public Date getDateTime() {
        return dateTime;
    }
}
