package com.xapinky.i_soccer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context mContext;
    public List<model_berita> blogList;
    //RequestOptions options;
    private CardView cardView;

    public RecyclerViewAdapter(List<model_berita> blogList, Context aContext){
        this.mContext = aContext;
        this.blogList = blogList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.view_rv_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {

        final String gambarberita = blogList.get(position).getGambar_berita();
        final String isiberita = blogList.get(position).getIsi_berita();
        final String judul = blogList.get(position).getJudul_berita();
        Glide.with(mContext).load(gambarberita).into(viewHolder.imageView);
        viewHolder.setTitle(judul);


        //viewHolder.setCardView(cardView);
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailBerita.class);
                intent.putExtra("gambar_berita", gambarberita);
                intent.putExtra("isi_berita", isiberita);
                intent.putExtra("judul_berita", judul);

                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return blogList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title, subtitle;
        private ImageView imageView;
        private View nView;
        private RelativeLayout cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nView = itemView;
            title = (TextView) itemView.findViewById(R.id.tv_title);
            imageView = (ImageView) itemView.findViewById(R.id.icon);
            cardView = (RelativeLayout) itemView.findViewById(R.id.cardView_id);
            //namaGunungView = (TextView) itemView.findViewById(R.id.nama_gunung_id);
        }

        public void setTitle(String judul) {
            title = nView.findViewById(R.id.tv_title);
            title.setText(judul);
        }


        }
    }

