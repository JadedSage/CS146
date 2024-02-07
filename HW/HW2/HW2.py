import random

#declaring global variables
n = []
for i in range(100000):
    n.append(i)
randbadVer=random.randint(0,len(n))  

#this is the api that is given
def isBadVersion(version):
    if version<randbadVer:
        return False
    else:
        return True

left = 0
right = len(n)-1
calls = 0

#start of binary search
while left<=right:
    
    if left==right:
        calls+=1
        if(isBadVersion(n[left])):
            break
        else:
            left+=1
            right+=1
            break
            
    
    middle = (left+right)/2
    middle = int(middle)
    calls+=1
    if(isBadVersion(n[middle])):
        right = middle-1
    else:
        left = middle+1

print("Bad Version set Randomly: ",randbadVer)
print("Found Bad Version: ",n[left])
print ("Total Calls: ",calls)