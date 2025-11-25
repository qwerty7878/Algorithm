s = input()

zero_to_one_cnt = 0
one_to_zero_cnt = 0

for i in range(1, len(s)):
    if s[i] == s[i-1]:
        continue
    else:
        if s[i-1] == '1':
            one_to_zero_cnt += 1
        else:
            zero_to_one_cnt += 1

print(max(zero_to_one_cnt, one_to_zero_cnt))