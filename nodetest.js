var http = require('http');
var fs = require('fs');
var rs = fs.createReadStream('./guitest.html');
var dt = require('./nodemodule');

rs.on('open', function() {

    console.log('fajl otvoren');
});

http.createServer(function (req, res) {

    fs.readFile('guitest.html', function(err, data) {
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write(data);
        return res.end();
    });

  }).listen(8080);
