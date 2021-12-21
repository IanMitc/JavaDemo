# Docker Commands

> docker --version
> docker --help

# Docker image
- use pull command to clone / download image form docker hub
> docker pull <image_name>
> docker pull alpine
> docker pull alpine:latest
> docker pull alpine:3.12

# docker images
> docker images   // get list of images on local machine
> docker pull <image_name>
> docker image rm <image_name/image_id>

# docker containers
> docker container ls   // list of container
> docker ps   // list of running container
> docker ps -a  // list of all container
> docker start <image_id / image_name>
> docker stop <image_id / image_name>
> docker rm <image_id / image_name>