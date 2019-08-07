'use strict';
    const Eureka = require('eureka-js-client').Eureka;
    const client = new Eureka({
    instance: {
        instanceId: 'my node client',
        app: 'nodejs',
        hostName: 'localhost',
        ipAddr: 'localhost',
        status: 'UP',
        port: {
          '$': 8081,
          '@enabled': 'true',
        },
      vipAddress: 'nodejs',
      statusPageUrl: 'http://localhost:8081/',
      dataCenterInfo: {
        '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
        name: 'MyOwn',
        },
      },
    
    eureka: {
        host: '127.0.0.1',
        port: 8090,
        servicePath: '/eureka/apps/'
      }    
    })

function connectToEureka() {
    client.start(function(error) {
        console.log(JSON.stringify(error) || 'Eureka registration complete');
   });
}
    connectToEureka();
