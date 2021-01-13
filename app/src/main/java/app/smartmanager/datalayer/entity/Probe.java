package app.smartmanager.datalayer.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Probe")
public class Probe {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "probeID")
    private int probeID;

    private String identifier;

    private String name;

    public Probe(int probeID, String identifier, String name) {
        this.probeID = probeID;
        this.identifier = identifier;
        this.name = name;
    }

    public int getProbeID() {
        return probeID;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }


}

