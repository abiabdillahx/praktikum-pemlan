public class Pemain {
    private int no;
    private int tinggiBadan;
    private int beratBadan;

    public Pemain(int no, int tinggiBadan, int beratBadan) {
        this.no = no;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public int getNo(){
        return no;
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public int getBeratBadan() {
        return beratBadan;
    }

    @Override
    public String toString() {
        return "No: " + no + ", Tinggi: " + tinggiBadan + " cm, Berat: " + beratBadan + " kg";
    }
}
