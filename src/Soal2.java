import java.util.LinkedList;

public class Soal2 {

        public static void main(String args[])
        {
            LinkedList kelas = new LinkedList();
            kelas.add("A");
            kelas.addFirst("B");
            kelas.addFirst("C");
            kelas.addLast("D");
            kelas.add(2, "E");
            kelas.addFirst("F");
            kelas.addLast("G");
            kelas.add(3, "H");
            kelas.remove(0);

            // Disini saya modifikasi stack nya supaya lebih readable dalam membaca soal
            int i =0;
            for(Object stackList : kelas) {
                System.out.println("index ke="+i+"=>"+stackList);
                i++;
            }

        }
    }

