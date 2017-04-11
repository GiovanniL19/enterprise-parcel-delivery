package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ConnectionHandler {
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
}
