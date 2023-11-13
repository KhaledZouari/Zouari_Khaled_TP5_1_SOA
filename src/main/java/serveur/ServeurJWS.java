package serveur;

import service.BanqueService;
import jakarta.xml.ws.Endpoint;
import service.BanqueService;


public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8888/";
        BanqueService Banque = new BanqueService();
        Endpoint.publish(url,Banque);
        System.out.println("Service web BanqueService publié à l'URL : " + url);
    }
}