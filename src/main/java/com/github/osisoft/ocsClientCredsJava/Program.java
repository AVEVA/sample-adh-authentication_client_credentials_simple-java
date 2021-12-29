package com.github.osisoft.ocsClientCredsJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.google.gson.Gson;

public class Program {
    // Step 1: get needed variables 
    static Appsettings appsettings = getAppsettings();

    // get configuration
    static String tenantId = appsettings.getTenantId();
    static String apiVersion = appsettings.getApiVersion();
    static String resource = appsettings.getResource();
	static String clientId = appsettings.getClientId();
	static String clientSecret = appsettings.getClientSecret();

    public static void main(String[] args) {
        // Step 1: get needed variables 
		
		// Step 2: get the authentication endpoint from the discovery URL
		
		// Step 3: use the client ID and Secret to get the needed bearer token
		
		// Step 4: test token by calling the base tenant endpoint
		
		// test it by making sure we got a valid http status code
    }


    private static Appsettings getAppsettings() {
        Gson mGson = new Gson();

        Appsettings appsettings = new Appsettings();

        try (InputStream inputStream = new FileInputStream("appsettings.json")) {
            String fileString = null;
            int bytesToRead = inputStream.available();

            if (bytesToRead > 0) {
                byte[] bytes = new byte[bytesToRead];
                inputStream.read(bytes);
                fileString = new String(bytes);
            }

            appsettings = mGson.fromJson(fileString, Appsettings.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return appsettings;
    }

}
