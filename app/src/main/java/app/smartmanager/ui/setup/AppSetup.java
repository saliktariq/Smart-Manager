package app.smartmanager.ui.setup;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.smartmanager.R;
import app.smartmanager.databinding.AppSetupFragmentBinding;

public class AppSetup extends Fragment {

    private AppSetupViewModel appSetupViewModel;
    private AppSetupFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = AppSetupFragmentBinding.inflate(inflater,container, false);
        View view = binding.getRoot();
        binding.addNewProbeButton.setOnClickListener( view1 -> {
            Navigation.findNavController(view).navigate(AppSetupDirections.actionAppSetupToSetupNewProbe());
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
