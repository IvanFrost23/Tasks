n = int(input())
num1 = int("9" * n)
if n == 1:
    num2 = 0
else:
    num2 = int("9" * (n - 1))
sum1 = num1 * (num1 + 1) // 2
sum2 = num2 * (num2 + 1) // 2
print(sum1 - sum2)
