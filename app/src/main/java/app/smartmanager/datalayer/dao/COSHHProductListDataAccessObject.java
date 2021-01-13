package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.COSHHProductList;

@Dao
public interface COSHHProductListDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(COSHHProductList coshhProductList);

    @Query("DELETE FROM COSHHProductList")
    void deleteAll();

    @Query("SELECT * FROM COSHHProductList ORDER BY coshhproductid ASC")
    List<COSHHProductList> getCOSHHProductListData();
}
