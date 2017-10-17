package com.jonmid.segundoparcial.Views;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.jonmid.segundoparcial.Adapter.TeamAdapterJosephRosero;
import com.jonmid.segundoparcial.Array.Images;
import com.jonmid.segundoparcial.Connection.Connection;
import com.jonmid.segundoparcial.Model.TeamModelJosephRosero;
import com.jonmid.segundoparcial.Parser.TeamJsonJosephRosero;
import com.jonmid.segundoparcial.R;
import com.jonmid.segundoparcial.TeamActivity;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.io.IOException;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    List<TeamModelJosephRosero> teamModelJosephRosero;
    TeamAdapterJosephRosero teamAdapterJosephRosero;
    ProgressBar progressBar;
    RecyclerView recyclerView;
    ImageView imageView;
    TextView textView;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bund = getIntent().getExtras();
        progressBar = (ProgressBar) findViewById(R.id.id_pb_progressbar);
        recyclerView = (RecyclerView) findViewById(R.id.id_rv_recyclerview);

        imageView = (ImageView) findViewById(R.id.id_img_item_detail);


        textView = (TextView) findViewById(R.id.id_tv_namedetail);
        textView2 = (TextView) findViewById(R.id.id_tv_codedetail);
        textView.setText(bund.getString("name"));
        textView.setText(bund.getString("code"));
        Picasso.with(this).load(Images.imageRandom()).into(imageView);


    }


    public void regesar(View view) {

        Intent a = new Intent(getApplicationContext(), TeamActivity.class);
        startActivity(a);
    }


}
