package com.app.shofianra.uts_1157050156;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.app.shofianra.uts_1157050156.R;
import com.app.shofianra.uts_1157050156.PertandinganActivity;
import com.app.shofianra.uts_1157050156.Pertandingan;

public class PertandinganAdapter extends RecyclerView.Adapter<PertandinganAdapter.ViewHolder> {

    private Context context;
    private List<Pertandingan> listPertandingan;

    public PertandinganAdapter(Context context, List<Pertandingan> listPertandingan) {
        this.context = context;
        this.listPertandingan = listPertandingan;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_pertandingan, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(layoutParams);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Pertandingan pertandingan = listPertandingan.get(position);
        Glide.with(context).load(pertandingan.getLogoTimSatu()).into(holder.imageTimSatu);
        Glide.with(context).load(pertandingan.getLogoTimDua()).into(holder.imageTimDua);
        holder.txtTimSatu.setText(pertandingan.getNamaTimSatu());
        holder.txtTimDua.setText(pertandingan.getNamaTimDua());
        holder.cvPertandingan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, PertandinganActivity.class);
                i.putExtra("pertandingan", pertandingan);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPertandingan.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.logo_tim_satu)
        ImageView imageTimSatu;
        @BindView(R.id.logo_tim_dua)
        ImageView imageTimDua;
        @BindView(R.id.txt_tim_satu)
        TextView txtTimSatu;
        @BindView(R.id.txt_tim_dua)
        TextView txtTimDua;
        @BindView(R.id.cv_pertandingan)
        CardView cvPertandingan;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}



