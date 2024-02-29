
def longestPalindrome(s):
    sorted(s)
    sort = list(s)
    char_count = {} 
    unique_chars = set()  
    
    for c in sort:
        if c not in unique_chars:
            unique_chars.add(c)
            char_count[c] = 1  
        else:
            char_count[c] += 1  
    
    high = None
    counters=0
    palindrome = []
    for i in range(len(unique_chars)):
        temp = char_count[i]

        if(char_count%2==0):
            while(temp!=0):
                if(temp%2==0):
                    palindrome.insert(0,unique_chars[i])
                else:
                    palindrome.append(unique_chars[i])
                
                temp = temp-1
        else:
            if(counters<char_count[i]):
                high = unique_chars[i]
                counters = char_count[i]
        
                
            
    return (len(palindrome)+counters)
            
            

s = "speediskey" 
if 1 <= len(s) <= 2000:
    print(longestPalindrome(s))
else:
    print("Length Invalid")
