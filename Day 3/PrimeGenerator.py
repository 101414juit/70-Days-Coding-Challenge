
def primeGenerator(n):
    number = [True for i in range(0,n+1)]
    p=2

    while p*p < n:
        if number[p]:
            for i in range(p*p,n+1,p):
                number[i]=False

        p=p+1

    for i in range(2,n):
        if number[i]:
            print(i, end = ' ')

n=30
print('Prime numbers are')
primeGenerator(n)
