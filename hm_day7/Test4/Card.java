package hm_day7.Test4;

public class Card {
    private String hs;
    private String ds;
    public Card(String hs, String ds){
        this.hs = hs;
        this.ds = ds;
    }
    public void showCard(){
        System.out.println(hs + ds);
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }
}
