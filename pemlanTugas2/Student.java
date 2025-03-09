package pemlanTugas2;

public class Student{
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    public static int jumlahObj;

    public Student(){
        name = "";
        address = "";
        age = 0;
        jumlahObj++;
    }
    
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        jumlahObj++;
    }
    
    // menambahkan constructor dengan parameter maisng2 nilai mata pelajaran (no 2)
    public Student(double math, double english, double science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        jumlahObj++;
    }

    public void  setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }

    public void setMath(double math){
        mathGrade = math;
    }
    public void setEnglish(double english){
        englishGrade = english;
    }
    public void setScience(double science){
        scienceGrade = science;
    }

    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;
    }
    // Menambahkan method yang berfungsi sebagai penentu kelulusan siswa berdasarkan rata2 nilai (no 3)
    public boolean statusAkhir(double avg){
        avg = getAverage();
        return avg >= 61;
    }
    

    // Menghitung jumlah objek yang dibuat dengan return type void. (no 5)
    public static void jumlahObjek(){
        // jumlah objek dihitung dengan menambahkan kode `jumlah++;` pada tiap constructor
        System.out.println("Jumlah objek yang dibuat: " + jumlahObj);
    }
    
    public void displayMessage(){
        System.out.printf("=> Siswa bernama %s ", name);
        System.out.printf("yang beralamat di %s ", address);
        System.out.printf("dan berumur %d tahun ", age);
        System.out.printf("memiliki nilai rata-rata %.2f ", getAverage());
        System.out.println("- Status: " + (statusAkhir(getAverage()) ? "Lulus" : "Tidak Lulus")); // mengecek apakah nilai getAverage true atau false ( no 3)
        // jumlahObjek(); /* memberikan output jumlah objek yang telah dibuat setiap displayMessage (no 5)
    }
}