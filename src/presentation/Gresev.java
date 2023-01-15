/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import entites.Reservation;
import java.util.Date;
import service.ChamberService;
import service.ClientService;
import service.ReservationService;

/**
 *
 * @author pc
 */
public class Gresev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ReservationService res = new ReservationService();
        ChamberService chs = new ChamberService();
        ClientService cs = new ClientService();
        Reservation r1 =new Reservation(new Date("2022/02/2"),new Date("2022/02/01"),chs.findById(1),cs.findById(1));
          res.create(r1);
          System.out.println(r1.toString());
          r1 =new Reservation(new Date("2022/02/28"),new Date("2022/02/15"),chs.findById(5),cs.findById(5));
        res.update(r1);
        System.out.println(r1.toString());
        //res.create( new Reservation(new Date("2022/01/02"),new Date("2022/04/01"),chs.findById(2),cs.findById(2)));
        //res.create( new Reservation(new Date("2022/05/02"),new Date("2022/06/01"),chs.findById(3),cs.findById(3)));

        //System.out.println(res.findAll().toString());
       // System.out.println("la chambre est : "+res.findChambreBetweenDates(cs.findById(1),  new Date("2022/10/02"),new Date("2022/11/01")));
// create client

        /*ClientService cs = new ClientService();
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

         //     ReservationService res = new ReservationService();
       // res.create( new Reservation(new Date("2022/10/02"),new Date("2022/11/01"),chs.findById(1),cs.findById(1)));
        //res.create( new Reservation(new Date("2022/01/02"),new Date("2022/04/01"),chs.findById(2),cs.findById(2)));
        //res.create( new Reservation(new Date("2022/05/02"),new Date("2022/06/01"),chs.findById(3),cs.findById(3)));

        //System.out.println(res.findAll().toString());
       // System.out.println("la chambre est : "+res.findChambreBetweenDates(cs.findById(1),  new Date("2022/10/02"),new Date("2022/11/01")));

    
    
    }
    
}
