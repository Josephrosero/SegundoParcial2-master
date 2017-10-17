package com.jonmid.segundoparcial.Connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by software on 17/10/2017.
 */

public class Connection {

    public static String getData(String uri) throws IOException {
        BufferedReader reader = null;
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        StringBuilder stringBuilder = new StringBuilder();
        reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;
        while ( (line = reader.readLine()) != null ){
            stringBuilder.append(line+"\n");
        }

        return stringBuilder.toString();
    }

}
