package app.smartmanager.datalayer.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;


import app.smartmanager.datalayer.entity.Authentication;

@Dao
public interface AuthenticationDataAccessObject {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Authentication authentication);

    @Query("DELETE FROM Authentication")
    void deleteAll();

    @Query("SELECT * from Authentication ORDER BY userID ASC")
    List<Authentication> getAllAuthenticationData();

}
