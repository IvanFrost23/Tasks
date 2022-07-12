n = int(input())
a = list(map(int, input().split()))
ans = []
for i in a:
    x = i
    if x % 2 != 0:
        continue
    s = ""
    while x != 0:
        s = str(x % 8) + s
        x //= 8
    if int(s[-3]) % 2 == 1:
        ans.append(i)
ans = sorted(ans)
print(len(ans))
print(*ans)
