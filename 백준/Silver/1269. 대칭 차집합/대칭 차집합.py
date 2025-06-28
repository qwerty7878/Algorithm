import sys

a,b = map(int,sys.stdin.readline().split())
arr1 = set(map(int,sys.stdin.readline().split()))
arr2 = set(map(int,sys.stdin.readline().split()))

aminusb = len(arr1 - arr2)
bminusb = len(arr2 - arr1)
print(aminusb + bminusb)