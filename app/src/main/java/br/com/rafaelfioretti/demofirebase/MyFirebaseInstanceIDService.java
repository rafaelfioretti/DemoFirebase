package br.com.rafaelfioretti.demofirebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by rafaelfioretti on 2/18/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();

        Log.i("Token", token);

        //TODO: Implementar o envio do token para o servidor
    }
}
