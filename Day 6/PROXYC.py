'''
https://www.codechef.com/JUNE19B/problems/PROXYC
Custom Testcase:
10
2
PP
2
PA
1
A
1
P
4
PAAP
8
PAAAAAPA
8
APAAAAPA
5
PPPPP
5
AAAAA
9
PAAPPAPPP
'''

for _ in range(int(input())):
    D = int(input())
    s = input()
    count_p=s.count('P')
    counter=count_p
    if count_p/D >=0.75:
        print(0)
    else:
        for i in range (2,len(s)-2):
            if s[i] == 'A' and ( s[i-1] == 'P' or s[i-2] == 'P'or s[i+1] == 'P' or s[i+2] == 'P' ):
                counter += 1
                if counter/D >= 0.75:
                    print(counter-count_p)
                    break
        if counter/D < 0.75:
            print('-1')
