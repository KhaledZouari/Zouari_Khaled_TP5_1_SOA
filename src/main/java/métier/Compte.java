package métier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.time.LocalTime;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    private static final LocalTime LocalTime = null;

    double code;

    double solde;

    @XmlTransient
    Date dateCreation;


    public Compte(double code,double solde,Date  date) {

        this.code=code;

        this.solde=solde;

        this.dateCreation=date;

    }
    public Compte()
    {

    }

    public void setcode(double code) {

        this.code=code;

    }



    public double getcode() {

        return this.code;

    }

    public void setsolde(double solde) {

        this.solde=solde;

    }

    public double getsolde() {

        return this.solde;

    }

    public void setdate(Date date) {

        this.dateCreation=date;

    }

    public Date getdate() {

        return this.dateCreation;

    }
}