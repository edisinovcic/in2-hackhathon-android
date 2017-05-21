package com.bestoftherest.in2app;


import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class Connection extends AsyncTask<Void, Void, String> {


    public Connection() {

    }

    @Override
    protected String doInBackground(Void... params) {
        try {
            return getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Fail";
    }

    public String getData() throws IOException {
        //JsonTask().execute("http://localhost:8080/users");





        //URL url = new URL("http://localhost:8080/users");
        //HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        //JSONObject json = new JSONObject();

        //try {
          //  InputStream reader = urlConnection.getInputStream();
            /*BufferedReader bufferedReader = new BufferedReader(new reader);
            BufferedReader bufferedReader = new BufferedReader(//new InputStreamReader());
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            bufferedReader.close();
            String jsonString = stringBuilder.toString();
            try {
                json = new JSONObject(jsonString);
            } catch (Exception e) {
                e.printStackTrace();
            }
            */
        //} finally {
         //   urlConnection.disconnect();
        //}

        return json.toString();
    }
}
