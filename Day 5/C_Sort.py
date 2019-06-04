'''
https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/sort-it-out/
Check the best solution in CPP.

'''

_  = int(input())
li = list(map(int,input().split()))
di = { i : li[i] for i in range(0, len(li) ) }
# print(di)

li=sorted(di.items(), key = lambda kv:(kv[1], kv[0]))
for index, val in li:
    print(index,end=' ')
