n = int(input())
s = ""
now = ""
ind = 1
while (n >= len(s)):
    now += str(ind)
    ind += 1
    s += now
print(s[n - 1])
