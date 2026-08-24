from typing import List

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        # 1. Define the helper function first
        def b(nums, t, bias):
            l, r = 0, len(nums) - 1
            i = -1
            while l <= r:
                m = (l + r) // 2
                if t > nums[m]:
                    l = m + 1
                elif t < nums[m]:
                    r = m - 1
                else:
                    i = m
                    if bias:
                        r = m - 1
                    else:
                        l = m + 1
            return i

        # 2. Call it and return the result
        left = b(nums, target, True)
        right = b(nums, target, False)
        return [left, right]
