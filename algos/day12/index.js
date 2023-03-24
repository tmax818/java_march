//! BIG O 

// sum all numbers btwn 1 and n 
// ans 5050 if n = 100

// fast = time complexity O(n)
// memory = space complexity


function sum1(n){
    let sum = 0;
    for(let i = 1; i <= n; i++){
        sum += i;
    }
    console.log(sum)
    return sum;
}

function sum2(n){
    console.log(0.5*n*(n+1))
}
//O(1)

/// O(n^2)

let start = performance.now()
sum1(100);
let end = performance.now()
console.log(end - start)

start = performance.now()
sum2(100)
end = performance.now()
console.log(end - start)

let arr = [34, 6, 234, 78, 90, 23, 56]

function bblSort(arr){
    
    for(var i = 0; i < arr.length; i++){
       
      // Last i elements are already in place 
      for(var j = 0; j < ( arr.length - i -1 ); j++){
         
        // Checking if the item at present iteration
        // is greater than the next iteration
        if(arr[j] > arr[j+1]){
           
          // If the condition is true then swap them
          var temp = arr[j]
          arr[j] = arr[j + 1]
          arr[j+1] = temp
        }
      }
    }
    // Print the sorted array
    console.log(arr);
   }