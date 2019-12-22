class Solution(object):
    def merge(self, nums1, m, nums2, n):
        count = 0 
        index = 0  
        while count < n: 
            if nums1[index] > nums2[count]:
                nums1[index + 1:m + count + 1] = nums1[index:m + count]
                nums1[index] = nums2[count]
                count += 1
            if index > m + count - 1: 
                nums1[index] = nums2[count]
                count += 1
            index += 1
