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
import app.smartmanager.databinding.RegisterNewAccountFragmentBinding;

public class RegisterNewAccount extends Fragment {

    private RegisterNewAccountViewModel registerNewAccountViewModel;
    private RegisterNewAccountFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = RegisterNewAccountFragmentBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        registerNewAccountViewModel = new ViewModelProvider(requireActivity()).get(RegisterNewAccountViewModel.class);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
