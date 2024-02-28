public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga S1 = new Segitiga(3, 4);

        PrismaSegitiga PS = new PrismaSegitiga(S1, 5);

        System.out.println("Volume Prisma Segitiga : " + PS.hitungVolume());
        System.out.println("Luas Permukaan Prisma Segitiga : " + PS.hitungLuasPermukaan());
    }
}