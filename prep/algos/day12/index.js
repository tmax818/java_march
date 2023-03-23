

// sum all numbers btwn 1 and n 
// ans 5050 if n = 100

function sum1(n){
    let sum = 0;
    for(let i = 1; i <= n; i++){
        sum += i;
    }
    console.log(sum)
}

function sum2(n){
    console.log(0.5*n*(n + 1))
}


let start = performance.now()
sum1(100)
let end = performance.now()
console.log(end - start)


start = performance.now()
sum2(100)
end = performance.now()
console.log(end - start)
