package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.WebParam;
import métier.Compte;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

@WebService
public class BanqueService {
    @WebMethod
    public double conversion(double montant) {
        return montant * 3.36;
    }

    @WebMethod
    public Compte GetCompte(@WebParam double code) {
        return new Compte(code,0,new Date());

    }

    @WebMethod
    public ArrayList<Compte> GetComptes(){
        ArrayList<Compte> cs = new ArrayList<>();
        cs.add(new Compte(1, 1000, new Date()));
        cs.add(new Compte(2, 1000, new Date()));

        return cs;

    }


    }
