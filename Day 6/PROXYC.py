'''
Codechef Long Challenge 2019 June
Problem Statement:
https://www.codechef.com/JUNE19B/problems/PROXYC
'''

import math
for _ in range(int(input())):
    D = int(input())
    s = input()
    count_p=s.count('P')
    counter=0
    if count_p/D >=0.75:
        print(counter)
    else:
        x=math.ceil( (0.75*D) - count_p )
        # print('Value of X is {} '.format(x))
        for i in range (2,len(s)-2):
            if s[i] == 'A' and ( s[i-1] == 'P' or s[i-2] == 'P' ) and (s[i+1] == 'P' or s[i+2] == 'P' ):
                counter = 1 + counter
                if counter == x:
                    print(counter)
                    break
        if counter != x:
            print(-1)
