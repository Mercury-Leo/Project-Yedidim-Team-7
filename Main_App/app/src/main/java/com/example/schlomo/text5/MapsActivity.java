package com.example.schlomo.text5;

import android.Manifest;
import com.example.schlomo.text6.R;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    Button buttonmenu;
    Button b;
    public boolean myLocation = true;
    private GoogleMap mMap;
    private Location location2;

    private LocationManager locationManager;
    private LocationListener listener;
    private double locationlat;
    private double locationlng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        final SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        b = findViewById(R.id.button7);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MapsActivity.this, "lat : " + location2.getLatitude() + " lng : " + location2.getLongitude(), Toast.LENGTH_SHORT).show();
            }
        });
        buttonmenu =  findViewById(R.id.menu);
        buttonmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapsActivity.this, Pop.class));
            }

        });

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);


        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                locationlng = location.getLongitude();
                locationlat = location.getLatitude();

                System.out.println("lat :" + locationlat + " lng : " + locationlng);
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

                Intent i = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(i);
            }
        };

        configure_button();




    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 10:
                configure_button();
                break;
            default:
                break;
        }
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
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);
        ////////////////////zoom set //////////////////
        mMap.setMinZoomPreference(13.0f);
        mMap.setMaxZoomPreference(20.0f);
        /////////
        mMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {

            @Override
            public void onMyLocationChange(Location arg0) {
location2 = arg0;

                         }
        });
        //////////////////////////////
//        Location currentLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);

        // Add a marker in Mission and move the camera
        LatLng jce = new LatLng(31.770290, 35.193452);
        LatLng shok = new LatLng(31.784791, 35.212530);
        LatLng bigSyna = new LatLng(31.776185, 35.216924);
        LatLng ganSaker = new LatLng(31.776185, 35.216924);
        mMap.addMarker(new MarkerOptions().position(jce).title("jce"));
        mMap.addMarker(new MarkerOptions().position(shok));
        mMap.addMarker(new MarkerOptions().position(bigSyna).title("yes"));
        mMap.addMarker(new MarkerOptions().position(ganSaker));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jce));
          mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(
                this, R.raw.stylemap));




    }


    void configure_button() {
        // first check for permissions
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.INTERNET}
                        , 10);
            }
        }

       }


}

