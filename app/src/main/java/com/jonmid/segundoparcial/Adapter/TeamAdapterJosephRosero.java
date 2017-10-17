package com.jonmid.segundoparcial.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.segundoparcial.Array.Images;
import com.jonmid.segundoparcial.Model.TeamModelJosephRosero;
import com.jonmid.segundoparcial.R;
import com.jonmid.segundoparcial.Views.DetailActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 17/10/2017.
 */

public class TeamAdapterJosephRosero  extends RecyclerView.Adapter<TeamAdapterJosephRosero.ViewHolder>{


    List<TeamModelJosephRosero> usersList = new ArrayList<>();
    Context context;

    public TeamAdapterJosephRosero(List<TeamModelJosephRosero> usersList, Context context) {
        this.usersList = usersList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.id.setText(usersList.get(position).getName());
        holder.name.setText(usersList.get(position).getCode());
        Picasso.with(context).load(Images.imageRandom()).into(holder.image);


    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView id;
        TextView name;
        ImageView image;



        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);

            id = (TextView) item.findViewById(R.id.id_tv_name_team);
            name = (TextView) item.findViewById(R.id.id_tv_cod_team);
       image = (ImageView)item.findViewById(R.id.id_img_team);

        }

        @Override
        public void onClick(View view) {

            Context contextItem = view.getContext();
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", usersList.get(getLayoutPosition()).getName());
            intent.putExtra("code", usersList.get(getLayoutPosition()).getCode());
            intent.putExtra("crestUrl", usersList.get(getLayoutPosition()).getCresUrl());

            contextItem.startActivity(intent);
        }
    }
}

