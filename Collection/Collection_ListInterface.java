What is a collection?
In java collection is an interface which represents(used to store) group of objects also called elements.
(or)
*In java Collection is an interface which extends from an Iterable interface.
*The Collection is having the sub-interfaces like Set,List,Queue,Deque,NavigableSet,SortedSet etc.,

points to be remember:
---------------------
*Collection are resizable/growable/dynamic memory allocation.
*Collection can store homogenous and hetrogenous elements.

What is a collections?
In Java collections is a class which consists of static methods that to operate on return collections.




*************
   List:-
************
*List is an sub-interface of collection, which allows duplicate elements and the elements will be in sequential order(inserting order).
*List interface having the implementation classes like ArrayList,LinkedList,Stack,Vector etc.,
*List is an index based(similar to an array).
*List will increase capacity once it reaches the maximum size.
  eg: default initil capacity=10 when we insert 11 th value then it will doubles the capacity.

ArrayList:-
-----------
Def:ArrayList is an implementation class of an List interface and RandomAcess,Cloneable,Serializable interfaces.
(will discuss after ArrayList briefly about RandomAcess,cloneable,Serializable interfaces)

Points to remember:
------------------
*ArrayList allows duplicates and the elements are in insertion order.
*ArrayList allows more than one null value.
*ArrayList is UnSynchronized.
*ArrayList can retrive elements quite faster through its index because it implements RandomAccess interface.
*ArrayList can retrive any element presented at constant time.
  (eg:-  0-1000 elements are there if we want to get 1st element it takes same time and 1000 element also it takes the same time.)
*ArrayList is slow on inserting and deletion operations. 
  (Eg:Because, consider having 10 elements in an ArrayList with 0-9 indexes if we want to inserting an element at 5th index again the old value in 5th index should move to 6th index and 6th index value wants to move for next index and so on.... this operation will consume more time same as to delete operation also) 
*In ArrayList add operation runs in amortized constant time, that is adding n elements requires O(n) time.The size, isEmpty, get, set, iterator, and listIterator operations run in constant time.
* By default the arraylist creates the initial capacity as 10 
   
 constant amoratized time:
      ---------------------------------------

     This means that in the long term, the total time taken for adding m items to the array is O(m) , and so the amortised time (i.e. time per insertion) is O(1) . It means that over time, the worst case scenario will default to O(1), or constant time. A common example is the dynamic array.
*The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. All of the other operations run in linear time (roughly speaking).
*In ArrayList the constant factor is low compared to that for the LinkedList implementation.

java.util.RandomAccess:-
------------------------
Def:-RandomAccess is an Marker interface(An interface without methods) used by List implementation to indicate that they support fast       (generally constant time) random access. 

java.lang.Cloneable:-
---------------------
Def:-Cloneable is an Marker interface(An interface without methods) .A class implements the Cloneable interface to indicate to the Object.clone() method that it is legal for that method to make a field-for-field copy of instances of that class.
 *This interface create a copy from it original object where we can perform operations on a copy of object.
 
 
java.io.Serializable:-
--------------------

Object Serialization is a process used to convert the state of an object into a byte stream, which can be persisted into disk/file or sent over the network to any other running Java virtual machine. The reverse process of creating an object from the byte stream is called deserialization. The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform.


LinkedList:-
------------
Def:-LinkedList is an implementation class of an List and deque interfaces as well Cloneable and serializable  interfaces.
   LinkedList is performimg operations from Doubly-LinkedList and deque.
   
Doubly-LinkedList:
Double linked list is a sequence of elements in which every element has links to its previous element and next element in the sequence.

  

Points to be remember:-
----------------------

*LinkedList allows duplicates and the elements are in insertion order.
*LinkedList allows more than one null value.
*LinkedList is UnSynchronized.
*Quite fast in insert and deletion operation at constant time.
*Slow at retreving an element.Because it used to   check from starting node followed by its link.
*Operations that index into the list will traverse the list from the beginning or the end, whichever is closer to the specified index
*Any operation will starts from the f=first node call head(del,insert,retrive);
*Elements will not store in continous memory as arrays.
* Linked list creates an empty capacity at initial.



Vector:-
--------
Def:-A Vector is a  class which implements from List and RandomAccess,Cloneable,Serializable interface.

Vector is almost identical to ArrayList, and the difference is that Vector is synchronized. Because of this, it has an overhead than ArrayList. Normally, most Java programmers use ArrayList instead of Vector because they can synchronize explicitly by themselves.  

Points to be remember:-
----------------------
*Vector is Synchronized.
Stack:
--------
Def:
 A stack is a class which exteds the vector class.

*The Stack class represents a last-in-first-out (LIFO) stack of objects.