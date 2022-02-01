const os = require("os")
const fs = require("fs")
// 1. write the os specs to a file using sync 
fs.writeFileSync("./OSspecs.txt", os.type().toString() +"\n" +os.release().toString())

// 2. write diff types of data to a file and read it
let a =2
const user = {
    name: "Nathan",
    age: 28,
    role: "Web developer",
  };
let userData = JSON.stringify(user)
fs.writeFileSync("./AFile.txt", "String Data" +"\n"+ a.toString()+"\n" + userData)

// 3. merge two files with sync Write 
fs.writeFileSync("./Merged.txt", fs.readFileSync("./OSspecs.txt") + "\n" + fs.readFileSync("./AFile.txt"))




