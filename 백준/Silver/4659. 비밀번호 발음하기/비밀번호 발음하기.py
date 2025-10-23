alpha_vowels = ['a','e','i','o','u']
alpah_consonant = ['b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z']

fail = []
while True:
    word = input()
    if word == 'end':
        break

    isPass = True

    # 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
    if not any(char in alpha_vowels for char in word):
        isPass = False

    # 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
    for idx in range(1, len(word)):
        if word[idx - 1] == word[idx] and word[idx] not in ['e','o']:
            isPass = False
            break

    # 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
    for idx in range(2, len(word)):
        if word[idx] in alpha_vowels and word[idx - 1] in alpha_vowels and word[idx - 2] in alpha_vowels:
            isPass = False
            break
        elif word[idx] in alpah_consonant and word[idx - 1] in alpah_consonant and word[idx - 2] in alpah_consonant:
            isPass = False
            break

    if isPass:
        print(f"<{word}> is acceptable.")
    else:
        print(f"<{word}> is not acceptable.")
