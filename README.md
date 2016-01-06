# Producer-Consumer Problem
This solution explains how to solve producer-consumer problem using Java threads.

I used Runnable interface for creatation of Producer and Consumer class. 

Producer inserts an element to queue. (produces)
Consumer remove element from queue. (consumes)

If queue is full, producer waits. If queue is empty, consumer waits.

**Sample output:**
```
Producer thread inserted number: 0 to queue.
Producer thread inserted number: 1 to queue.
Producer thread inserted number: 2 to queue.
Producer thread inserted number: 3 to queue.
Producer thread inserted number: 4 to queue.
Queue is full. Producer is waiting...
Producer thread inserted number: 5 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 4
Consumer got the element: 5
Producer thread inserted number: 6 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 6
Producer thread inserted number: 7 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 7
Producer thread inserted number: 8 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 8
Producer thread inserted number: 9 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 9
Producer thread inserted number: 10 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 10
Producer thread inserted number: 11 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 11
Producer thread inserted number: 12 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 12
Producer thread inserted number: 13 to queue.
Queue is full. Producer is waiting...
Consumer got the element: 13
Producer thread inserted number: 14 to queue.
Consumer got the element: 14
Consumer got the element: 3
Consumer got the element: 2
Consumer got the element: 1
Consumer got the element: 0
Queue is empty. Consumer is waiting...
```


