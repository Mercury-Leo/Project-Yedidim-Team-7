import java.io.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.print.DocFlavor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.List;
import java.util.Map ;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class Main {



    private Socket id;
    private int teamCode;
    private String language[];
    private String nameOfSchool;
    private InetAddress serversIp;
    private double coordination;
    private Object Mission [];
    private int timeOutNavigate;
    private String instruction;
    private String teamName;
    private Socket client ;
    public final static String  FILE_TO_RECEIVED = "localhost/ActivityFile.json";
     // you may change this, I give a different name because i don't want to overwrite the one used by server...

    public final static int FILE_SIZE = 6022386; // file size temporary hard coded
    // should bigger than the file to be downloaded

    public  void Main(String[] args) {
        try {
            client=null;
            String hostname ="localhost";
            String port = "80";
            connectToServer(hostname,port);
            downloadActivityFile();

        }
        catch ( Exception e)
        {

        }

    }

    private void logoDisplay() {

    }
    private void screenOfHomeAndInscription() {

    }

    private  void downloadActivityFile() throws Exception {
        int bytesRead;
        int current = 0;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {

            // receive file
            byte [] mybytearray  = new byte [FILE_SIZE];
            InputStream is = client.getInputStream();
            fos = new FileOutputStream(FILE_TO_RECEIVED);
            bos = new BufferedOutputStream(fos);
            bytesRead = is.read(mybytearray,0,mybytearray.length);
            current = bytesRead;

            do {
                bytesRead =
                        is.read(mybytearray, current, (mybytearray.length-current));
                if(bytesRead >= 0) current += bytesRead;
            } while(bytesRead > -1);

            bos.write(mybytearray, 0 , current);
            bos.flush();
            System.out.println("File " + FILE_TO_RECEIVED
                    + " downloaded (" + current + " bytes read)");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("FileNotFoundException");

        } catch (IOException e) {
            throw new IOException("IOException");
        } finally {
            if (fos != null) fos.close();
            if (bos != null) bos.close();
            if (client != null) client.close();
        }

    }


    private void popMessageToPlayer() {

    }
    private void getDataFromServer() {  ///

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

    private void timerUpdateServer() {
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
    private void timerUpdateLocation() {
        // TODO implement here
    }
    private void timerUpdateGameTime() {
        // TODO implement here
    }
    private void connectToServer(String serverName, String ports)throws IOException {


        int port = Integer.parseInt(ports);
        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
             client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            serversIp=InetAddress.getLocalHost();

        } catch (UnknownHostException e ){
            throw new UnknownHostException("Get ip failed");
        }
        catch (IOException e) {
            throw new IOException("Connection failed");

        }

    }

    private void generateMission() {
        // TODO implement here
    }
    private void catchFakeGps(){


    }






}




