package com.nomad.android38.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomad.android38.OnClick;
import com.nomad.android38.R;
import com.nomad.android38.adapter.LocationAdapter;
import com.nomad.android38.databinding.FragmentLocationBinding;
import com.nomad.android38.model.Charactersss;

import java.util.ArrayList;

public class LocationFragment extends Fragment implements OnClick {
    private FragmentLocationBinding binding;
    private LocationAdapter adapter;
    private ArrayList<Charactersss> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLocationBinding.inflate(LayoutInflater.from(requireContext()),
                container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new LocationAdapter(this,list);
        binding.recycleLocation.setAdapter(adapter);
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));
        list.add(new Charactersss("Sashka Krasava","alive"));

    }

    @Override
    public void onClick(Charactersss character) {

    }
}