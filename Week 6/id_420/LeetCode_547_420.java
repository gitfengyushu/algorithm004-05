package geekbang.myleetcode.week06;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: jimmy.wong
 * @date: 2019-12-08 16:31
 */
public class LeetCode_547_420 {

    /**
     * 解法1：深度优先搜索
     */
    class Solution_DFS {
        public void dfs(int[][] M, int[] visited, int i) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] == 1 && visited[j] == 0) {
                    visited[j] = 1;
                    dfs(M, visited, j);
                }
            }
        }

        public int findCircleNum(int[][] M) {
            int[] visited = new int[M.length];
            int count = 0;

            for (int i = 0; i < M.length; i++) {
                if (visited[i] == 0) {
                    dfs(M, visited, i);
                    count ++;
                }
            }
            return count;
        }
    }

    /**
     * 解法2：广度优先搜索
     */
    class Solution_BFS {
        public void bfs(int[][] M, int[] visited, Queue<Integer> queue) {
            while (!queue.isEmpty()) {
                Integer e = queue.remove();
                visited[e] = 1;
                for (int j = 0; j < M.length; j++) {
                    if (M[e][j] == 1 && visited[j] == 0) {
                        queue.add(j);
                    }
                }
            }
        }

        public int findCircleNum(int[][] M) {
            int[] visited = new int[M.length];
            int count = 0;

            Queue<Integer> queue = new LinkedList<Integer>();
            for (int i = 0; i < M.length; i++) {
                if (visited[i] == 0) {
                    queue.add(i);
                    bfs(M, visited, queue);
                    count ++;
                }
            }
            return count;
        }
    }


}
