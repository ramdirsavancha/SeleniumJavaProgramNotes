Map:
----

Def:-Map is an interface which store elements in key  & value pair,wich implements of Hashtable. 
(If we want to represent  group objects as key value pair then we want to use Map)

**Duplicate key are not allowed.Duplicate values are allowed and one null key alloweed.
**Each key and value pair is called an Entry.

In map we are having three types of collection views .
1.KeySet()--will get the all keys return type is Set
2.values()--will give all values  return type is collection (because duplicates may present in values)
3.entreSet()--will give entry set K,V return type is Set.

Some important methods:
-----------------------
1. put(K key,
      V value)
Associates the specified value with the specified key in this map (optional operation). If the map previously contained a mapping for the key, the old value is replaced by the specified value. (A map m is said to contain a mapping for a key k if and only if m.containsKey(k) would return true.)

Map<Integer,String> mp=new HashMap<>();

mp.put(1,"Tom");//  1,"John";
mp.put(2,"George");
mp.put(1,"John");// No compilation error

1st and 3rd key is duplicate in these case the 3rd value will be replace with the first value.
  

2.	isEmpty()
Returns true if this map contains no key-value mappings.
3.keySet()
Returns a Set view of the keys contained in this map.
4.get(Object key)
Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.


Comparable:
-----------
Def:Comparable is an interface,a class which implements Comparable will provides the elements in natural order(Ascending order) by using compareTo() method.
**Objects that implement this interface can be used as keys in a sorted map or as elements in a sorted set, without the need to specify a comparator.
Points to be remember:
----------------------
**When we required to do natural sorting then we need to use comparable.
**Comparable consists of only one method compareTo().
*We can perform sorting by using a single field.





Comparator:
-----------
Def:Comparator is an interface

Points to remember :-
--------------------
**We can perform sorting by using multiple fields.