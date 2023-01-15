package entites;

public class Chambre {

    public Chambre(){};
    
    public Chambre(String telephone, Categorie cat) {
        this.id = ++cmp;
        this.telephone = telephone;
        this.categorie = cat;
    }

    private int id;
    private String telephone;
    Categorie categorie;

    public int getCat() {
        return this.categorie.getId();
    }

    public void setCat(Categorie cat) {
        this.cat = cat.getId();
    }

    int cat;

    public Chambre(int id, String telephone, Categorie cat) {
        this.id = id;
        this.telephone = telephone;
        this.categorie = cat;
    }

    @Override
    public String toString() {
        return "Chambre  "+ categorie.getLibelle();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public static int getCmp() {
        return cmp;
    }

    public static void setCmp(int cmp) {
        Chambre.cmp = cmp;
    }

    public static int cmp;

}
