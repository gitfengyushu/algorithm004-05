# -*- coding:utf-8 -*-

class Solution:
    @staticmethod
    def search_0(nums: list, target: int) -> int:
        """
        利用二分法
        时间复杂度: O(logN)
        :param nums:
        :param target:
        :return:
        """
        sorted_nums = sorted(nums)

        if not nums or target < sorted_nums[0] or target > sorted_nums[-1]:
            return -1

        if sorted_nums[0] == target or sorted_nums[-1] == target:
            return nums.index(target)

        left = 0
        right = len(nums)
        mid = (left + right) // 2

        while left < mid:
            if sorted_nums[mid] > target:
                right = mid
                mid = (left + right) // 2
            elif sorted_nums[mid] < target:
                left = mid
                mid = (left + right) // 2
            else:
                return nums.index(target)
        return -1


s = Solution()

print(s.search_0([3,5,1],3))