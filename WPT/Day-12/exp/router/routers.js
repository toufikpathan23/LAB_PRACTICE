const express=require("express");
const router=express.Router();
const connection=require("../db/dbconnection");

router.get("/products",(req,res)=>{
    
    connection.query("select * from products",(err,data,fields)=>{
        if(err)
        {
            res.status(404).send("Error occureed"+JSON.stringify(err));
        }else{

            res.render("products",{pdata:data});
        }
    })


})

router.post("/addproduct",(req,res)=>{

    var pid=req.body.id;
    var pname=req.body.name;
    var pc=req.body.pc;
    connection.query("insert into products values(?,?,?)",[pid,pname,pc],(err,result)=>{
        if(err){
            res.status(404).send("Error occurred"+JSON.stringify(err));
        }else{
           res.redirect("/products");
        }
    })
})

router.get("/addformproduct",(req,res)=>{

     res.render("add-prod");
})


module.exports=router;