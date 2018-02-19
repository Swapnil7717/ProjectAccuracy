package com.example.swapnilskamble.projectaccuracy;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.location.*;
import com.example.*;

import static android.widget.Toast.LENGTH_SHORT;

public class Improve extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    GPStracker gps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_improve);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        addListenerOnButton();

    }
    public void addListenerOnButton(){

        Button current=(Button)findViewById(R.id.current);

        current.setOnClickListener(new OnClickListener(){


            public void onClick(View view) {
                //gps = new GPStracker(Improve.this);
               /* if(gps.canGetLocation()){

                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    // \n is for new line
                    Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
                }else{
                    // can't get location
                    // GPS or Network is not enabled
                    // Ask user to enable GPS/network in settings
                    gps.showSettingsAlert();
                }*/
                //Toast.makeText(getApplicationContext(),"Hello Javatpoint", LENGTH_SHORT).show();
//                LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//                // get the last know location from your location manager.
//                Location location= LocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
//                // now get the lat/lon from the location and do something with it.
//                nowDoSomethingWith(location.getLatitude(), location.getLongitude());

            }

        });

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
