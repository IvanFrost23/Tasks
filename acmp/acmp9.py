n = int(input())
a = list(map(int, input().split()))
sum = 0
max = 0
min = 0
for i in range(n):
    if a[i] > 0:
        sum += a[i]
    if a[i] > a[max]:
        max = i
    if a[i] < a[min]:
        min = i
ans = 1
if (min > max):
    min, max = max, min
for i in range(min + 1, max):
    ans = ans * a[i]
print(sum, ans)
