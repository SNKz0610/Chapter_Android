package com.example.testing.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testing.R;
import com.example.testing.model.Repository;

import java.util.ArrayList;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder> {
    private ArrayList<Repository> arrRepo;
    private Context context;

    public RepoAdapter(ArrayList<Repository> arrRepo, Context context) {
        this.arrRepo = arrRepo;
        this.context = context;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RepoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_respository, parent, false);
        return new RepoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RepoAdapter.ViewHolder holder, int position) {
        Repository repository = arrRepo.get(position);
        holder.tvRepository.setText(arrRepo.get(position).getRepository().toString()+"");
    }

    @Override
    public int getItemCount() {
        if(arrRepo != null){
            return arrRepo.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvRepository;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRepository = itemView.findViewById(R.id.tv_respository);
        }
    }
}
