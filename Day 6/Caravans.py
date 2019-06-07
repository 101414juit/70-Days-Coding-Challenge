'''
https://www.codechef.com/problems/CARVANS
'''

# cook your dish here

for _ in range(int(input())):
    N=int(input())
    arr=list(map(int,input().split()))
    max=arr[0]
    count=1
    for i in range(0,N):
        if max > arr[i]:
            count+=1
            max=arr[i]
    print (count)
