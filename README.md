# Dynamically create sublists. 
Dynamically create sub lists from one single list.

It has three versions:
- Break List using LinkedList
- Break List using ArrayList with an initial capacity.
- Break List using subList method.

 BreakOffTwo.java is the best and fastest where it uses ArrayList with an initial capacity. Linked List is probably slow because no initial capacity is given. And get operation is slow on LinkedList. Intuitively, subList way (BreakOffThree.java) was supposed to be fastest, but it is not.

It has extensive tests to test the returned lists to make sure no element is left off by mistake. 

It also has performance tests to test the performance of all 3 versions. 
