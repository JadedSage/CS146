We have 2 conditions
Minimize the calls to the API
Find the first instance of the Version being bad

I chose the method of Binary Search
This is because it seems like the perfect search algorithm because it does minimal calls to the api
While narrowing down the search area until we get to one point

This is because our "Key" for binary search is replaced with our API. We can then use the built in comparision from the API
from it telling us if the version we are looking at is a bad or good version and proceed from there
