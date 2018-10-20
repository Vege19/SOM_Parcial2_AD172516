package com.naibeck.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //get back the data from parcelable
        Intent intent = getIntent();
        Product getProduct = intent.getParcelableExtra("parce");

        //get product data
        int productImage = getProduct.getmImage();
        String title = getProduct.getmName();
        String description = getProduct.getmDescription();
        String category = getProduct.getmCategory();
        double price = getProduct.getmPrice();
        float rating = getProduct.getmRating();

        //call resources and set them the product data
        ImageView mImage = findViewById(R.id.productImage2);
        mImage.setImageResource(productImage);

        TextView mTitle = findViewById(R.id.productTitle);
        mTitle.setText(title);

        TextView mFullDescription = findViewById(R.id.productFullDescription);
        mFullDescription.setText(description);

        TextView mCategory = findViewById(R.id.productCategory);
        mCategory.setText("Categoría: " + category);

        TextView mPrice = findViewById(R.id.productFullPrice);
        mPrice.setText(String.valueOf("$" + price));

        //configuracion de la ratingbar
        RatingBar ratingBar = findViewById(R.id.productRating);
        ratingBar.setMax(5);
        ratingBar.setNumStars(5);
        ratingBar.setRating(rating);

        //back button en la toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(title);

    }

    @Override
    public boolean onSupportNavigateUp() {
        this.finish();
        return true;
    }
}
