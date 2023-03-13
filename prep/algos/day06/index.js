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
  

    insertAtBackMany(vals) {
      for (const item of vals) {
        this.insertAtBack(item);
      }
      return this;
    }
  

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
//! THURSDAY ////////////
/**
 * Removes the last node of this list.
 * - Time: O(?).
 * - Space: O(?).
 * @returns {any} The data from the node that was removed.
 */
removeBack() {
  // case 1: we have an empty list
  if(this.isEmpty()){
    return null
  }
  // case 2: we have a list with one node
  if(this.head.next === null){
   return this.removeHead();  
  }

  // case 3: more than one node
  let runner = this.head

  while(runner.next.next){
    runner = runner.next
  }
  console.log(runner)
  const returnData = runner.next.data
  runner.next = null
  return returnData;




}

/**
 * Determines whether or not the given search value exists in this list.
 * - Time: O(?).
 * - Space: O(?).
 * @param {any} val The data to search for in the nodes of this list.
 * @returns {boolean}
 */
contains(val) {
  if(this.isEmpty()){
    return false
  }

  let runner = this.head
  while(runner){
    if(runner.data === val){
      return true
    } 
    runner = runner.next
  }
  return false
}

/**
 * Determines whether or not the given search value exists in this list.
 * - Time: O(?).
 * - Space: O(?).
 * @param {any} val The data to search for in the nodes of this list.
 * @param {?ListNode} current The current node during the traversal of this list
 *    or null when the end of the list has been reached.
 * @returns {boolean}
 */
containsRecursive(val, current = this.head) {
  if(current === null){
    return false;
  }
  if(current.data === val){
    return true;
  }
  return this.containsRecursive(val, current.next)
}

//! FRIDAY ///////////////////////

/**
 * Retrieves the data of the second to last node in this list.
 * - Time: O(?).
 * - Space: O(?).
 * @returns {any} The data of the second to last node or null if there is no
 *    second to last node.
 */
secondToLast() {

  if(this.isEmpty()){
    return null
  }

  if(this.head.next === null){
    return null
  }

  let runner = this.head

  while(runner.next.next){
    runner = runner.next
  }
  return runner.data;
}

/**
 * Removes the node that has the matching given val as it's data.
 * - Time: O(?).
 * - Space: O(?).
 * @param {any} val The value to compare to the node's data to find the
 *    node to be removed.
 * @returns {boolean} Indicates if a node was removed or not.
 */
removeVal(val) {
  if(this.isEmpty()){
    return false;
  }

  if(this.head.data === val){
    this.removeHead()
    return true;
  }

  let runner = this.head
  while(runner.next){
    if(runner.next.data === val){
        runner.next = runner.next.next;
        return true;
    }
    runner = runner.next
  }
  return false;
}

// EXTRA
/**
 * Inserts a new node before a node that has the given value as its data.
 * - Time: O(?).
 * - Space: O(?).
 * @param {any} newVal The value to use for the new node that is being added.
 * @param {any} targetVal The value to use to find the node that the newVal
 *    should be inserted in front of.
 * @returns {boolean} To indicate whether the node was pre-pended or not.
 */
prepend(newVal, targetVal) {}

///! MONDAY /////////////

/**
 * Concatenates the nodes of a given list onto the back of this list.
 * - Time: O(?).
 * - Space: O(?).
 * @param {SinglyLinkedList} addList An instance of a different list whose
 *    whose nodes will be added to the back of this list.
 * @returns {SinglyLinkedList} This list with the added nodes.
 */
concat(addList) {
  let runner = this.head

  if(runner === null){
    this.head = addList.head;
  } else {
    while(runner.next){
      runner = runner.next;
    }
    runner.next = addList.head
  }
  return this;
}

/**
 * Finds the node with the smallest data and moves that node to the front of
 * this list.
 * - Time: O(?).
 * - Space: O(?).
 * @returns {SinglyLinkedList} This list.
 */
moveMinToFront() {
  // empty list?
  if(this.isEmpty()){
    return this;
  }

  let minNode = this.head;
  let runner = this.head;
  let prev = this.head;

  while(runner.next){
    if(runner.next.data < minNode.data){
      prev = runner;
      minNode = runner.next;
    }

    runner = runner.next;
  }

  if(minNode === this.head){
    return this;
  }

  prev.next = minNode.next;
  minNode.next = this.head;
  this.head = minNode;
  return this;

}

// EXTRA
/**
 * Splits this list into two lists where the 2nd list starts with the node
 * that has the given value.
 * splitOnVal(5) for the list (1=>3=>5=>2=>4) will change list to (1=>3)
 * and the return value will be a new list containing (5=>2=>4)
 * - Time: O(?).
 * - Space: O(?).
 * @param {any} val The value in the node that the list should be split on.
 * @returns {SinglyLinkedList} The split list containing the nodes that are
 *    no longer in this list.
 */
splitOnVal(val) {}

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
  sll.insertAtBack(4)
  sll.insertAtBack(-1)
  // console.log(sll.removeVal(42))
  sll.moveMinToFront()
  console.log(sll.toArr())