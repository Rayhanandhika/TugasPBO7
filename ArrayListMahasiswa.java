import java.util.ArrayList;

public class ContohArrayListMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        System.out.println("Daftar Mahasiswa:");
        mahasiswa.forEach(System.out::println);
    }
}
