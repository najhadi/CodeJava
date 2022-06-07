package Modele;
public class Article {
    private String desc;
    private Integer qte;
    private Double prix;

    public Article() {
    }

    public Article(String desc, Integer qte, Double prix) {
        this.desc = desc;
        this.qte = qte;
        this.prix = prix;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getQte() {
        return qte;
    }

    public Double getPrix() {
        return prix;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
