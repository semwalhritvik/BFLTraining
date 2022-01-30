const add = (a,b) => {
    return a+b
}

console.log(add(23,43))

console.log("test")

const a=12.23
let b=`String ${a}`//value of a
let prno="23" //String prno
prno= Number(prno) //Number prno
console.log(prno)
console.log(b)

const res=String(a)
console.log(res)

console.log(typeof String(a))

let arr=[20,30,"output",true]// List can have anything
console.log(arr[0])

//JSON object
let JSONobj=[
    {
        prname:"XYZ",
        prprice:20,
        license:"license MIT"
    },
    {
        prname:"abc",
        prprice:21,
        license:"The Unilicense"
    },
    {
        prname:"JKL",
        prprice:22,
        license:"license MIT"
    }
    ]
    console.log(" ")
// using object transform functions: map, transform, find, filter

//map allows to perform some function for each item in the list
JSONobj.map((item)=>{
    if (item.license == "The Unilicense"){
        console.log(item.prname)
    }
})
console.log(" ")
//find produces first object that satisfies condition
let fin = JSONobj.find(item=>item.license.includes("MIT"))
console.log(fin)

console.log(" ")
//filter provides all objects that fit the condition
let filt = JSONobj.filter(item => item.license.includes("MIT"))
console.log(filt)
