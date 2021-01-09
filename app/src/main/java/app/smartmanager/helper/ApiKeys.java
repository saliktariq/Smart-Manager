package app.smartmanager.helper;

public class ApiKeys {

    //API key for SendGrid Email Service

    private static  final String EMAIL = "no-reply@smartmanager.app";
    private static  final String PASSWORD = "SmartManager2021";

    ApiKeys(){
        super();
    }
    static String getEmail(){
        return EMAIL;
    }
    static String getPassword(){
        return PASSWORD;
    }

}
