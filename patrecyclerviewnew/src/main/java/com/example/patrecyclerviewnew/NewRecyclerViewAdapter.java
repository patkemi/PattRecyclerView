package com.example.patrecyclerviewnew;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class NewRecyclerViewAdapter extends RecyclerView.Adapter<NewRecyclerViewAdapter.ViewHolder>{

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageView;
        TextView blessed;
        RelativeLayout precious;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           imageView = itemView.findViewById(R.id.image);
           blessed = itemView.findViewById(R.id.imagename);
           precious = itemView.findViewById(R.id.newparent);
        }
    }
}
