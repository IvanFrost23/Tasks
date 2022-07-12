def merge_sort(a):
    if len(a) == 1:
        return a
    al = a[:len(a) // 2]
    ar = a[len(a) // 2:]
    al = merge_sort(al)
    ar = merge_sort(ar)
    return merge(al, ar)


def compare(param, param1):
    for i in range(3):
        if param[i] < param1[i]:
            return True
        if param[i] > param1[i]:
            return False

def merge(a, b):
    i = 0
    j = 0
    c = []
    while i < len(a) or j < len(b):
        if (j >= len(b)) or (i < len(a) and compare(a[i], b[j])):
            c.append(a[i])
            i += 1
        else:
            c.append(b[j])
            j += 1
    return c


n = int(input())
times = []
for i in range(n):
    a = list(map(int, input().split()))
    times.append(a)
times = merge_sort(times)
for i in times:
    print(i[0], i[1], i[2])

