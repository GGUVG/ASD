//加载express模块
var express = require('express');
var app = express();

app.use('/welfare', express.static('welfare'));

var server = app.listen(9092);