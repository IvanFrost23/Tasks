n = int(input())
a = list(map(int, input().split()))
d = {}
for i in range(n):
    d[a[i]] = i
for i in range(n):
    print(d[i + 1] + 1, end = " ")
