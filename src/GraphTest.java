import static org.junit.Assert.*;
import org.junit.Test;

class GraphTest {
    // Soal nomor tiga saya tambahkan uni test untuk pengujian class Graph
    @org.junit.jupiter.api.Test
    void testIsValidWithSoal() {
            Graph g = new Graph(4);
            g.addEdge(0, 1);
            g.addEdge(0, 3);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 1);
            String r = g.BFS(2);

            String ekspektasi = " 2 0 3 1";
            String realita = g.BFS(2);
            assertEquals(ekspektasi,realita);
    }
}