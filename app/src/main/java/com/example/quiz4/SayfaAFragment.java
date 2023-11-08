package com.example.quiz4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quiz4.databinding.FragmentSayfaABinding;


public class SayfaAFragment extends Fragment {

    private FragmentSayfaABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaABinding.inflate(inflater,container,false);


        binding.buttonB.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.sayfaAdanBye);


        });

        return binding.getRoot();
    }
}