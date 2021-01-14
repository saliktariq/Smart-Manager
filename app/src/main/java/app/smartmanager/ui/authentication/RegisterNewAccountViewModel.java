package app.smartmanager.ui.authentication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import app.smartmanager.repository.Repository;

public class RegisterNewAccountViewModel extends AndroidViewModel {
    private Repository myRepository;
    public RegisterNewAccountViewModel(@NonNull Application application) {
        super(application);
    }
}
