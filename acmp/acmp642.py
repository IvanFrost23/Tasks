def merge(a, b):
    c = []
    i = 0
    j = 0
    while (i < len(a) or j < len(b)):
        if (j >= len(b)) or (i < len(a) and a[i] < b[j]):
            c.append(a[i])
            i += 1
        else:
            c.append(b[j])
            j += 1
    return c

def merge_sort(a):
    if (len(a) == 1):
        return a
    al = a[:len(a)//2]
    ar = a[len(a)//2:]
    al = merge_sort(al)
    ar = merge_sort(ar)
    return merge(al, ar)

n, s = input().split(' ')
n = int(n)
s = int(s)
a = input().split(' ')
for i in range(n):
    a[i] = int(a[i])
a = merge_sort(a)
ans = 0
sum = 0
for i in range(n):
    if (sum + a[i] <= s):
        ans += 1
        sum += a[i]
    else:
        break
print(ans)
