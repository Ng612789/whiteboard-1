
import java.util.*;

public class p9 {

    public static void BFS_Find_Route(Map<String, List<String>> graph, String startID, String goalID) {

        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(startID);
        visited.add(startID);
        parent.put(startID, null);

        while (!queue.isEmpty()) {

            // Remove the first node from queue
            String current = queue.poll();

            // When the goal is found
            if (current.equals(goalID)) {
                break;
            }

            // Traverse to neighbouring nodes
            for (String next : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, current);
                    queue.add(next);
                }
            }
        }

        // Check the path exists or not
        if (!visited.contains(goalID)) {
            System.out.println("False");
            return;
        }

        // Reconstruct the path
        List<String> path = new ArrayList<>();
        String temp = goalID;

        while (temp != null) {
            path.add(temp);
            temp = parent.get(temp);
        }

        // Reverse the path
        Collections.reverse(path);

        System.out.println("True ("+ String.join(" --> ", path) + ")");
    }

    public static void main(String[] args) {

        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", Arrays.asList("B"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", Arrays.asList("G"));
        graph.put("E", Arrays.asList("F"));
        graph.put("F", Arrays.asList("B", "G"));
        graph.put("G", new ArrayList<>());
        graph.put("H", new ArrayList<>());

        System.out.println("Example 1: Start = D, End = B");
        BFS_Find_Route(graph, "D", "B");

        System.out.println("\nExample 2: Start = F, End = A");
        BFS_Find_Route(graph, "F", "A");

        System.out.println("\nExample 3: Start = G, End = C");
        BFS_Find_Route(graph, "G", "C");

        System.out.println("\nExample 4: Start = E, End = D");
        BFS_Find_Route(graph, "E", "D");
    }
}