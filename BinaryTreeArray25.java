public class BinaryTreeArray25 {
    Mahasiswa25[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray25() {
        this.dataMahasiswa = new Mahasiswa25[10];
    }

    void populateData(Mahasiswa25 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
