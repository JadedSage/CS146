
#Variables, or is it technically objects cus something something 151 idk 
arr = [11,24,32,14,23,123,12,1,6]
target = 20
solution= []
find = False
#Bruh wtf is seperate indexes in python I AM IN A POWER OUTAGE and my phone is dead so gl looking up the answer 
for i,ele in enumerate(arr):
    tempELE = target - ele
    for j,ele2 in enumerate(arr):
        if ((j!=i) and (ele2==tempELE)):
            solution.append(i)
            solution.append(j)
            find=True
            break;
    if(find==True):
        break;
print (solution)
            
            
            
