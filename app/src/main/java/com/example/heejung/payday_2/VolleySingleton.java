package com.example.heejung.payday_2;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
/**
 * Created by Heejung on 2015-11-24.
 */
 
public class VolleySingleton {

    private static VolleySingleton mInstance = null;
    private RequestQueue mRequestQueue;

    private VolleySingleton(Context context){
        mRequestQueue = Volley.newRequestQueue(context);
    }

    public static VolleySingleton getInstance(Context context){
        if(mInstance == null){
            mInstance = new VolleySingleton(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue(){
        return this.mRequestQueue;
    }

}
