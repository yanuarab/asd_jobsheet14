public class BinaryTreeMain25 {
    public static void main(String[] args) {
        BinaryTree25 bst = new BinaryTree25();
        
        bst.add(new Mahasiswa25("24416021", "Ali", "A", 3.57));
        bst.add(new Mahasiswa25("24416022", "Badar", "B", 3.85));
        bst.add(new Mahasiswa25("24416185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa25("24416220", "Dewi", "B", 3.54));
        
        System.out.println("\nDaftar semua mahasiswa (in oder traversal):");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
        
        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
        
        bst.add(new Mahasiswa25("24416131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa25("24416205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa25("24416170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);
        
        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
