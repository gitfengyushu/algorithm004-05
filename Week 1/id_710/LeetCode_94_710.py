"""
题目:
给定一个二叉树，返回它的中序 遍历。
示例:
输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,3,2]
"""


class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.right = None
        self.left = None


class Solution(object):
    def inorderTraversal1(self, root):
        WHITE, GRAY = 0, 1
        res = []
        stack = [(WHITE, root)]
        while stack:
            color, node = stack.pop()
            print(color)
            print(node)
            if node is None:
                continue
            if color == WHITE:
                stack.append((WHITE, node.right))
                stack.append((GRAY, node))
                stack.append((WHITE, node.left))
            else:
                res.append(node.val)
        return res


def main():
    root = TreeNode([1, None, 2, 3])

    s = Solution()

    res = s.inorderTraversal1(root)
    print(res)


if __name__ == '__main__':
    main()
