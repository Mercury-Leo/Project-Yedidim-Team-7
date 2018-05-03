package com.example.schlomo.the_race;
import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
public class Main {



    private Socket id;
    private int teamCode;
    private String language[];
    private String nameOfSchool;
    private double coordination;
    private Object Mission [];
    private int timeOutNavigate;
    private String instruction;
    private String teamName;
    private Firebase rootRef;


    public void Main() { //empty builder

    }

    private void logoDisplay() {

    }
    private void screenOfHomeAndInscription() {

    }

    public  int getDataFromServer() {
        // Create a reference from an HTTPS URL
// Note that in the URL, characters are URL escaped!
        StorageReference storageRef = storage.getReferenceFromUrl("https://yedidim-a05ec.firebaseio.com");
        islandRef = storageRef.child("activityFile");

        File localFile = File.createTempFile("File", "json");

        islandRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                // Local temp file has been created
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
            }
        });
    }

    private void popMessageToPlayer() {

    }

    private void instructionsScreen() {
        // TODO implement here
    }
    private void makeTeam() {
        // TODO implement here
    }
    private void screenPlay() {
        // TODO implement here
    }


    private void putMissionsOnMap() {
        // TODO implement here
    }
    private void makePlayer(int codeteam ) {

        // TODO implement here
    }
    private void getMaps() {
        // TODO implement here


    }
    private void timerUpdateServer() {
        // TODO implement here
    }
    private void timerUpdateLocation() {
        // TODO implement here
    }
    private void timerUpdateGameTime() {
        // TODO implement here
    }
    public void connectToServer( ) {
        rootRef = new Firebase("https://yedidim-a05ec.firebaseio.com");
    }

    private void generateMission() {
        // TODO implement here
    }
    private void catchFakeGps(){


    }






}















