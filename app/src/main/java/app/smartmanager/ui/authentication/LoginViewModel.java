package app.smartmanager.ui.authentication;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import app.smartmanager.repository.Repository;

public class LoginViewModel extends AndroidViewModel {

    private Repository myRepository;

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }
}
