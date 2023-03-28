/**
 * Class to represent a stack using an array to store the stacked items.
 * Follows a LIFO (Last In First Out) order where new items are stacked on
 * top (back of array) and removed items are removed from the top / back.
 */
class Stack {
    /**
     * The constructor is executed when instantiating a new Stack() to construct
     * a new instance.
     * @returns {Stack} This new Stack instance is returned without having to
     *    explicitly write 'return' (implicit return).
     */
    constructor() {
      this.items = [];
    }
  
    /**
     * Adds a new given item to the top / back of this stack.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @param {any} item The new item to be added to the top / back.
     * @returns {number} The new length of this stack.
     */
    push(item) {
      this.items.push(item);
      return this.size();
    }
  
    /**
     * Removes the top / last item from this stack.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {any} The removed item or undefined if this stack was empty.
     */
    pop() {
      return this.items.pop()
    }
  
    /**
     * Retrieves the top / last item from this stack without removing it.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {any} The top / last item of this stack.
     */
    peek() {
      return this.items[this.items.length - 1]
    }
  
    /**
     * Returns whether or not this stack is empty.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {boolean}
     */
    isEmpty() {
      return this.items.length === 0;
    }
  
    /**
     * Returns the size of this stack.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {number} The length.
     */
    size() {
      return this.items.length;
    }
  }
  
  class StackNode {
    constructor(data) {
      this.data = data;
      this.next = null;
    }
  }
  
  class LinkedListStack {
    constructor() {
      this.head = null;
    }

    push(val){
      const newNode = new StackNode(val)

      if(this.isEmpty()){
        this.head = newNode
      } else {

        let runner = this.head
        while(runner.next){
          runner = runner.next
        }
        console.log(runner.data)
        runner.next = newNode
      }
    }
    


    pop(){
      if(this.isEmpty()){
        return null;
      } else {
        var runner = this.head
        var prev = this.head
        while(runner.next){
          
          runner = runner.next
        }
        var value = runner.data
      }
      runner = null
      return value
    }


    peek(){
      if(this.isEmpty()){
        return null;
      }

      let runner = this.head
      while(runner.next){
        runner = runner.next
      }
      return runner.data
    }


    isEmpty(){
      return this.head === null;
    }


    size(){}
  }


const ourStack = new LinkedListStack();

ourStack.push(12)
ourStack.push(23)
ourStack.push(42)
ourStack.push(56)
console.log(ourStack.pop())
console.log(ourStack.peek())






// console.log(ourStack.isEmpty());
// ourStack.push(1);
// ourStack.push(2);
// ourStack.push(3);
// ourStack.push(4);
// console.log(ourStack.peek());
// console.log(ourStack.isEmpty());
