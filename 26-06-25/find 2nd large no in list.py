def second_largest(nums):
    unique_nums = list(set(nums))
    unique_nums.sort()
    return unique_nums[-2] if len(unique_nums) >= 2 else None

lst = list(map(int, input("Enter list elements: ").split()))
result = second_largest(lst)
print("Second largest number:", result)
