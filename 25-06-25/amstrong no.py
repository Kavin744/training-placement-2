num = int(input("Enter a 3-digit number: "))
sum_cubes = sum(int(digit)**3 for digit in str(num))

if sum_cubes == num:
    print("Armstrong number")
else:
    print("Not an Armstrong number")
