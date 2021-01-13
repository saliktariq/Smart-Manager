package app.smartmanager.datalayer.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import app.smartmanager.helper.enums.AccessLevel;

@Entity
public class Authentication {

    @PrimaryKey(autoGenerate = true)
    private int userID;
    private int accessLevel;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private long accountAuthenticationCode;
    private long password;

    public Authentication(int userID, int accessLevel, String firstName, String lastName, String emailAddress, String phoneNumber, long accountAuthenticationCode, long password) {
        this.userID = userID;
        this.accessLevel = accessLevel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.accountAuthenticationCode = accountAuthenticationCode;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getAccountAuthenticationCode() {
        return accountAuthenticationCode;
    }

    public long getPassword() {
        return password;
    }
}
