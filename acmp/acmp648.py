n = int(input())
a = list(map(int, input().split()))
a = sorted(a)
print(sum(a[len(a) // 2:]) - sum(a[:len(a) // 2]))
