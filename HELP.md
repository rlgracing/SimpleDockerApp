### Helm
helm create simple-docker-app
helm install simple-docker-app-release simple-docker-app/
helm upgrade simple-docker-app-release simple-docker-app/
helm upgrade simple-docker-app-release simple-docker-app/ --values simple-docker-app/values.yaml
helm upgrade simple-docker-app-release simple-docker-app/ --values simple-docker-app/values.yaml -f simple-docker-app/values-dev.yaml -n dev
helm ls
helm ls --all-namespaces

### Kubernetes
kubectl apply -f simple-docker-app-k8s-deployment.yaml
kubectl describe services
kubectl get all
kubectl get all -n dev
kubectl get all -n prod
kubectl create namespace dev
kubectl create namespace prod
kubectl port-forward service/simple-docker-app-service 8888:8080 --namespace dev
kubectl port-forward service/simple-docker-app-service 8888:8080 --namespace prod
    http://localhost:8888/

### Minikube
minikube image load simple-docker-app-image
minikube start
minikube dashboard
minikube service simple-docker-app-service --url
    http://localhost:56736/
minikube tunnel
    http://localhost:8080/

### Links
https://www.youtube.com/watch?v=jUYNS90nq8U
https://www.youtube.com/watch?v=0GgBi8yNQT4
