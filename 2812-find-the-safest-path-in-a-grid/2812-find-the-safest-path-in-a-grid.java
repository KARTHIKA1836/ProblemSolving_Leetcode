class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        if (grid.get(0).get(0) == 1 || grid.get(n - 1).get(n - 1) == 1) {
            return 0;
        }
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    q.offer(new int[]{i, j});
                    dist[i][j] = 0;
                }
            }
        }
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        
        int[][] maxSafeness = new int[n][n];
        for (int[] row : maxSafeness) {
            Arrays.fill(row, -1);
        }

        pq.offer(new int[]{dist[0][0], 0, 0});
        maxSafeness[0][0] = dist[0][0];

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int s = curr[0];
            int r = curr[1];
            int c = curr[2];
            if (r == n - 1 && c == n - 1) {
                return s;
            }

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                    int newSafeness = Math.min(s, dist[nr][nc]);
                    if (newSafeness > maxSafeness[nr][nc]) {
                        maxSafeness[nr][nc] = newSafeness;
                        pq.offer(new int[]{newSafeness, nr, nc});
                    }
                }
            }
        }
        return 0;
    }
}
