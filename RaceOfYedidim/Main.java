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
    public final static String  FILE_TO_RECEIVED = "c:/temp/source-downloaded.pdf";
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
            System.out.println("Connecting...");

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






















