var express = require('express');
var app = express();
var fs = require("fs");

app.get('/test/node', function (req, res) {
   
      res.end( "Success from node api" );
   });


var server = app.listen(8081, function () {
   var port = server.address().port
   console.log("listening to:",port)
});
