# 문자열 문제 - 11720번 - 숫자의 합

n = int(input())
num = input()
sum = 0
for v in num:
    sum += int(v)
print(sum)