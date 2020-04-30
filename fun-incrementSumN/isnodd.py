
def addArr(arr, n):
    for i in range(1, n+1):
        if i % 2 != 0:
            arr.append(i)
    if n % 2 == 0:
        arr.append(n)

def arrSum(arr):
    sum = 0
    for n in arr:
        sum += n
    return sum

def distArr(arr):
    lastN = len(arr)
    iDist = 0 # i distribute
    nprev = 0
    idprev = 0
    while (iDist <= lastN):
        nprev = lastN
        idprev = iDist
        iDist += 1
        lastN = arrSum(arr) - (iDist*(len(arr) - 1))
    
    tempArr = []
    for i in range(0,(len(arr) - 1)):
        tempArr.append(idprev)
    tempArr.append(nprev)

    return tempArr

def sumNFormat(n):
    arrN = []
    addArr(arrN, n)

    return distArr(arrN)
    # return arrN

def sumN(n):
    arrN = []
    addArr(arrN, n)

    return arrSum(arrN)

nArr = []
xArr = []
totArr = []
for i in range(5, 101):
    # if (i % 2 == 0):
        arr = sumNFormat(i)
        n = i
        x = (arr[-1] - arr[-2]) 
        # tot = sumN(i)
        # nArr.append(n)
        # xArr.append(x)
        # totArr.append(tot)
        print("%-7s"%"n = {0}".format(i), "%-7s"%"x = {0}".format(x), "%-10s"%"sum = {0}".format(sumN(i)), arr)

# print(nArr)
# print(xArr)
# print(totArr)