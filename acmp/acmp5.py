n = int(input())
a = input().split(' ')
for i in range(n):
    a[i] = int(a[i])
b = []
c = []
for i in a:
    if (i % 2 == 0):
        c.append(i)
    else:
        b.append(i)
for i in b:
    print(i, end = ' ')
print()
for i in c:
    print(i, end = ' ')
print()
if (len(c) >= len(b)):
    print("YES")
else:
    print("NO")
