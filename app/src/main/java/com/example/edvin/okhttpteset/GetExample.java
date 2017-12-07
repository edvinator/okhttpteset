package com.example.edvin.okhttpteset;

/**
 * Created by Edvin on 2017-12-07.
 */
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExample {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try  {
            Response response = client.newCall(request).execute();
            return response.body().string();
        }
        catch (java.io.IOException e)
        {
            return "fart";
        }
    }
}