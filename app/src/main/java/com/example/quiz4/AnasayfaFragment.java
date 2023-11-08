package com.example.quiz4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quiz4.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false);


        binding.buttonA.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.gitSayfaA);
        });

        binding.buttonX.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.gitSayfaX);
        });


        return binding.getRoot();
    }
}