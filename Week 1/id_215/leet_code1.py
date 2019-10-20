# leet code #26 remove duplicates from sorted array 

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # First, I think we can just list(set(num)) to get the result 
        # but the type erro occurs, seems like we cannot use the set() function 
        # Scond, I conder about using the pointer to get the result
        # we set i as pointer and move to the end when the value of the next elment 
        # is the same to the previous element, then we delete it
        # The time complexity is O(n) because of one loop
        i = 0
        while i < len(nums): # the pionter
            if nums[i]==nums[i-1]:
                del(nums[i])
            else:
                i+=1
        return i
    
    # Another solution (from discussion):
    # set two pointers i nad j, the pionter i store the unduplicated result 
    # let the pionter j move around
    def removeDuplicates2 (self, nums: List[int]) -> int:
        i,j=1,1  # set two pointers
        while j < len (nums):
            if nums[i-1]!=nums[j]:
                nums[i]=nums[j] #  # the pionter move from i to j under this condition
                i+=1 # the pinter i go to next 
            j+=1  # move j under while condition 
       return i
