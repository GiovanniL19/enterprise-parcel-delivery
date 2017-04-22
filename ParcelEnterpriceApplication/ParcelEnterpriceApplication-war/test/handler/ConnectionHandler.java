package handler;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ConnectionHandler {
    private String id = "";
    public String getId(){
        return id;
    }
    
    public String get(URL url) {
        try {
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
            httpUrlConnection.setRequestMethod("GET");
            httpUrlConnection.setRequestProperty("Accept", "application/json");

            if (httpUrlConnection.getResponseCode() != 200) {
                System.out.println("Error code: " + httpUrlConnection.getResponseCode());
            }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((httpUrlConnection.getInputStream())));
            StringBuilder response = new StringBuilder();
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            
            httpUrlConnection.disconnect();
            
            String responseString = response.toString();
            
            if(responseString.isEmpty()){
                return null;
            }else{
                return responseString;
            }
        } catch (Exception ex) {
            return null;
        }
    }
    
    public String post(URL url, String data){
        try {
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
            httpUrlConnection.setReadTimeout(10000);
            httpUrlConnection.setConnectTimeout(15000);
            
            httpUrlConnection.setRequestMethod("POST");
            httpUrlConnection.setDoInput(true);
            httpUrlConnection.setDoOutput(true);
            
            
            httpUrlConnection.setRequestProperty("Content-Type", "application/json");

            
            DataOutputStream dataOutputStream = new DataOutputStream(httpUrlConnection.getOutputStream());
            dataOutputStream.writeBytes (data);
            dataOutputStream.flush();
      
             
            InputStream inputStream = httpUrlConnection.getInputStream();
            StringBuilder response;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            response = new StringBuilder();
            while((line = bufferedReader.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            String id = response.toString();
      
            httpUrlConnection.disconnect();
            return id;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    public boolean put(URL url, String data){
        try {
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
            httpUrlConnection.setReadTimeout(10000);
            httpUrlConnection.setConnectTimeout(15000);
            
            httpUrlConnection.setRequestMethod("PUT");
            httpUrlConnection.setDoInput(true);
            httpUrlConnection.setDoOutput(true);
            
            
            httpUrlConnection.setRequestProperty("Content-Type", "application/json");

            
            try (DataOutputStream dataOutputStream = new DataOutputStream(httpUrlConnection.getOutputStream())) {
                dataOutputStream.writeBytes (data);
                dataOutputStream.flush();
            }
            
            if (httpUrlConnection.getResponseCode() == 204) {
               return true;
            }else{
                return false;
            }
            
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean delete(URL url){
        try {
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
            httpUrlConnection.setReadTimeout(10000);
            httpUrlConnection.setConnectTimeout(15000);
            
            httpUrlConnection.setRequestMethod("DELETE");
            

            if (httpUrlConnection.getResponseCode() == 204) {
               return true;
            }else{
                return false;
            }
            
        } catch (Exception ex) {
            return false;
        }
    }
}
