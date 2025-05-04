import java.util.ArrayDeque;

public class ContohArrayDequeNilai {
    public static void main(String[] args) {
        ArrayDeque<Integer> nilai = new ArrayDeque<>();
        nilai.add(75);
        nilai.add(80);
        nilai.addFirst(70);  // Tambah ke depan

        System.out.println("Deque Nilai:");
        while (!nilai.isEmpty()) {
            System.out.println(nilai.pollFirst()); // Hapus dan ambil dari depan
        }
    }
}
