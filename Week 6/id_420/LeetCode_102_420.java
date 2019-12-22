package geekbang.myleetcode.week06;

import geekbang.myleetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: jimmy.wong
 * @date: 2019-12-06 18:42
 */
public class LeetCode_102_420 {
    /**
     * 解法1：递归，用DFS的执行方式，获取BFS的输出效果
     */
    class Solution_1 {

        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> levels = new ArrayList<List<Integer>>();

            if (null == root) {
                return levels;
            }

            helper(levels, root, 0);
            return levels;
        }

        private void helper(List<List<Integer>> levels, TreeNode root, int level) {
            if (levels.size() == level) {
                levels.add(new ArrayList<Integer>());
            }

            levels.get(level).add(root.val);

            if (null != root.left) {
                helper(levels, root.left, level + 1);
            }
            if (null != root.right) {
                helper(levels, root.right, level + 1);
            }
        }
    }

    /**
     * 解法2：迭代
     */
    class Solution_2 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> levels = new ArrayList<List<Integer>>();

            if (null == root) {
                return levels;
            }

            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int widthInLevel = queue.size();
                List<Integer> nodesInLevel = new ArrayList<Integer>(widthInLevel);
                levels.add(nodesInLevel);

                for (int i = 0; i < widthInLevel; i++) {
                    TreeNode node = queue.poll();
                    if (null == node) {
                        continue;
                    }
                    nodesInLevel.add(node.val);
                    if (null != node.left) {
                        queue.offer(node.left);
                    }
                    if (null != node.right) {
                        queue.offer(node.right);
                    }
                }
            }

            return levels;
        }
    }
}
