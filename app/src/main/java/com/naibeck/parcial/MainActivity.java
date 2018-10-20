package com.naibeck.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //llamando recurso
        mRecyclerView = findViewById(R.id.rvProducts);

        //TODO: Cargar un RecyclerView usando como data source ProductUtil.products
        //TODO: El ViewHolder del RecyclerView usa layout/item_product.xml para mostrar la informacion
        //TODO: En tablet debe hacer uso de un GridLayoutManager con un span count de 2 columnas
        //TODO: En handset debe hacer uso de un GridLayoutManager con un span count de 1 columnas

        //configuracion de recyclerview haciendo uso de linearlayout y gridlayout manager
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, this.getResources().getInteger(R.integer.span_count)));

        //seteamos nuestra arraylist en el adaptador
        mAdapter = new ProductAdapter(ProductUtil.products(), this);

        //seteamos el adaptador a la recyclerview
        mRecyclerView.setAdapter(mAdapter);
        
    }

}
