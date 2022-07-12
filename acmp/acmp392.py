n = int(input())
a = list(map(int, input().split()))
start_pos = 0
for i in range(n):
    if a[i] == 1:
        start_pos = i
        break
print(*a[start_pos:], *a[:start_pos])
