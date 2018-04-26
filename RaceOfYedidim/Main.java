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
import javax.print.DocFlavor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.apache.commons.*;



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


    public static void Main(String[] args) {
        try {
            String hostname ="localhost";
            String port = "80";
            connectToServe(hostname,port);
        }
        catch ( Exception e)
        {}

    }

    public void logoDisplay() {

    }
    public void screenOfHomeAndInscription() {

    }
    public void downloadActivityFile() {

    }
    public void popMessageToPlayer() {

    }
    public void getDataFromServer() {  ///
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


    }






}






//
//    public void retrieve(String server, int port, String username,
//                         String password, String remote, String local, int fileType,
//                         ProgressHandler progressHandler) throws Exception {
//        final FTPClient ftp = new FTPClient();
//        Date date = new Date();
//        long startTime_ms = date.getTime();
//        if (progressHandler != null) {
//            ftp.setCopyStreamListener(new FtpCopyStreamListener(progressHandler));
//        }
//
//        ftpConnect(server,ftp, port,startTime_ms);
//
//
//        if(ftp.getReplyCode()==0 || !String.valueOf(ftp.getReplyCode()).startsWith("2")){
//            cleanup(ftp, "Could not log into server: " + server, null);
//            return;
//        }
//
//        boolean loggedIn = false;
//        try {
//            if (username == null || username.isEmpty()) {
//                username = "anonymous";
//                password = System.getProperty("user.name") + "@"
//                        + InetAddress.getLocalHost().getHostName();
//            }
//            if (!ftp.login(username, password)) {
//                ftp.logout();
//                cleanup(ftp, "Could not log into server: " + server, null);
//            }
//            loggedIn = true;
//
//            ftp.setFileType(fileType);
//            ftp.enterLocalPassiveMode();
//            OutputStream output = null;
//            try {
//                output = new FileOutputStream(local);
//                LOGGER.info("About to download " + remote + " from " + server
//                        + " on " + (port > 0 ? port : ftp.getDefaultPort())
//                        + " to " + local);
//                ftp.setControlKeepAliveTimeout(300);
//                boolean isFileDownloaded = false;
//                try{
//                    isFileDownloaded = ftp.retrieveFile(remote, output);
//
//                }
//                catch(IOException ex){
//                    if(ftp.isConnected()){
//
//                        try{
//                            int retryCode = 0;
//                            while (!String.valueOf(retryCode).startsWith("2") && (new Date().getTime() < (startTime_ms + TOTAL_DURATION_MSECS))){
//                                try{
//
//                                    retryCode = ftp.retr(local);
//                                }catch(Exception e1){
//                                    Thread.sleep(1000);
//                                    System.out.println("File not downloaded !! " + e1.toString());
//                                    ftpConnect(server, ftp, port, startTime_ms);
//                                }
//
//                            }
//                        }catch(Exception e){
//                            //ftp.getReplyCode()
//                            //throw e;
//                            //disconnect(ftp);
//                            //ftpConnect(server, ftp, port, startTime_ms);
//
//                            System.out.println("File not downloaded !! " + e.toString());
//                        }
//                    }
//                }
//                if(isFileDownloaded){
//                    LOGGER.info("Finished downloading " + remote + " from "
//                            + server + " on "
//                            + (port > 0 ? port : ftp.getDefaultPort()) + " to "
//                            + local);
//                }
//                else{
//                    System.out.println("File not downloaded !! ");
//                }
//
//            }catch(IOException io){
//                io.printStackTrace();
//
//                throw io;
//            }
//            finally {
//                if (output != null) {
//                    try {
//                        output.close();
//                    } catch (IOException f) {
//                        LOGGER.severe("output.close() error: "
//                                + ServiceUtils.stackToString(f));
//                    }
//                }
//            }
//        }
//        catch (FTPConnectionClosedException e) {
//            LOGGER.severe("Server closed connection: " + server + " "
//                    + ServiceUtils.stackToString(e));
//            throw e;
//        } catch (IOException e) {
//            LOGGER.severe("IOException, server: " + server + " "
//                    + ServiceUtils.stackToString(e));
//            throw e;
//        } finally {
//            if (loggedIn) {
//                try {
//                    ftp.logout();
//                } catch (IOException f) {
//                    LOGGER.severe("ftp.logout() error: "
//                            + ServiceUtils.stackToString(f));
//                }
//            }
//            disconnect(ftp);
//        }
//
//






















