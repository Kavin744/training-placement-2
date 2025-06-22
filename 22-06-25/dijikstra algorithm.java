import java.util.*;

public class Dijkstra {
    public static void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] sptSet = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < V - 1; i++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v] != 0 &&
                    dist[u] != Integer.MAX_VALUE &&
                    dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        for (int i = 0; i < V; i++)
            System.out.println("Distance from " + src + " to " + i + ": " + dist[i]);
    }

    private static int minDistance(int[] dist, boolean[] sptSet) {
        int min = Integer.MAX_VALUE, minIdx = -1;
        for (int i = 0; i < dist.length; i++)
            if (!sptSet[i] && dist[i] < min) {
                min = dist[i];
                minIdx = i;
            }
        return minIdx;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 0, 0, 0, 0},
            {10, 0, 5, 0, 0, 0},
            {0, 5, 0, 2, 1, 0},
            {0, 0, 2, 0, 0, 3},
            {0, 0, 1, 0, 0, 6},
            {0, 0, 0, 3, 6, 0}
        };
        dijkstra(graph, 0);
    }
}
