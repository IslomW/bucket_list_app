package com.example.bucketlistapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketAdapter extends RecyclerView.Adapter<BucketAdapter.BucketViewHolder> {

    Bucket[] bucket;

    BucketAdapter(Bucket[] buckets) {
        this.bucket = buckets;
    }

    @NonNull
    @Override
    public BucketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket, parent, false);

        return new BucketViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketViewHolder holder, int position) {

        holder.bind(bucket[position]);
    }

    @Override
    public int getItemCount() {
        return bucket.length;
    }

    static class BucketViewHolder extends RecyclerView.ViewHolder {

        private ImageView appImage;
        private TextView appName;
        private TextView appDescription;

        public BucketViewHolder(@NonNull View itemView) {
            super(itemView);

            appName = itemView.findViewById(R.id.text_view_head);
            appDescription= itemView.findViewById(R.id.text_view_description);
            appImage= itemView.findViewById(R.id.image_view_image);
        }

        public void bind(Bucket bucket) {
            appImage.setImageResource(bucket.image);
            appName.setText(bucket.name);
            appDescription.setText(bucket.description);
        }

    }
}
