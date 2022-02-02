package com.nomad.android38.ui;

import static com.nomad.android38.ui.CharacterFragment.key;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomad.android38.R;
import com.nomad.android38.databinding.FragmentScreenBinding;

import java.util.Objects;

public class ScreenFragment extends Fragment {
    private FragmentScreenBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentScreenBinding.inflate(LayoutInflater.from(requireContext()),
                container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        String name = Objects.requireNonNull(getArguments()).getString(key);
//        binding.tvName3.setText(name);
//
//        String live = getArguments().getString(key);
//        binding.tvLive3.setText(live);
//
//        int image = getArguments().getInt(key);
//        binding.imageBig.setImageResource(image);
        loadData();

    }

    private void loadData() {
        Bundle bundle = getArguments();
        String name = Objects.requireNonNull(bundle).getString(key);
        int image = bundle.getInt(key);
        binding.tvLive3.setText(name);
        binding.tvName3.setText(name);
        binding.imageBig.setImageResource(image);
    }
}