# Read me

The original idea is from  
https://medium.com/@prateek17/goodbye-dockerfiles-hello-buildpacks-transform-your-container-workflow-3505d7fbfa03

./mvnw clean spring-boot:build-image

docker run -d -p 8080:8080 my-app:0.1.0
or
kubectl apply -f .\deployment.yaml
kubectl delete -f deployment.yaml

Go to
http://localhost:8080/actuator


