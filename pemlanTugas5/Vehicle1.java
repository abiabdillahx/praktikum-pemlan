/*
 * 1. Benahi kode Vehicle1 dan TestVehicle1 dan perbaiki jika menemui kesalahan!
 * 2. Hapus separator “/” pada file Vehicle1.java pada baris 4-6 serta pada file TestVehicle1.java pada baris 6, apa yang terjadi dan jelaskan!
 * 3. Pada file Vehicle1.java variabel load ubah menjadi konstanta final, apa yang terjadi, jelaskan!
 * 4. Tambahkan keyword “static” pada file Vehicle1.java variabel maxLoad, apa yang terjadi dan jelaskan!
 */


package pemlanTugas5;

public class Vehicle1 {
    private final double load = 1000;
    // private static final double maxLoad = 10000;
    private final double maxLoad = 10000;
    // public Vehicle1 (double max){
    //     this.maxLoad = max;
    // }
    public double getLoad(){    
        return this.load;
    }
    public double getMaxLoad(){
        return this.maxLoad;
    }
    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        } else{
            return false;
        }
    }
}
