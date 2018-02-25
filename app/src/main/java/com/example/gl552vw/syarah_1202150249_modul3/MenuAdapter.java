package com.example.gl552vw.syarah_1202150249_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by GL552VW on 2/24/2018.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    //menampung data di adapter
    private final LinkedList<String> ListMerk;
    private final LinkedList<String> ListDeskripsi;
    private final LinkedList<Integer> ListGambar;
    private final LinkedList<String> ListDetail;
    private LayoutInflater mInflater;

    public MenuAdapter(Context context, LinkedList<String> listMerk, LinkedList<String> listDeskripsi, LinkedList<Integer> listGambar, LinkedList<String> listDetail) {
        this.ListMerk = listMerk;
        this.ListDeskripsi = listDeskripsi;
        this.ListGambar = listGambar;
        this.ListDetail = listDetail;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_daftar, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MenuAdapter.MenuViewHolder holder, int position) {
        String mCurrentMerk = ListMerk.get(position);
        String mCurrentDesk = ListDeskripsi.get(position);
        Integer mCurrentGbr = ListGambar.get(position);
        //String mCurrentDetail = ListDetail.get(position);
        holder.MerkItemView.setText(mCurrentMerk);
        holder.DeskItemView.setText(mCurrentDesk);
        holder.GbrItemView.setImageResource(mCurrentGbr);

    }

    @Override
    public int getItemCount() {
        return ListMerk.size();
    }

     class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView MerkItemView;
        public final TextView DeskItemView;
        public final ImageView GbrItemView;

        final MenuAdapter mAdapter;

        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            MerkItemView = (TextView) itemView.findViewById(R.id.card_merk);
            DeskItemView = (TextView) itemView.findViewById(R.id.card_deskripsi);
            GbrItemView = (ImageView) itemView.findViewById(R.id.card_gambar);
            GbrItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosition();
                    // Use that to access the affected item in List.
                    String merk = ListMerk.get(mPosition);
                    String deskripsi = ListDeskripsi.get(mPosition);
                    Integer gambar = ListGambar.get(mPosition);
                    String detail = ListDetail.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(),DetailActivity.class);
                    intent.putExtra("merk",merk);
                    intent.putExtra("deskripsi",deskripsi);
                    intent.putExtra("gambar",gambar);
                    intent.putExtra("detail", detail);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }

         @Override
         public void onClick(View v) {

         }
     }
}
