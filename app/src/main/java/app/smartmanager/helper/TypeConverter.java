package app.smartmanager.helper;

import java.util.Date;

public class TypeConverter {
    @androidx.room.TypeConverter
    public static Date convertTimeStampToDate(Long date){
        if (date == null){
            return null;
        } else {
            return new Date(date);
        }
    }

    @androidx.room.TypeConverter
    public static Long convertDateToTimeStamp(Date date){
        if (date == null){
            return null;
        } else {
            return date.getTime();
        }
    }
}
