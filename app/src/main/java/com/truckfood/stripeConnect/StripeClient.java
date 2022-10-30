package com.truckfood.stripeConnect;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class StripeClient {
    private static Retrofit instance;

    public static Retrofit getInstance() {
        if(instance==null){
            instance=new Retrofit.Builder().baseUrl("https://api.stripe.com/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return instance;
    }
}
