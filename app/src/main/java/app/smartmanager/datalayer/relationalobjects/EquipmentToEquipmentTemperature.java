package app.smartmanager.datalayer.relationalobjects;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import app.smartmanager.datalayer.entity.Equipment;
import app.smartmanager.datalayer.entity.EquipmentTemperature;

public class EquipmentToEquipmentTemperature {
    @Embedded public Equipment equipment;
    @Relation(
            parentColumn = "equipmentID",
            entityColumn = "associatedEquipmentID"
    )
    public List<EquipmentTemperature> temperatures;
}
