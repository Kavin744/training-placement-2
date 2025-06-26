A = [[1, 2], [3, 4]]
B = [[5, 6], [7, 8]]

result = [[A[i][j] + B[i][j] for j in range(len(A[0]))] for i in range(len(A))]
print("Sum of matrices:")
for row in result:
    print(row)
