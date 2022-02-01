const fs=require("fs")
const path=require("path")
const filepath=path.join("./Day2","sample.txt")
console.log(filepath)
const data=fs.readFileSync("./sample.txt",'utf-8')
console.log(data)
fs.writeFileSync("./sample.txt","new content")
const data2=fs.readFileSync("./sample.txt",'utf-8')
console.log(data2)

//File Reading with Error Handling

// const fs=require("fs")
// fs.readFile('./data/sample.txt','utf-8',(err,data)=>{
// if(err){
//     console.log(err)
// }
// setTimeout(()=>console.log(data),2000)
// })
// fs.readFile('./data/sample2.txt','utf-8',(err,data)=>{
//     if(err){
//         console.log(err)
//     }
//     console.log(data)
//     })