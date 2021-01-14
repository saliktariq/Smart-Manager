package app.smartmanager.ui.authentication;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.smartmanager.R;
import app.smartmanager.databinding.UpdatePasswordFragmentBinding;
import app.smartmanager.databinding.UpdateProfileFragmentBinding;

public class UpdateProfile extends Fragment {

    private UpdateProfileViewModel updateProfileViewModel;
    private UpdateProfileFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = UpdateProfileFragmentBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        updateProfileViewModel = new ViewModelProvider(requireActivity()).get(UpdateProfileViewModel.class);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
