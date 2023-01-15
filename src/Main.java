import entites.*;
import service.*;

import java.util.Date;



public class Main {
    public static void main(String[] args) {

      // create client

        ClientService cs = new ClientService();
        Client cl1 = new Client("Alaoui1","06666666661","alaoui@gmail.com");
        Client cl2 = new Client("Alaoui2  ","06666666662","alaoui@gmail.com");
        Client cl3 = new Client("Alaoui3","06666666663","alaoui@gmail.com");

        //cs.create(cl1);cs.create(cl2);cs.create(cl3);
        System.out.println(cs.findAll());

       // System.out.println();

       /* //cs.update(cl2);
       // cs.findAll();
        //System.out.println(cs.findAll().toString());

        //System.out.println(cs.findAll().toString());
        // create categorie


        CategorieService cats = new CategorieService();
        Categorie cat1=new  Categorie("code1", "simple1");
        Categorie cat2=new  Categorie("code1", "simple1");
        Categorie cat3=new  Categorie("code1", "test");
        //cats.create(cat3);

       // cats.create(cat2);

        // create chambre

        ChamberService chs = new ChamberService();

      // chs.create(new Chambre("07213451",cat3));
        System.out.println(chs.findById(1));

        /*public CategorieService cs= new CategorieService();
        if(rs.next()){
            return new Chambre(rs.getInt(1),rs.getString(2), cs.findById(rs.getInt(3)));
            pr.setInt(2,o.getCategorie().getId());

        }*/


        //chs.findById(2);
        //System.out.println(chs.findByCategorie1(cat1).toString());
       // System.out.println(chs.findByCategorie(cat1).toString());

         //       ReservationService res = new ReservationService();
       // res.create( new Reservation(new Date("2022/10/02"),new Date("2022/11/01"),chs.findById(1),cs.findById(1)));
        //res.create( new Reservation(new Date("2022/01/02"),new Date("2022/04/01"),chs.findById(2),cs.findById(2)));
        //res.create( new Reservation(new Date("2022/05/02"),new Date("2022/06/01"),chs.findById(3),cs.findById(3)));

        //System.out.println(res.findAll().toString());
       // System.out.println("la chambre est : "+res.findChambreBetweenDates(cs.findById(1),  new Date("2022/10/02"),new Date("2022/11/01")));



    }



    }