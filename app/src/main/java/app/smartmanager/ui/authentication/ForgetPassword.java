package app.smartmanager.ui.authentication;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.smartmanager.databinding.ForgetPasswordFragmentBinding;

public class ForgetPassword extends Fragment {

    private ForgetPasswordViewModel forgetPasswordViewModel;
    private ForgetPasswordFragmentBinding binding;

      @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
          binding = ForgetPasswordFragmentBinding.inflate(inflater, container, false);
          View view = binding.getRoot();
          forgetPasswordViewModel = new ViewModelProvider(requireActivity()).get(ForgetPasswordViewModel.class);
          return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
