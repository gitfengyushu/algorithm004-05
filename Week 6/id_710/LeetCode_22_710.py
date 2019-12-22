# -*- coding:utf-8 -*-
class Solution:
    def generateParenthesis(self, n: int) -> list:
        if n == 0:
            return []

        total_p = []
        total_p.append([None])
        total_p.append(['()'])

        for i in range(2, n+1):
            l = []
            for j in range(i):
                nl1 = total_p[j]
                nl2 = total_p[i-j-1]

                for k1 in nl1:
                    for k2 in nl2:
                        if k1 is None:
                            k1 = ""
                        if k2 is None:
                            k2 = ""

                        el = '(' + k1 + ')' + k2
                        l.append(el)
            total_p.append(l)
        return total_p[n]

s = Solution()
print(s.generateParenthesis(2))
