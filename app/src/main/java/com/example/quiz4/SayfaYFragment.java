package com.example.quiz4;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.BackEvent;

import com.example.quiz4.databinding.FragmentSayfaYBinding;


public class SayfaYFragment extends Fragment {

    private FragmentSayfaYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaYBinding.inflate(inflater,container,false);


        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                // Geri tuşuna basıldığında anasayfaya yönlendir
                Navigation.findNavController(requireView()).navigate(R.id.sayfaYdenAnasayfaya);
            }
        });

        return binding.getRoot();
    }
}