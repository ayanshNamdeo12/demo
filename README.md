______________________________________________
Perform all the following tasks ->
______________________________________________
1. Create a REST API Endpoint using spring boot framework.
2. Create a Docker File for the same.
3. Use GitHub for sample application & Push the Code along with Docker File. (Share GitHub public 
repository URL along).
4. Setup a Docker-hub account.
5. Build a Docker Image & push to Docker Hub (Make an Image Public & Share the Image path from 
Docker Hub Repo).
6. Setup a Kubernetes cluster: (You have two options: Choose any one of these)
• For Local use MiniKube
• You can set up a Kubernetes cluster on google cloud as well. (Using GKE – Google 
Kubernetes Engine)
7. Create YAMLs Files 
• Create a Deployment YAML with respect to your Docker Image and Replica Factor
should be 2
• Create a Service YAML with respect to your Deployment










Solution>>
------------------------------------------------------------------------------------------

1) Create Microservice in Eclipse.

• Please set up a Docker on Windows.
o Raise an IT Ticket through Ginger: Install Docker on Window using WSL 
o Quick guide to set-up yourself : Setup Docker in Windows.pdf
• Set up a Kubernetes Cluster (You can choose any of one of them):
a. Please set up minikube to run k8 cluster on local
i. Raise an IT Ticket through Ginger: Install minikube on windows
(https://minikube.sigs.k8s.io/docs/start/)
b. Set up a Kubernetes Cluster on Google Cloud.
i. Create a free account on GCP:
https://cloud.google.com/apigee/docs/hybrid/v1.2/precoggcpaccount#:~:text=Open%20Google%20Cloud%20console%20in,account%
20or%20other%20Google%20account
ii. Set up a Google Kubernetes Engine:
https://www.youtube.com/watch?v=hxpGC19PzwI


2)Installation of docker ,kubernetes and Minikube in our system.
_______________________________________________________________

DOCKER
_______________________________________________________________
3)Create an account in docker Hub and start in wsl to connect terminal with DOCKERHUB Browser.

4) Run The microservice and check his jar file is in running mode or not.

5) Create Docker file for entry point and specify the type of his file like JAR.

6) Push the code into github inside repository.

7)If any updation on microService then after updation tap on maven install then makes updated jar file then you Have to push into github.

8)Then build Docker image with cmd:- [ $ docker build -t {username of dockerhub}/{any name of docker}:{version} .] ; then press enter to buiild your image.

9)Then push it on docker hub :[$ docker push {username of dockerhub}/{any name of docker}:{version} ]

10)After you can pull it on your system just simply login your docker hub account.

11) Then you can run this [$ docker run --name {Create name of docker} -d -p {port you want to display}:{Eclipse port in which application in runnning mode} {username of dockerhub}/{name of docker}:{version}]

--------------------------------------------------------------------------------------------------------------------
ONCE YOUR DOCKER IMAGE CREATED SUCCESFULLY AND RUN PROPERLY ,YOU HAVE TO GO TO NEXT PART OF KUBERNETES>MINIKUBE.
__________

MINIKUBE
__________
---------------------------------------------------------------------------------------------------------------------

12)IF minikube installed in your System you have to opem terminal and type [minikube start]. Ot makes ton enable your vm and create cluster.

    NOTE- IN kubernets you just need to know
    CLUSTOR->
             NODE->
                     POD-> IP ADDRESS , MAKE only 1 container inside it for convenience
                            CONTAINER->
                                         MICROSERVICE 


13)After starting minikube ,pulled the docker image you just created with this cmd- >[minikube image pull ayansh10999/demodockernew:v2]

14) Pulling and fetching all the data ,you have to just create 2 yaml files to config and deploy your service. 
    a-deployemnet.yaml
    b- service.yaml

15)After this checking the nodes -> [>minikube kubectl -- get nodes]

16)check the images->[minikube image ls]

17) Deploy the deployment file ->[minikube kubectl -- apply -f D:\dockker\demo\deployment.yaml]

18) Check the deployments ->[minikube kubectl -- get deployments]

19) After this ->[>minikube kubectl -- logs -f pods/{deployment name}]

20) Apply service into minikube ->[minikube kubectl -- logs -f pods/docker-deployment]

21)Run with default ip ->minikube kubectl -- get svc

D:\dockker\demo>minikube service docker-service
|-----------|----------------|-------------|---------------------------|
| NAMESPACE |      NAME      | TARGET PORT |            URL            |
|-----------|----------------|-------------|---------------------------|
| default   | docker-service |        9595 | http://172.20.17.57:30002 |
|-----------|----------------|-------------|---------------------------|

22) check the ip 
D:\dockker\demo>minikube ip
172.20.17.57

23) Check it on browser

D:\dockker\demo>minikube dashboard
* Verifying dashboard health ...
* Launching proxy ...
* Verifying proxy health ...
* Opening http://127.0.0.1:61168/api/v1/namespaces/kubernetes-dashboard/services/http:kubernetes-dashboard:/proxy/ in your default browser...

24)  - Access pod through the service endpoint only

D:\dockker\demo>minikube kubectl -- get endpoints
NAME             ENDPOINTS                         AGE
docker-service   10.244.0.5:9595,10.244.0.6:9595   6m38s
kubernetes       172.20.17.57:8443                 19m

CHECK IT ON BROWSER -->
-----------------------------------------------------------------------
THANK YOU 
_______________________________________________________________________