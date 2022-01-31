const http = require("http")
const app = http.createServer((req,res)=>{
    console.log(req)
    res.write("<h1>Request Sent</h1>")
    res.end()

})

app.listen(3000, ()=>{
    console.log("server started at port 3000")
})