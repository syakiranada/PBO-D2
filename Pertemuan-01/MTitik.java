public class MTitik {
    public static void main(String[] args){
        Titik t1;
        Titik t2;

        t1 = new Titik();

        t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        int counterTitik = Titik.getCounterTitik();

        Titik t3 = new Titik(5,6);

        System.out.printf("Jumlah objek titik : %d\n", counterTitik);
        System.out.printf("Titik t1 dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("Titik t3 dengan absis : %.2f, ordinat : %.2f\n", t3.getAbsis(), t3.getOrdinat());
    }
}
