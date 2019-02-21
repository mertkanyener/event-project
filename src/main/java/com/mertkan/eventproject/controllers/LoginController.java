package com.mertkan.eventproject.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class LoginController {

    private final String clientId = "647358105696445";
    private final String clientSecret = "7c2cfc030acf8551641f65c2531ab0c3";
    private final String redirectUri = "http://localhost:4200/";

    @GetMapping(path = "/login")
    public ResponseEntity<String> facebookLogin(@RequestParam("code") String code, @RequestParam("state") String state) throws Exception{

        String url = "https://graph.facebook.com/v3.2/oauth/access_token?client_id="+ this.clientId
                + "&redirect_uri=" + this.redirectUri
                + "&client_secret=" + this.clientSecret
                + "&code=" + code
                + "&state=" + state;

        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println("Response: " + response.toString());

        return new ResponseEntity<String>(response.toString(), null, HttpStatus.MULTI_STATUS);

    }

}
