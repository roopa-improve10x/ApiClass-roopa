package com.example.modelclassapi.network;

import com.example.modelclassapi.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ModelApi {

    public ModelApiService createModelApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ModelApiService modelApiService = retrofit.create(ModelApiService.class);
        return modelApiService;
    }
}
