public class ShortestPath {
    // time complexity is O(n) in best case and worst case
     
    // Function to compute the shortest path from the given sequence of directions
    public static float shortestpath(String path) {
        // Initialize coordinates to the starting point (0, 0)
        int x = 0, y = 0;

        // Traverse through the path and update coordinates
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i); // Get the direction character

            // Update the coordinates based on the direction
            if (dir == 'S') {
                y--; // Move south, decrease y
            } else if (dir == 'N') {
                y++; // Move north, increase y
            } else if (dir == 'W') {
                x--; // Move west, decrease x
            } else if (dir == 'E') {
                x++; // Move east, increase x
            }
        }

        // Compute the square of the final x and y coordinates
        int x2 = x * x;
        int y2 = y * y;

        // Calculate the Euclidean distance (shortest path)
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        // Define the path (sequence of directions)
        String path = "WNEENESENNN";

        // Output the shortest path based on the given directions
        System.out.println(shortestpath(path)); // Expected output: Euclidean distance
    }
}
