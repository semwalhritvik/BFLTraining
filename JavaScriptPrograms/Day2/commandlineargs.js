const yargs = require("yargs")
const loadsh = require("lodash")

const argv=yargs.argv
const command=argv._[0]
const title=argv._[1]
const date=argv._[2]
console.log(command,title,date)
if(command==="add"){
    const add = (title,data) => {return title + data}
    console.log(add("thistitle", "thisdate"))
}