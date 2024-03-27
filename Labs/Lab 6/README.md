What we did here was use a topological sort to solve this problem
We do this by creating a queue to store the locations of the nodes
Then we go through each course and find the course with no prerequies
Pop that off the queue add the courses that are next in the list

Repeat and if the size isnt equal to total number of courses then we know the result is false
