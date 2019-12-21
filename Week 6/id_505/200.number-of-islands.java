/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 *
 * https://leetcode.com/problems/number-of-islands/description/
 *
 * algorithms
 * Medium (43.20%)
 * Likes:    3687
 * Dislikes: 135
 * Total Accepted:    498.4K
 * Total Submissions: 1.1M
 * Testcase Example:  '[["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]'
 *
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of
 * islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of
 * the grid are all surrounded by water.
 * 
 * Example 1:
 * 
 * 
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 * 
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 * 
 * Output: 3
 * 
 */

// @lc code=start
class Solution {
    class UnionFind {
      int count;
      int[] parent;
      int[] weight;
  
      public UnionFind(char[][] grid) {
        count = 0;
        int m = grid.length;
        int n = grid[0].length;
        parent = new int[m * n];
        weight = new int[m * n];
        for (int i = 0; i < m; ++i) {
          for (int j = 0; j < n; ++j) {
            if (grid[i][j] == '1') {
              parent[i * n + j] = i * n + j;
              ++count;
            }
            weight[i * n + j] = 0;
          }
        }
      }
  
      public int find(int i) {
        if (parent[i] != i) parent[i] = find(parent[i]);
        return parent[i];
      }
  
      public void union(int x, int y) { 
        int rootx = find(x);
        int rooty = find(y);
        if (rootx != rooty) {
          if (weight[rootx] > weight[rooty]) {
            parent[rooty] = rootx;
          } else if (weight[rootx] < weight[rooty]) {
            parent[rootx] = rooty;
          } else {
            parent[rooty] = rootx; weight[rootx] += 1;
          }
          --count;
        }
      }
  
      public int getCount() {
        return count;
      }
    }
  
    public int numIslands(char[][] grid) {
      if (grid == null || grid.length == 0) {
        return 0;
      }
  
      int nr = grid.length;
      int nc = grid[0].length;
      int num_islands = 0;
      UnionFind uf = new UnionFind(grid);
      for (int r = 0; r < nr; ++r) {
        for (int c = 0; c < nc; ++c) {
          if (grid[r][c] == '1') {
            grid[r][c] = '0';
            if (r - 1 >= 0 && grid[r-1][c] == '1') {
              uf.union(r * nc + c, (r-1) * nc + c);
            }
            if (r + 1 < nr && grid[r+1][c] == '1') {
              uf.union(r * nc + c, (r+1) * nc + c);
            }
            if (c - 1 >= 0 && grid[r][c-1] == '1') {
              uf.union(r * nc + c, r * nc + c - 1);
            }
            if (c + 1 < nc && grid[r][c+1] == '1') {
              uf.union(r * nc + c, r * nc + c + 1);
            }
          }
        }
      }
  
      return uf.getCount();
    }
  }
  
// @lc code=end

