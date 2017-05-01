package com.smarthome.menthacontrols.menthapp_client_new.request;

import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.smarthome.menthacontrols.menthapp_client_new.model.TransferObject;
import com.smarthome.menthacontrols.menthapp_client_new.model.enums.DownloadStatus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class RequestSender extends AsyncTask<String, Void, String>{

    private static final String TAG = "RequestSender";
    private DownloadStatus downloadStatus;
    private final ButtonStatusInitializer callback;


    public interface ButtonStatusInitializer{
        void initializeStatus(Boolean status);
    }

    public RequestSender(ButtonStatusInitializer callback) {
        this.downloadStatus = DownloadStatus.IDLE;
        this.callback = callback;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onPostExecute(String s) {

        Log.d(TAG, "onPostExecute: parameter = " + s);

        TransferObject transferObject = JsonParser.createTransferObjectFromJson(s);
        callback.initializeStatus(transferObject.getWidgetStatus());


//        if(callback != null){
//            Float result = Float.valueOf(s);
//            Log.d(TAG, "onPostExecute: " + s + " " + Float.valueOf(s));
//
//            if(result == 80){
//                callback.initializeStatus(true);
//            }else{
//                callback.initializeStatus(false);
//            }
//
//        }
        Log.d(TAG, "onPostExecute: ends");

    }

    @Override
    protected String doInBackground(String... params) {

//        Log.d(TAG, "doInBackground: " + params[1]);

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

            String line;
            while(null != (line = reader.readLine())){
                result.append(line).append("\n");
            }

            downloadStatus = DownloadStatus.OK;
            Log.d(TAG, "doInBackground: " + result.toString());
            return result.toString();

        }catch(MalformedURLException e){
            Log.e(TAG, "doInBackground: Invalid URL" + e.getMessage());
        }catch(IOException e){
            Log.e(TAG, "doInBackground: IO Exception reading data " + e.getMessage() );
        }catch(SecurityException e){
            Log.e(TAG, "doInBackground: Security exception. Needs permission? " +e.getMessage());
        } finally {
            if(connection != null){
                connection.disconnect();
            }
            if(reader != null){
                try{
                    reader.close();
                }catch(IOException e){
                    Log.e(TAG, "doInBackground: Error closing stream, " + e.getMessage());
                }
            }
        }

        downloadStatus = DownloadStatus.FAILED_OR_EMPTY;

        return null;
    }
}
