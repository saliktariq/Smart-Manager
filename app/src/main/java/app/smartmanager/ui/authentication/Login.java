package app.smartmanager.ui.authentication;

import androidx.lifecycle.ViewModelProvider;
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
import app.smartmanager.databinding.LoginFragmentBinding;

public class Login extends Fragment {

    private LoginViewModel loginViewModel;
    private LoginFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = LoginFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        loginViewModel = new ViewModelProvider(requireActivity()).get(LoginViewModel.class);
        binding.buttonLogin.setOnClickListener(view1 -> {

            /*
            Temporarily skipping authentication check to implement application
            Authentication will be implemented in due course
             */
            Navigation.findNavController(view).navigate(LoginDirections.actionLoginToHomeScreen());
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
