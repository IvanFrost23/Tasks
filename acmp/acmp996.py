n = int(input())
a = set()
prev = 1
for i in range(2, n + 1):
    if i in a:
        prev += 3
        a.add(prev)
    else:
        prev += 2
        a.add(prev)
print(prev)
