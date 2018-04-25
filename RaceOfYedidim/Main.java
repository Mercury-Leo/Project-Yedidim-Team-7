import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



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



    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }


    public void logoDisplay() {
        // TODO implement here
    }
    public void screenOfHomeAndInscription() {
        // TODO implement here
    }
    public void downloadActivityFile() {
        // TODO implement here
    }
    public void popMessageToPlayer() {
        // TODO implement here
    }
    public void getDataFromServer() {
        //  how to get data from  socket and write to .
//  OutputStream outToServer = client.getOutputStream();
//  DataOutputStream out = new DataOutputStream(outToServer);
//
//  out.writeUTF("Hello from " + client.getLocalSocketAddress());
//  InputStream inFromServer = client.getInputStream();
//  DataInputStream in = new DataInputStream(inFromServer);

    }
    public void instructionsScreen() {
        // TODO implement here
    }
    public void makeTeam() {
        // TODO implement here
    }
    public void screenPlay() {
        // TODO implement here
    }

    public void timerUpdateServer() {
        // TODO implement here
    }
    public void putMissionsOnMap() {
        // TODO implement here
    }
    public void makePlayer() {

        // TODO implement here
    }
    public void getMaps() {
        // TODO implement here
    }
    public void timerUpdateLocation() {
        // TODO implement here
    }
    public void timerUpdateGameTime() {
        // TODO implement here
    }
    public void connectToServer(String serverName, String ports)throws IOException {


        int port = Integer.parseInt(ports);
        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            //  how to get data from  socket and write to .
//     OutputStream outToServer = client.getOutputStream();
//     DataOutputStream out = new DataOutputStream(outToServer);
//
//     out.writeUTF("Hello from " + client.getLocalSocketAddress());
//     InputStream inFromServer = client.getInputStream();
//     DataInputStream in = new DataInputStream(inFromServer);
            serversIp=InetAddress.getLocalHost();

        } catch (UnknownHostException e ){
            throw new UnknownHostException("Get ip failed");
        }
        catch (IOException e) {
            throw new IOException("Connection failed");

        }

    }

    public void generateMission() {
        // TODO implement here
    }
    public void catchFakeGps(){


    }}
