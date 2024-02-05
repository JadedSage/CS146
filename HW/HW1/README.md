The way to approach this problem is seperated into two parts

Removing and fixing any parts of the string that are non alphanumeric and changing the case of alphabet to lowercase
Then we compare the reversed string with the main string to get our result.

To make the string all lowercase I used the built in method .toLowerCase() to make all the letters lowercase.
To remove the parts I used the propteries of an char which can be used to compare to the ascii table of the values that each character that is compared to see if its within the range of numbes that would identify it as a nonalphanumeric char.

Then I used a for loop and character array to reverse the string and then compared it with the built in fucntion normal.equals(reversed string)
and see what values are returned and then print said results.

In hindsight there is a built in function for reversing the string that I could have used that would have made it faster.
