'''
Codechef June Long Challenge 2019
https://www.codechef.com/JUNE19B/problems/KS2
Partially Correct
'''
for _ in range(int(input())):
    N = int(input())
    x=N
    sum=0
    while x > 0 :
        sum += x % 10
        x = int(x / 10)    
    if sum % 10 == 0:
        print( 10 * N )
    else:
        print((10 * N) + (10 - (sum%10)) )
