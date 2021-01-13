package app.smartmanager.datalayer.relationalobjects;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import app.smartmanager.datalayer.entity.Probe;
import app.smartmanager.datalayer.entity.ProbeTemperature;

/**
 * Object to retrieve all ProbeTemperature data
 * associated to a particular probeID
 */
public class ProbeWithAssociatedTemperatures {
    @Embedded public Probe probe;
    @Relation(
            parentColumn = "probeID",
            entityColumn = "associatedProbeID"
    )
    public List<ProbeTemperature> temperatures;
}
