class Node(object):
    def __init__(self, val,children):
        self.val = val
        self.children = children

class Solution(object):
    def __init__(self):
        self.res = []
    def preorder(self, root):
        if(root == None):
            return
        else:
            self.res.append(root.val)
            if(root.children):
                for child in root.children:
                    self.preorder(child)
            return self.res
