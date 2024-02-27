So what we used was a minheap.
This is because minheaps are perfect for what we need todo as they allow us to know what the earliest stop point for the server
And because we had sorted the arrays by start time
We can use a loop to check if the start time of the new task is less that the end time of the previous task
Doing this we can count the amount of servers required and if a server is done by the time our next start task is done.

I also did not want to make a minheap from scratch so I imported it based on
https://www.geeksforgeeks.org/min-heap-in-java/
and used 
https://www.geeksforgeeks.org/priority-queue-class-in-java/
as a reference to how to use this class
