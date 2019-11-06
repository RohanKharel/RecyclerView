package com.rohankharel.recyclerview.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rohankharel.recyclerview.R;
import com.rohankharel.recyclerview.model.Detail;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DatasViewHolder>{
    Context mContext;
    List<Detail> detailList;

    public DetailAdapter(Context mContext, List<Detail> detailList) {
        this.mContext = mContext;
        this.detailList = detailList;
    }

    @NonNull
    @Override
    public DatasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_data,parent,false);
        return new DatasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DatasViewHolder holder, int position) {
        final Detail detail = detailList.get(position);
        holder.circleimgdata.setImageResource(detail.getImageId());
        holder.txtName.setText(detail.getName());
        holder.txtAge.setText(detail.getAge());
        holder.txtGender.setText(detail.getGender());

    }

    @Override
    public int getItemCount() {
        return detailList.size();
    }


    public class DatasViewHolder extends RecyclerView.ViewHolder{
        CircleImageView circleimgdata;
        TextView txtName, txtAge, txtGender;
        ImageButton btnDelete;

        public DatasViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtAge = itemView.findViewById(R.id.txtAge);
            txtGender = itemView.findViewById(R.id.txtGender);
            circleimgdata = itemView.findViewById(R.id.circledataimg);
            btnDelete = itemView.findViewById(R.id.btndelete);
        }
    }
}


