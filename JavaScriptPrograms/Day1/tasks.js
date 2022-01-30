// Write a function filterRange(arr, a, b) that gets an array arr, looks for elements with
// values higher or equal to a and lower or equal to b and return a result as an array.
// The function should not modify the array. It should return the new array.
// For instance:
// let arr = [5, 3, 8, 1];
// let filtered = filterRange(arr, 1, 4);
// alert( filtered ); // 3,1 (matching values)
// alert( arr ); // 5,3,8,1 (not modified)
function filterRange(arr,a,b){
    let res = []
    let lower = a
    let upper = b
    arr.map((i)=>{
        if(i>=lower && i<=upper){
            res.push(i)
        }
    })
    return res
}
let arrr = [5,3,8,1]
console.log(filterRange(arrr,1,4))
console.log(arrr)

// 3. Let arr be an array.
// Create a function unique_elements(arr) that should return an array with unique items
// of arr.
// For instance:
function unique_elements(arr) {
    let unique = [] 
    arr.map((i)=>{if(!unique.includes(i)){
        unique.push(i)
    }})
 return unique
}
let strings = ["React Js", "JavaScript", "React Js", "JavaScript",
 "JavaScript", "JavaScript", "React Js", "React Js"];
console.log( unique_elements(strings) ); // React Js, JavaScript

// 4.Create a function truncate(str, maxlength) that checks the length of the str and, if it
// exceeds maxlength – replaces the end of str with the ellipsis character "…", to make its
// length equal to maxlength.
// The result of the function should be the truncated (if needed) string.
// For instance:
// truncate("What I'd like to tell on this topic is:", 20) = "What I'd like to te…"
// truncate("Hi everyone!", 20) = "Hi everyone!"
function truncate(str, maxlength){
    if(str.length > maxlength){
        str = str.slice(0,maxlength-1)
        return str + "..."
    }
}
console.log(truncate("What I'd like to tell on this topic is:", 20))

// 5. We have a cost in the form "$120". That is: the dollar sign goes first, and then the
// number.
// Create a function extractCurrencyValue(str) that would extract the numeric value from such
// string and return it.
// The example:
// alert( extractCurrencyValue('$120') === 120 ); // true
function extractCurrencyValue(str){
    str = str.slice(1,str.length)
    let num = Number(str)
    return num
}
console.log( extractCurrencyValue('$120') === 120 )