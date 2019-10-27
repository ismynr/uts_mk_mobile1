package com.ismynr.submission_reviewhostingid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ismynr.submission_reviewhostingid.entity.Hosting;

import java.util.ArrayList;

public class HostingAdapter extends RecyclerView.Adapter<HostingAdapter.HostingViewHolder> {

    private ArrayList<Hosting> listHosting;
    private OnItemClickCallback onItemClickCallback;

    public HostingAdapter(ArrayList<Hosting> list){
        this.listHosting = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public HostingAdapter.HostingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_host, parent, false);
        return new HostingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final HostingAdapter.HostingViewHolder holder, int position) {
        Hosting host = listHosting.get(position);
        Glide.with(holder.itemView.getContext())
                .load(host.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvNama.setText(host.getNama());
        holder.tvDeskripsi.setText(host.getDeskripsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listHosting.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHosting.size();
    }

    public class HostingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDeskripsi;

        public HostingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_item_nama);
            tvDeskripsi = itemView.findViewById(R.id.tv_item_detail);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Hosting data);
    }
}
