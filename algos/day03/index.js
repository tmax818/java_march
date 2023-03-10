/**
 * A class to represents a single item of a SinglyLinkedList that can be
 * linked to other Node instances to form a list of linked nodes.
 */
class ListNode {

    constructor(data) {
      this.data = data;
      this.next = null;
    }
  }
  

  class SinglyLinkedList {

    constructor() {
      this.head = null;
    }
  
    isEmpty() {
      return this.head === null;
    }
  

    insertAtBack(data) {
      const newBack = new ListNode(data)

      // the list is empty
      if(this.isEmpty()){
        this.head = newBack
        return this;
      }

      // the list is not empty
      let runner = this.head

      while(runner.next !== null){
        runner = runner.next

      }
      runner.next = newBack
      return this

    }
  
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {any} data The data to be added to the new node.
     * @param {?ListNode} runner The current node during the traversal of this list
     *    or null when the end of the list has been reached.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBackRecursive(data, runner = this.head) {
      if(this.isEmpty()){
        this.head = new ListNode(data)
        return this
      }

      if(runner.next === null){
        runner.next = new ListNode(data)
        return this
      }
      return this.insertAtBackRecursive(data, runner.next);
    }
  
    /**
     * Calls insertAtBack on each item of the given array.
     * - Time: O(n * m) n = list length, m = arr.length.
     * - Space: O(1) constant.
     * @param {Array<any>} vals The data for each new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBackMany(vals) {
      for (const item of vals) {
        this.insertAtBack(item);
      }
      return this;
    }
  
    /**
     * Converts this list into an array containing the data of each node.
     * - Time: O(n) linear.
     * - Space: O(n).
     * @returns {Array<any>} An array of each node's data.
     */
    toArr() {
      const arr = [];
      let runner = this.head;
  
      while (runner) {
        arr.push(runner.data);
        runner = runner.next;
      }
      return arr;
    }
//! WEDNESDAY ////////////
    /**
 * Creates a new node with the given data and inserts that node at the front
 * of this list.
 * - Time: (?).
 * - Space: (?).
 * @param {any} data The data for the new node.
 * @returns {SinglyLinkedList} This list.
 */
insertAtFront(data) {
  const newHead = new ListNode(data)
  newHead.next = this.head
  this.head = newHead
  return this


}

/**
 * Removes the first node of this list.
 * - Time: (?).
 * - Space: (?).
 * @returns {any} The data from the removed node.
 */
removeHead() {
  if(this.isEmpty()){
    return null
  }
  let thedata = this.head.data
  this.head = this.head.next
  return thedata
  

}


// EXTRA
/**
 * Calculates the average of this list.
 * - Time: (?).
 * - Space: (?).
 * @returns {number|NaN} The average of the node's data.
 */
average() {
  let runner = this.head
  let sum = 0;
  let count = 0;

  while(runner){
    count++;
    sum += runner.data;
    runner = runner.next;
  }
  let avg = sum/count
  if( count === 0){
    return "empty list"
  } else {
    return avg;
  }
}


  }
  
  /******************************************************************* 
  Multiple test lists already constructed to test your methods on.
  Below commented code depends on insertAtBack method to be completed,
  after completing it, uncomment the code.
  */
  const emptyList = new SinglyLinkedList();
  
  // const singleNodeList = new SinglyLinkedList().insertAtBackMany([1]);
  // const biNodeList = new SinglyLinkedList().insertAtBackMany([1, 2]);
  // const firstThreeList = new SinglyLinkedList().insertAtBackMany([1, 2, 3]);
  // const secondThreeList = new SinglyLinkedList().insertAtBackMany([4, 5, 6]);
  // const unorderedList = new SinglyLinkedList().insertAtBackMany([
  //   -5, -10, 4, -3, 6, 1, -7, -2,
  // ]);
  
  /* node 4 connects to node 1, back to head */
  // const perfectLoopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
  // perfectLoopList.head.next.next.next = perfectLoopList.head;
  
  /* node 4 connects to node 2 */
  // const loopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
  // loopList.head.next.next.next = loopList.head.next;
  
  // const sortedDupeList = new SinglyLinkedList().insertAtBackMany([
  //   1, 1, 1, 2, 3, 3, 4, 5, 5,
  // ]);
  
  // Print your list like so:
  // console.log(firstThreeList.toArr());

  const sll = new SinglyLinkedList()
  sll.insertAtBack(1)
  sll.insertAtBack(2)
  sll.insertAtBack(3)
  // console.log(sll.removeHead())
  console.log(sll.average())
  console.log(sll.toArr())