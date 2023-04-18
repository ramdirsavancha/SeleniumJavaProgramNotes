Queue:-
--------
Def:-Queue is an sub interface of collection which provides additional insertion,extraction and inspection operations.

Points to be remember:-
----------------------
*Order of elements are in FIFO(First-in-First-out) manner.(It may mor may not differ for its sub interfaces or implentation classes).
* In a FIFO queue, all new elements are inserted at the tail of the queue.

Summary of Queue methods:

        Throws exception	 Returns special value
         -----------------   ---------------------
Insert	    add(e)	               offer(e)
Remove	    remove()	           poll()
Examine	    element()	           peek()

remove():=Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is 
--------
empty.
Returns:the head of this queue
Throws:NoSuchElementException - if this queue is empty.

poll():-Retrieves and removes the head of this queue, or returns null if this queue is empty.
------
Returns:the head of this queue, or null if this queue is empty.
element():-
----------
Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.Returns:the head of this queue
Throws:NoSuchElementException - if this queue is empty

peek():-
--------
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
Returns:the head of this queue, or null if this queue is empty



