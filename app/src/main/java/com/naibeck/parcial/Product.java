package com.naibeck.parcial;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {

    private String mName;
    private String mDescription;
    private String mCategory;
    private Double mPrice;
    private float mRating;
    private int mImage;

    public Product() {

    }

    public Product(String mName, String mDescription, String mCategory, Double mPrice, float mRating, int mImage) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mCategory = mCategory;
        this.mPrice = mPrice;
        this.mRating = mRating;
        this.mImage = mImage;
    }

    protected Product(Parcel in) {
        mName = in.readString();
        mDescription = in.readString();
        mCategory = in.readString();
        if (in.readByte() == 0) {
            mPrice = null;
        } else {
            mPrice = in.readDouble();
        }
        mRating = in.readFloat();
        mImage = in.readInt();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public Double getmPrice() {
        return mPrice;
    }

    public void setmPrice(Double mPrice) {
        this.mPrice = mPrice;
    }

    public float getmRating() {
        return mRating;
    }

    public void setmRating(float mRating) {
        this.mRating = mRating;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeString(mDescription);
        dest.writeString(mCategory);
        if (mPrice == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(mPrice);
        }
        dest.writeFloat(mRating);
        dest.writeInt(mImage);
    }
}
