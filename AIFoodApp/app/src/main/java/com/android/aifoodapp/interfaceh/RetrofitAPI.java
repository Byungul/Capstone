package com.android.aifoodapp.interfaceh;

import com.android.aifoodapp.domain.dailymeal;
import com.android.aifoodapp.domain.meal;
import com.android.aifoodapp.domain.user;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;

public interface RetrofitAPI {
    /* user */
    @GET("/checkUserId.do")
    Call<user> getUser(@Query("id") String id);

    @FormUrlEncoded
    @POST("/userSave.do")
    Call<user> postSaveUser(@FieldMap HashMap<String, Object>param);

    @FormUrlEncoded
    @POST("/updatePost.do")
    Call<user> postUpdateUser(@FieldMap HashMap<String, Object>param);

    @GET("/deleteUser.do")
    Call<user> getDeleteUser(@Query("id") String id);

    @GET("/checkDailyMeal.do")
    Call<dailymeal> getDailyMeal(
            @Query("id") String id,
            @Query("datekey") String datekey
    );

    @GET("/checkWeeklyMealCalories.do")
    Call<List<Integer>> getWeeklyCalories(
            @Query("id") String id,
            @Query("startDate") String startDate,
            @Query("endDate") String endDate
    );

    //weekyl"/checkWeeklyMeal.do")

    @FormUrlEncoded
    @POST("/dailymealSave.do")
    Call<dailymeal> postSaveDailyMeal(@FieldMap HashMap<String,Object>param);

    @FormUrlEncoded
    @POST("/mealSave.do")
    Call<meal> postSaveMeal(@FieldMap HashMap<String,Object>param);

}
