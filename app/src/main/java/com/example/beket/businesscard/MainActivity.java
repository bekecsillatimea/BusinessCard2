package com.example.beket.businesscard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String phoneNumber = "650-555-5555";
    String emailAddress = "support@udacity.com";
    String webPageAddress = "http://www.udacity.com";
    double latitude = 37.399900;
    double longitude = -122.108401;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // dial phone number
    public void dialPhoneNumber(View v) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse("tel:" + phoneNumber));
        if (dialIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(dialIntent);
        }
    }

    // send email
    public void sendEmail(View v){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" + emailAddress));
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
    }

    // open web page
    public void openWebPage(View v){
        Intent webIntent = new Intent(Intent.ACTION_VIEW);
        webIntent.setData(Uri.parse(webPageAddress));
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    // open map for location
    public void openMaps(View v){
        Intent mapsIntent = new Intent(Intent.ACTION_VIEW );
        mapsIntent.setData(Uri.parse("geo:" + latitude + "," + longitude));
        startActivity(mapsIntent);
    }
}
