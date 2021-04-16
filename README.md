# cse199-sp21-Zhiyuan-Zhang Silver Level Solutions


## Dance Mooves - 2021 Jan USACO
### Description
   This problem is to keep track of all possible positions that each cow can reach after cycles of swaps and print out the number of positions that each cow has been to.

### Challenges:
1. **Understand the problem**


   The cows go into cycles and cycles of swaps, and you need to have a sense of after how long the cows will go back to its original position.
   Or you can keep track of each cow individually, which requires a fewer data structures.
2. **Data Structures**

    If you are keeping track of all cows at one time, then you will need data structures like ArrayLists and HashSet.
    
    If you choose to keep track of the cows, you will need only arrays (and HashSet, which can make the process a
    lot easier).


## No Time to Paint - 2021 Jan USACO
### Description
This problem is trying find the minimum of steps to brush the fence where you can brush a stroke as long as possible, and can only cover the lighter colors with darker ones.

### Challenges:
   1. **Understand the problem**

       It is pretty simple problem overall.
   2. **Data Structure**

      The simplest way to solve this problem is to utilize the data structure Stack, in which you push a color if it
      is darker than the previous color, pop it if it is lighter until the color on top of the stack is lighter or the
      stack is empty then push it onto the stack. (If the color on top of the stack is the same, then do not push.) Keep
      track of all the number of pushes which is the result to this problem.
      
      
      
## Spaced Out - 2021 Jan USACO
### Description
This problem is about find the biggest sum such that in each 2x2 box, there are only two numbers and the sum of all the numbers is the greatest.

### Challenges:
   1. **Understand the problem**
         
       It is quite tricky to figure out how the grid works, but once you figure it out, it is a pretty simple problem.
       
   2. **Math functions**
   
       Familiar with math related functions and type of the variables based on the size.
   
   3. **Brute Force**
