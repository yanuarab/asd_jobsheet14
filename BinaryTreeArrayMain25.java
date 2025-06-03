public class BinaryTreeArrayMain25 {
    public static void main(String[] args) {
        BinaryTreeArray25 bta = new BinaryTreeArray25();

        Mahasiswa25 mhs1 = new Mahasiswa25("24416021", "Ali", "A", 3.57);
        Mahasiswa25 mhs2 = new Mahasiswa25("24416185", "Candra", "C", 3.41);
        Mahasiswa25 mhs3 = new Mahasiswa25("24416022", "Badar", "B", 3.75);
        Mahasiswa25 mhs4 = new Mahasiswa25("24416220", "Dewi", "B", 3.35);
        Mahasiswa25 mhs5 = new Mahasiswa25("24416031", "Dewi", "A", 3.48);
        Mahasiswa25 mhs6 = new Mahasiswa25("24416205", "Ehsan", "D", 3.61);
        Mahasiswa25 mhs7 = new Mahasiswa25("24416070", "Fizi", "B", 3.86);

        Mahasiswa25[] dataMahasiswas = {
            mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null
        };
        int idxLast = 6;

        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("\n== InOrder Traversal Mahasiswa Array Tree ==");
        bta.traverseInOrder(0);

        System.out.println("\n== PreOrder Traversal Mahasiswa Array Tree ==");
        bta.traversePreOrder(0);
    }
}
