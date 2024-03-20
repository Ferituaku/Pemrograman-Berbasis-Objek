//Nama: AL Ferro Putra Y
//NIM: 24060122140164
//Nama File: BangunDatar.java
//Desc: class membuat method luas dan method abstrak hitungLuas

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}
