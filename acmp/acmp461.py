def merge(a, b):
    i = 0
    j = 0
    c = []
    while i < len(a) or j < len(b):
        if (j >= len(b)) or ((i < len(a)) and (a[i] < b[j])):
            c.append(a[i])
            i += 1
        else:
            c.append(b[j])
            j += 1
    return c


def merge_sort(a):
    if len(a) == 1:
        return a
    al = a[:len(a) // 2]
    ar = a[len(a) // 2:]
    al = merge_sort(al)
    ar = merge_sort(ar)
    return merge(al, ar)


n = int(input())
a = list(map(int, input().split()))
a = merge_sort(a)
ans = 0
for i in range(n // 2 + 1):
    ans += a[i] // 2 + 1
print(ans)
