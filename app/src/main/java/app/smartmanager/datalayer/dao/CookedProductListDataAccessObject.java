package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import app.smartmanager.datalayer.entity.CookedProductList;

@Dao
public interface CookedProductListDataAccessObject {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(CookedProductList cookedProductList);

    @Query("DELETE FROM CookedProductList")
    void deleteAll();

    @Query("SELECT * from CookedProductList ORDER BY cookedProductListID ASC")
    List<CookedProductList> getAllCookedProductListData();

}

