package entites;

public class Categorie {

    public Categorie(String code, String libelle) {
        this.id = ++cmp;
        this.code = code;
        this.libelle = libelle;
    }

    public Categorie(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return
                libelle ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public static int getCmp() {
        return cmp;
    }

    public static void setCmp(int cmp) {
        Categorie.cmp = cmp;
    }

    private int id;
    private String code;
    private String libelle;
    public static int cmp;

}
