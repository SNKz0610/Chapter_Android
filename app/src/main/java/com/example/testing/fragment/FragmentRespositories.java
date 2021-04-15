package com.example.testing.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.testing.R;
import com.example.testing.adapter.RepoAdapter;
import com.example.testing.model.Repository;

import java.util.ArrayList;

public class FragmentRespositories extends Fragment {
    private ArrayList<Repository> arrRepo;
    private TextView tvRepository;
    private RecyclerView rvRepository;
    private RepoAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_respositories, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvRepository = view.findViewById(R.id.rv_listrepositories);
        arrRepo = new ArrayList<>();
        arrRepo.add(new Repository("Chapter1_Lesson1_Git"));
        arrRepo.add(new Repository("Chapter1_Lesson2_Android"));
        arrRepo.add(new Repository("Chapter1_Lesson3_Kotlin"));
        arrRepo.add(new Repository("Chapter1_Lesson4_Java"));
        arrRepo.add(new Repository("Chapter1_Lesson5_Java Web"));
        arrRepo.add(new Repository("Chapter1_Lesson6_Java Script"));
        arrRepo.add(new Repository("Chapter1_Lesson7_Communication"));

        adapter = new RepoAdapter(arrRepo,view.getContext());
        rvRepository.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rvRepository.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}