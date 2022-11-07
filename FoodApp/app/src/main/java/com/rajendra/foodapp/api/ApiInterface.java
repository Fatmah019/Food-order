package com.rajendra.foodapp.api;

import com.rajendra.foodapp.model.FoodData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    //@GET("1b68a8f21e50b675eeb1")
    @GET("labs-886bc.appspot.com/o/food.json?alt=media&token=92c676d3-d6f5-4450-8cf0-441f71d1cbb8")
    Call<List<FoodData>> getAllData();


    // lets make our model class of json data.

}
