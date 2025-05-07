# 문자열 문제 - 10809번 - 알파벳 찾기

input = input()
r = ord('z') - ord('a') # a ~ z 범위 배열을 만들기 위해서
lst = [-1 for _ in range(r+1)]

for c in input:
    idx = input.index(c)
    i = ord(c) - ord('a')
    if lst[i] == -1:
        lst[i] = idx
 
print(*lst)