
const sql=require("mysql")

var sqlConnection=sql.createConnection(
{
    host:'127.0.0.1',
    user:'root',
    password:'root123',
    database:'test',
    port:3306
})

sqlConnection.connect((err)=>{
    if(err)
    {
        console.log("connection failed"+JSON.stringify(err))
    }
    else
    {
        console.log("Connected successfuly")
    }
})

module.exports=sqlConnection;