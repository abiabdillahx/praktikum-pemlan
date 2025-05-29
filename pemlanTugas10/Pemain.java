public class Pemain {
    private int tinggiBadan;
    private int beratBadan;

    public Pemain(int tinggiBadan, int beratBadan) {
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public int getBeratBadan() {
        return beratBadan;
    }

    @Override
    public String toString() {
        return "Tinggi: " + tinggiBadan + " cm, Berat: " + beratBadan + " kg";
    }
}
