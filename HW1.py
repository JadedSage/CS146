import re


result = False
s = "1RaceCar1"

s = s.lower() #remove uppercase letters
s = re.sub(r'\W+', '', s) #remove non alphanumeric stuff
revs = s[::-1]
if(s==revs):
    result = True
else:
    result = False

print (result)
    
