# -*- coding:utf-8 -*-
class Solution:
    def lengthOfLIS(self, nums: list) -> int:
        if not nums:
            return 0

        dp = [1] * len(nums)

        for i in range(len(nums)):
            for j in range(i):
                if nums[j] < nums[i]:
                    dp[i] = max(dp[i], dp[j]+1)
        return max(dp)

l = [10,9,2,5,3,7,101,18]
s = Solution()
print(s.lengthOfLIS(l))
