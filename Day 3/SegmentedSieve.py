
n=100000

# It will generate the prime numbers between 0<=N<=100001
def prime_number_generator(n):
    p=2
    isPrime = [True for i in range(0, n + 1)]
    while p*p<n:
        if isPrime[p]:
            for i in range(p*p,n+1,p):
                isPrime[i]=False
        p=p+1

    prime_number_list = []
    prime_number_list.append(2)

    for i in range(3,n+1,2):
        if isPrime[i]:
            prime_number_list.append(i)
    return prime_number_list

#Segments of size m<=N<=n+1 will be created
def segmented_primes(m,n,prime_number_list):
    isPrime = [True for i in range(0, n-m + 1)]

    i=0
    while prime_number_list[i]*prime_number_list[i] <= n:
    #for i in range(0,prime_number_list[i]*prime_number_list[i]):
        current_prime = prime_number_list[i]
        base = int(int(m/current_prime)*current_prime)
        print ("The base value is {} for current_prime {}. ".format(base,current_prime))
        if base < m:
            base +=current_prime

        for  j in range(base, n, current_prime):
            isPrime[j-m]=False
        if base==current_prime:
            print('The base is {} {} '.format(base,current_prime))
            isPrime[base-m]=True
        i=i+1

    for i in range (0,n-m+1):
        print("Is Prime List value {} is {}.   Prime_number_list value {} is {} ".format(i,isPrime[i],i,prime_number_list[i]))
    # print()
    # for i in range(0, n - m + 1):
    #     print("The {} is {}".format(i, prime_number_list[i]))
        # if isPrime[i]:
        #     print(i)
    print()



prime_number_list=prime_number_generator(n)
T = int(input())
for i in range(0,T):
    m,n = map(int,input().split())
    segmented_primes(m,n,prime_number_list)






