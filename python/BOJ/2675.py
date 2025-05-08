# 백준 2675번 - 문자열 - 문자열 반복
# 문제 : https://www.acmicpc.net/problem/2675
t = int(input())

for _ in range(t):
    rep, word = input().split()
    rep = int(rep)
    for ch in word:
        print(ch * rep, end ='')
    print()