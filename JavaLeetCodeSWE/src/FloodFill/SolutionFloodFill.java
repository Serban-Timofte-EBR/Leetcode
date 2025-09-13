package FloodFill;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionFloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image;
        }

        int imageWidht = image.length;
        int imageHeighth = image[0].length;
        int[][] directions = new int[][] {
                {-1, 0},
                {0, -1},
                {0, 1},
                {1, 0}
        };

        Queue<int[]> neighbours = new LinkedList<>();
        image[sr][sc] = color;
        neighbours.add(new int[]{sr, sc});

        while (!neighbours.isEmpty()) {
            int[] currentCoord = neighbours.poll();
            int currentRow = currentCoord[0];
            int currentCol = currentCoord[1];

            for(int[] dir : directions) {
                int newRow = currentRow + dir[0];
                int newCol = currentCol + dir[1];

                boolean isValid =
                        newRow >= 0 && newRow < imageWidht
                        && newCol >= 0 && newCol < imageHeighth;

                if (isValid && image[newRow][newCol] == originalColor) {
                    image[newRow][newCol] = color;
                    neighbours.add(new int[]{newRow, newCol});
                }
            }
        }

        return image;
    }
}
