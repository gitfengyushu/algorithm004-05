# -*- coding:utf-8 -*-

class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        # 二维数组行数
        len_matrix = len(matrix)

        if len_matrix == 0:
            return False
        # 二维数组列数
        len_r = len(matrix[0])

        left, right = 0, len_matrix * len_r -1

        while left <= right:
            mid = (left + right) // 2
            val = matrix[mid // len_r][mid % len_r]

            if target == val:
                return True
            else:
                if target > val:
                    left += 1
                else:
                    right -= 1

        return False

m = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]

s = Solution()

print(s.searchMatrix(m, 11))
