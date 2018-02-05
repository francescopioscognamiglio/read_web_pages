/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readpagehttp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author AntoFra
 */
public class ReadPageHttp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            URL Url = new URL ("http://www.saraclaudio.altervista.org/prova_codice_html.html");
            HttpURLConnection HttpConn = (HttpURLConnection) Url.openConnection();
            BufferedReader ReadConnHttp = new BufferedReader (new InputStreamReader (HttpConn.getInputStream()));

            while (ReadConnHttp.readLine() != null)
                System.out.println(ReadConnHttp.readLine());
        } catch (MalformedURLException ex) {
        } catch (IOException ex) {
        }
        
        
        System.out.println("____________________________________");
        URL url;
    	String read = null;
        try {
            url = new URL("http://www.saraclaudio.altervista.org/prova_codice_html.html");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        while ((read = in.readLine()) != null)
            System.out.println(read +"\n");
        
        in.close();
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
    }
}
