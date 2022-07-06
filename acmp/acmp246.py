n = int(input())
a = input().split(' ')
for i in range(n):
    a[i] = int(a[i])
ans = 0
for i in range(1, n):
    if (a[i] != a[i - 1] + 1):
        ans += 1
print(ans)
