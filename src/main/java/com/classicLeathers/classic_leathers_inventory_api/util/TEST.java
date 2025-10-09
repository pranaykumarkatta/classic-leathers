package com.classicLeathers.classic_leathers_inventory_api.util;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TEST {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://app-server.wati.io/api/v1/sendSessionMessage/918190839579?messageText=TEST"); // or relevant endpoint
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST"); // ✅ POST is required
            conn.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJqdGkiOiJiZWJmMDFjOS04OTM0LTQwYTctYTE4YS1iYmRjOTJhM2YyY2IiLCJ1bmlxdWVfbmFtZSI6ImpheWFrcmlzaG5hLmthdHRhQGdtYWlsLmNvbSIsIm5hbWVpZCI6ImpheWFrcmlzaG5hLmthdHRhQGdtYWlsLmNvbSIsImVtYWlsIjoiamF5YWtyaXNobmEua2F0dGFAZ21haWwuY29tIiwiYXV0aF90aW1lIjoiMDgvMDEvMjAyNSAxNDozMjowOSIsImRiX25hbWUiOiJ3YXRpX2FwcF90cmlhbCIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IlRSSUFMIiwiZXhwIjoxNzU0Njk3NjAwLCJpc3MiOiJDbGFyZV9BSSIsImF1ZCI6IkNsYXJlX0FJIn0.ImYjmWInaDhSWwgU0qvidCo6EN8UfBKJXS8mL7MPsFs"); // ✅ Replace with your key
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);


            int code = conn.getResponseCode();
            System.out.println("Response code: " + code);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
