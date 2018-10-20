package com.naibeck.parcial;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private List<Product> products;
    private Context context;

    //constructor
    public ProductAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_product, viewGroup, false);
        ViewHolder vH = new ViewHolder(view);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder viewHolder, int position) {
        final Product product = ProductUtil.products().get(position);
        viewHolder.mName.setText(product.getmName());
        viewHolder.mDescription.setText(product.getmDescription());
        viewHolder.mPrice.setText("$" + String.valueOf(product.getmPrice()));
        viewHolder.mProductImage.setImageResource(product.getmImage());

        /*cuando el item sea tocado, se abrira una nueva actividad mostrando los datos de ese item
        /*Haciendo uso de parcelable para recuperar los datos*/
        viewHolder.mCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("parce", product);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ProductUtil.products().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mName;
        TextView mDescription;
        TextView mPrice;
        ImageView mProductImage;
        CardView mCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mName = itemView.findViewById(R.id.productName);
            mDescription = itemView.findViewById(R.id.productDescription);
            mPrice = itemView.findViewById(R.id.productPrice);
            mProductImage = itemView.findViewById(R.id.productImage);
            mCard = itemView.findViewById(R.id.cardItem);

        }

    }


}
