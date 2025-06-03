public class BinaryTreeArray25 {
    Mahasiswa25[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray25() {
        this.dataMahasiswa = new Mahasiswa25[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa25 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
//add
    void add(Mahasiswa25 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree penuh");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }
// preOrder
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
