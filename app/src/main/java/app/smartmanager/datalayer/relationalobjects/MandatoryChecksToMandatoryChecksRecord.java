package app.smartmanager.datalayer.relationalobjects;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import app.smartmanager.datalayer.entity.MandatoryChecks;
import app.smartmanager.datalayer.entity.MandatoryChecksRecord;

public class MandatoryChecksToMandatoryChecksRecord {
    @Embedded public MandatoryChecks mandatoryChecks;
    @Relation(
            parentColumn = "mandatoryChecksID",
            entityColumn = "associatedMandatoryCheckID"
    )
    public List<MandatoryChecksRecord> mandatoryChecksRecordList;
}
