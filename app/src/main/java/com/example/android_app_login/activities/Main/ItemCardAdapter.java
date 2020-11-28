package com.example.android_app_login.activities.Main;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.android_app_login.R;

import java.util.List;

public class ItemCardAdapter extends RecyclerView.Adapter<ItemCardAdapter.ItemViewHolder> {

    Context context;
    List<ItemCardsModel> itemCardsModelList;
    private OnItemListener mOnItemListener;


    public ItemCardAdapter(Context context, List<ItemCardsModel> itemCardsModelList,
                           OnItemListener onItemListener) {
        this.context = context;
        this.itemCardsModelList = itemCardsModelList;
        this.mOnItemListener = onItemListener;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).
                inflate(R.layout.main_item_cardview, parent, false);
        return new ItemViewHolder(view, mOnItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemCardsModel itemCardsModel = itemCardsModelList.get(position);

        ImageView imageView = holder.ItemPhotoImageView;
        int imageURL = itemCardsModel.getPhoto();

        TextView profileNameTextView = holder.ItemName;
        String itemName = itemCardsModel.getItem();

        View bottomLine = holder.bottomLine;
        String bottomColor = itemCardsModel.getBottomColor();

        Glide.with(context)
                .load(imageURL)
                .into(imageView);

        profileNameTextView.setText(itemName);

        bottomLine.setBackgroundColor(Color.parseColor(bottomColor));


    }

    @Override
    public int getItemCount() {
        return itemCardsModelList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView ItemPhotoImageView;
        TextView ItemName;
        View bottomLine;
        OnItemListener onItemListener;

        public ItemViewHolder(@NonNull View itemView, OnItemListener onItemListener) {
            super(itemView);

            ItemPhotoImageView = itemView.findViewById(R.id.ItemCardView);
            ItemName = itemView.findViewById(R.id.itemName);
            bottomLine = itemView.findViewById(R.id.bottomLine);
            this.onItemListener = onItemListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onItemListener.onItemClick(getAdapterPosition());
        }
    }

    public interface OnItemListener {
        void onItemClick (int position);
    }
}
