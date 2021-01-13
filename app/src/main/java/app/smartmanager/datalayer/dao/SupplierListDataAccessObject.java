package app.smartmanager.datalayer.dao;

import android.drm.DrmStore;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.SupplierList;

@Dao
public interface SupplierListDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(SupplierList supplierList);

    @Query("DELETE FROM SupplierList")
    void deleteAll();

    @Query("SELECT * FROM SupplierList ORDER BY supplierID ASC")
    List<SupplierList> getAllSupplierList();

}
