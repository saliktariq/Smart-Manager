package app.smartmanager.ui.authentication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;


import app.smartmanager.repository.Repository;

public class UpdatePasswordViewModel extends AndroidViewModel {
    private Repository myRepository;

    public UpdatePasswordViewModel(@NonNull Application application) {
        super(application);
    }

}
