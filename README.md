# api-gateway-app

### 1. eureka-server


#####Configure eureka server
    **create new spring boot project add below dependencies**
        Eureka discovery server
        Spring web starter
        spring cloud
        
    **Configure application.properties as below:**
        spring.application.name=eureka-demo
        eureka.client.serviceUrl.defaultZone:http://localhost:8090/eureka/
        server.port=8090
        eureka.client.register-with-eureka=false
        eureka.client.fetch-registry=false
        
    **Annotate Server App with below Annotation:**
        @EnableEurekaServer
        @SpringBootApplication
        public class EurekademoApplication {
        	public static void main(String[] args) {
        		SpringApplication.run(EurekademoApplication.class, args);
        	}
        }

##### Run eureka server
  ``` mvn spring-boot:run```

### 2. eureka-client-student
	
###### Configure eureka client
    **create new spring boot project add below dependencies**
        Eureka discovery client
        Spring web starter
        
    **Configure application.properties as below:**
        server.port=8180
        spring.application.name = studentDemo
        eureka.client.serviceUrl.defaultZone = http://localhost:8090/eureka
        
    **Annotate Client App with below Annotation:**
        @EnableDiscoveryClient
        @SpringBootApplication
        public class EurekaClientStudentApplication {
        	public static void main(String[] args) {
        		SpringApplication.run(EurekaClientStudentApplication.class, args);
        	}
        }
##### Run eureka client
  ``` mvn spring-boot:run```

### 3. Eureka-node-client
    **install node**
        sudo apt-get install nodejs

    **eureka-js-client**
        npm install eureka-js-client --save

#### Run application
 **run node api:**
 
  ``` node node_api.js```
  
  ``` node node_api_test.js```

### 4. Zuul-API-Gateway

###### Configure zuul server
    **create new spring boot project add below dependencies**
        Eureka discovery server
        Spring web starter
        spring cloud
        zuul
        Eureka discovery client
        
    **Configure application.properties as below:**
        spring.application.name=netflix-zuul-api-gateway
        server.port=8190
        eureka.client.serviceUrl.defaultZone=http://localhost:8090/eureka
        eureka.instance.preferIpAddress=true
        eureka.client.registerWithEureka=true
        eureka.client.fetchRegistry=true
        ribbon.ReadTimeout=60000
        
    **Annotate Server App with below Annotation:**
        @EnableZuulProxy
        @EnableDiscoveryClient
        @SpringBootApplication
        public class NetflixZuulApiGatewayApplication {
        	public static void main(String[] args) {
        		SpringApplication.run(NetflixZuulApiGatewayApplication.class, args);
        	}
        }

##### Run API Gateway
  ``` mvn spring-boot:run```

####Access Eureka clients using API Gateway   
``` 
Eureka Server URL: http://localhost:8090/
Eureka Node client URL: http://localhost:8190/nodejs/test/node
Eureka Java client URL : http://localhost:8190/studentdemo/student/getStudentDetails
```


