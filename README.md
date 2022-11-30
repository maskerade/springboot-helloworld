# Simple SpringBoot HelloWorld
Uses docker to build the jar file then creates a container with this jar file

Build the jar and container:

`docker build . -t springboot-hello-world`

Run with:

`docker run -p 80:80 springboot-hello-world`
