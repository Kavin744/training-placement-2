def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

x, y = map(int, input("Enter two numbers: ").split())
print("GCD:", gcd(x, y))
