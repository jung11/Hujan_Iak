package com.example.zulfakar.hujan;


import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by zulfakar on 24/11/17.
 * For Personal and Educational Purposes
 * Mudzelty
 */

public class MyListAdapter extends ArrayAdapter<String>{
    private Context context;
    private String[] nama;
    private int[] harga;
    private int[] imageID;

    MyListAdapter(Context context, String[] nama, int[] harga, int[] imageID){
        super(context, R.layout.list_item_style, nama);
        this.nama = nama;
        this.harga = harga;
        this.imageID = imageID;
        this.context = context;
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
       if(convertView == null){
           LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           assert inflater != null;
           convertView = inflater.inflate(R.layout.list_item_style, parent, false);

           viewHolder.tvNama = convertView.findViewById(R.id.tvItemName);
           viewHolder.tvHarga = convertView.findViewById(R.id.tvItemHarga);
           viewHolder.imgItem = convertView.findViewById(R.id.imgItemImage);
           convertView.setTag(viewHolder);
       }else{
            viewHolder = (ViewHolder) convertView.getTag();
       }

       viewHolder.tvNama.setText(nama[position]);
       viewHolder.tvHarga.setText("Rp. " + harga[position]);
       viewHolder.imgItem.setImageResource(imageID[position]);

        return convertView;
    }

    static class ViewHolder{
        TextView tvNama, tvHarga;
        ImageView imgItem;
    }
}
