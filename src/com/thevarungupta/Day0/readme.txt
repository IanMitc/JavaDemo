# Git

> Git is a distributed version control system or source code mangement system
> Git was designed by same developer who developed Linux kernal
> Git is a free software distributed under GNU license

# Version Control System (VCS)
It is a software that helps software developer to work together and maintain a complete history
of their work

- Allows developer to simultenously
- prevent overwritting each other changes
- maintain a history of every version


# Type of version control system
- Centralized version control system
- Decentralized / Distributed version control system

# Centralized version control system
- it uses a central server to store all of files and folders and enable team to collaration. 
  but the major drawnback of CVCS is its single point of failure. In the case if the central server goes down for an hour 
  during that time no one can collaborate with each other. if that central server gets corruped or broken then you will lose
  the entire history of your project

# Distributed version control system
- we not only checkout the latest snapshot of the directory but we take full mirrar image of the repository
  if the server goes down the the respository from any client machine can be copied back to the server


Git does not really on any central server as it may perform many operation when you are offline
you can commit, add, create branches, view logs and perform all other operations even when you are offline and we need network
connection only to publish your changes


# Git vs GitHub
- Git - it is actually version control system
- GitHub - it is cloud service provider


# Advantages of Git
1. Free and open source
It is available freely over the internet which means youn can download and start using git for free to manage your 
project code

2. Fast
As most of the operation perform locally it is huge benefit in terms of speed
the cor part of git is written in C langugage which avoid any runtime overheads associated with other
high level langugage

3. Implicit backup
the chances of loosing data are very rare when you have multiple copies of it. Data present on any disk 
can be use for restoration purpose

4. security
Git uses a common cryptographic hash function called SHA1 to name and ideity object


5. No powerfull hardware
in case of cenralize version the central server need to be powerfull enough to serve request of the entire team
in case of distributed verdion control developers dont interact with the server unless they need to push or pull changes

6. Branches
it is very easy to create  branch in distributed version control system


# Git basic command

- untracked file
- staged file
- tracked file


> git --version

> git config --list
> git config --global user.name
> git config --global user.email		-get
> git config --global user.name "new_name"	-set
> git config --global user.email "new_email"

> git init
> git status
> git add <file_name>
> git add .                           // all files
> git rm --cache <file_name>
> git commit -m "<commit message>"

> git remote -v
> git remote add origin "github_url"

> git push origin master

> git clone <git_url>




> new folder 
> git init
> add files
> git add .
> git commit
> git remote add origin <github_url>
> git push origin master



























