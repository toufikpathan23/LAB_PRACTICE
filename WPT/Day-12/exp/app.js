//import expresss

const express=require("express")
const app=express();
const path=require("path")
const parser=require("body-parser")
const routes=require("./router/routers")

//add middlewares

app.use(parser.urlencoded({extended:false}))

//configure the application

app.set("views",path.join(__dirname,"views"))
app.set("view engine","ejs")

//add url handlers
app.use("/",routes)

//start the server
app.listen(3002,()=>{
    console.log("application runnung on port 3001")
})