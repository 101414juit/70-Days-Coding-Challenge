'''
Hackerearth June Easy 2019
'''


T = int(input())

for i in range(0,T):
    green,purple=map(int,input().split())
    participant=int(input())
    
    prob_1=0
    prob_2=0
    for j in range(0,participant):
        n,m=map(int,input().split())
        prob_1+=n
        prob_2+=m
    print(max(prob_1,prob_2)*min(green,purple)+min(prob_1,prob_2)*max(green,purple))
