s = input()
ss = []
for i in range(len(s)):
    ss.append([s[i], i])
ss = sorted(ss)
alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
for i in range(len(ss)):
    if ss[i][0] < alphabet[i]:
        print("NO")
        exit()
print("YES")
for i in range(len(s)):
    print(ss[i][1] + 1, end = " ")
