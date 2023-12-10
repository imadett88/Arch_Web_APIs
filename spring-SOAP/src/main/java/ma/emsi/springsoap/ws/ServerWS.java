package ma.emsi.springsoap.ws;

import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args) {
        String url ="http://localhost:8071/";
        Endpoint.publish(url,new EtudiantWService());
        System.out.println(url);
    }



}
