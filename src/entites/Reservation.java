package entites;

import java.util.Date;


public class Reservation {

    public Reservation() {
        
    }
    public Reservation(Date dateDebut, Date dateFin, Chambre chambre, Client client) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.chambre = chambre;
        this.client = client;
    }
  public Reservation(int id,Date dateDebut, Date dateFin, Chambre chambre, Client client) {
        
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.chambre = chambre;
        this.client = client;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reservation(Date dateDebut, Date dateFin, Chambre chambre, Client client, int id) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.chambre = chambre;
        this.client = client;
        this.id = id;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public Client getClient() {
        return client;
    }

    private Date dateDebut;
    private Date dateFin;
    Chambre chambre;
    Client client;

    @Override
    public String toString() {
        return id +"";
    }

    public Chambre getlistChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    private int id;

}
