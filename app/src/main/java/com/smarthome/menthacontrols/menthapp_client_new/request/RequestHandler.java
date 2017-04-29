package com.smarthome.menthacontrols.menthapp_client_new.request;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

enum DownloadStatus{ IDLE, PROCESSING, NOT_INITIALISED, FAILED_OR_EMPTY, OK}

public class RequestHandler extends AsyncTask<String, Void, String>{

    private static final String TAG = "RequestHandler";
    private DownloadStatus downloadStatus;

    public RequestHandler() {
        this.downloadStatus = DownloadStatus.IDLE;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected String doInBackground(String... params) {

        HttpURLConnection connection = null;
        BufferedReader reader = null;

        if(params == null){
            downloadStatus = DownloadStatus.NOT_INITIALISED;
            return null;
        }

        try{
            downloadStatus = DownloadStatus.PROCESSING;
            URL url = new URL(params[0]);

            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int response = connection.getResponseCode();
            Log.d(TAG, "doInBackground: The response code was: " + response);

            StringBuilder result = new StringBuilder();

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        }catch(MalformedURLException e){
            Log.e(TAG, "doInBackground: Invalid URL" + e.getMessage());
        }catch(IOException e){
            Log.e(TAG, "doInBackground: IO Exception reading data " + e.getMessage() );
        }catch(SecurityException e){
            Log.e(TAG, "doInBackground: Security exception. Needs permission? " +e.getMessage());
        }

        return null;
    }
}
