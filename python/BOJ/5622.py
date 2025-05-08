# 백준 5622번 - 문자열 - 다이얼
# 문제 : https://www.acmicpc.net/problem/5622

dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
dial_lst = [0 for _ in range(26)]
i = 0
#for dial_s in dial:
    # for c in dial_s:
        # idx = ord(c) - ord('A')
        # dial_lst[idx] = i + 3
    # i += 1
for i, dial_s in enumerate(dial):
    for c in dial_s:
        dial_lst[ord(c) - ord('A')] = i + 3


input_data = input()
result = 0
for c in input_data:
    idx = ord(c) - ord('A')
    result += dial_lst[idx]

print(result)