import re

def solution(myString):
    answer = ''
    return re.sub('[a-l]','l',myString)