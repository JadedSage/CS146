def threeSum(self, nums: list[int]) -> list[list[int]]:
    nums.sort()  
    if len(nums) < 3 or len(nums) > 3000:
        return []  
    if nums[0] < -10000 or nums[-1] > 10000:
        return [] 

    solution = []  
    seen_triplets = set()  

    for i in range(len(nums) - 2):
        j = i + 1
        k = len(nums) - 1

        while j < k:
            current_sum = nums[i] + nums[j] + nums[k]

            if current_sum == 0:
                triplet = (nums[i], nums[j], nums[k])
                if triplet not in seen_triplets:
                    solution.append(list(triplet))  
                    seen_triplets.add(triplet)  
                j += 1
                k -= 1
            elif current_sum < 0:
                j += 1
            else:
                k -= 1

    return solution


nums = [-10000, -5, 0, 5, 10, -10, 0, 10000]
triplets = threeSum(None, nums)  
print(triplets)