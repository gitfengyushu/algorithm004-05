# -*- coding:utf-8 -*-
# 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
# 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
# 问总共有多少条不同的路径
class Solustion:
    def uniquePaths_0(self, m: int, n: int) -> int:
        """
        思路: 杨辉三角形
        1. 到达 dp[i][j]的路径, 为到达 dp[i-1][j] 和 dp[i][j-1] 的路径之和
        2. 到达第一行所有块的路径只有1种, 即 dp[0][i]=1
        3. 到达第一列所有块的路径也只有1种, 即 dp[i][0]=1
        :param m:
        :param n:
        :return:
        """
        # 如果是1*1的网格,则只有1种路径
        if m == 1 and n == 1:
            return 1
        # 初始化一个 m行n列的网格
        dp = [[0] * n] * m
        # 将第1行的所有网格的路径设置为1
        for i in range(n):
            dp[0][i] = 1
        # 将第1列的所有网格的路径设置为1
        for j in range(m):
            dp[j][0] = 1

        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]

        return dp[m - 1][n - 1]


s = Solustion()
print(s.uniquePaths_0(3, 2))
