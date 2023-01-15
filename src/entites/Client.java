package entites;

public class Client {

    public Client(int id, String nom, String telephone, String email) {
        this.id = id;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client(String nom, String telephone, String email) {

        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
    }

    private int id;

    @Override
    public String toString() {
        return  nom ;
    }

    private String nom;
    private String telephone;
    private String email;
    public static int cmp;
}
