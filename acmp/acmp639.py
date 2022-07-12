n = int(input())
standings = []
for i in range(n):
    k = int(input())
    for j in range(k):
        participant = input().split()
        standings.append(participant)
print(len(standings))


def merge(a, b):
    i = 0
    j = 0
    c = []
    while i < len(a) or j < len(b):
        if j >= len(b) or (i < len(a) and float(a[i][0]) > float(b[j][0])):
            c.append(a[i])
            i += 1
        else:
            c.append(b[j])
            j += 1
    return c


def merge_sort(standings):
    if (len(standings) == 1):
        return standings
    al = standings[:len(standings) // 2]
    ar = standings[len(standings) // 2:]
    al = merge_sort(al)
    ar = merge_sort(ar)
    return merge(al, ar)


standings = merge_sort(standings)
for i in standings:
    print(*i)
