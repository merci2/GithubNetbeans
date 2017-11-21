package javafxwithgithub;

public class Datensatz {
    
    private String vocD, vocE;//Bezeichner wie in json + im Controller unter initialize: String am Ende der Columns
    
    
    public Datensatz(String dt, String en)
    {
        this.vocD = dt;
        this.vocE = en;
    }

    public String getVocD() {
        return vocD;
    }

    public void setVocD(String vocD) {
        this.vocD = vocD;
    }

    public String getVocE() {
        return vocE;
    }

    public void setVocE(String vocE) {
        this.vocE = vocE;
    }
    
    
    
}
