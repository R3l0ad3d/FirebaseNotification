package com.example.r3l0ad3d.firebasenotification.Service;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by r3l0ad3d on 10/3/17.
 */

public class FirebaseToken  extends FirebaseInstanceIdService{

    private static String TAG = "Token";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"Token : "+token);
    }
}
