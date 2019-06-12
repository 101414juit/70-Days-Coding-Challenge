'''
Not Working
https://www.codechef.com/JUNE19B/problems/KS2
'''

import math

for _ in range(int(input())):
    N = int(input())
    
    num = 19+ ((N-1) *9)
    x = num
    sum = 0
    e = 0
    
    while x > 0 :
        sum += x % 10
        x = int(x / 10)
    
    if sum%10 != 0 :
        e=int(math.log10(num)) - 1
    
    num =+ e*9
    print('Input is {}'.format(N))
    print('Value of Num is {}'.format(num))
    print('Value of x is {}'.format(x))
    print('Value of Digital sum is {}'.format(sum))
    print ('Value of Exception is {}'.format(e))
    print('---------------------------------------')
