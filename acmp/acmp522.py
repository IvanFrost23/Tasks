M, N = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
check = set(a)
check2 = set(b)
if check == check2:
    print(1)
else:
    print(0)
