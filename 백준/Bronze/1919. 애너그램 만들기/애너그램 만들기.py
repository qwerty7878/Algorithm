word_a = input()
word_b = input()

remove_cnt = 0

stack = [char for char in word_a]
not_contain_words = []

for char in word_b:
    if char in stack:
        stack.remove(char)
    else:
        not_contain_words.append(char)

remove_cnt = len(stack) + len(not_contain_words)
print(remove_cnt)