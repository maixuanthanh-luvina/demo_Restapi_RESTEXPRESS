demo_Restapi_RESTEXPRESS
========================
Demo create echo webservice at localhost:8888/echo  
Usage:  
  - mvn install  
  - mvn exec:java  
  - Then you can use curl tool to send requests
  - curl -X [PUT|POST|DELETE] localhost:8888/echo  
  - curl -X GET localhost:8888/echo/1/leminhquan means {id=1, name=leminhquan} parameter for get request
