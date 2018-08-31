# The Basics of Git and Github

Git was developed by Linux Tols. during the internet era.  
Git was built by very small peices of code in a very composable form and some of the peices of code are open to your system too so just by creating some small bash scripts you can even create your own custom results in Git.  

## Questions
Why Git?  
Setting up Git  
Using Git  
Using Github  

## Setting up Git
Its very easy you can even put binaries in the $ path and thats it no registies nothing to worry.  

Installation screenshots  
http://www.help.github.com  

Just follow the installer and screenshots and now lets get started.  

$ git -version  
This returns the Git version  

## Using Git
Git is a command line tool and it also provides GUI for the IDE but I recommend to use CLI only because this is the actual way you design things.  

### Create a Git repository  
Setup the Github Users in the command lines  

$ git config --global user.name "Akshay Bengani"  
This will be used to setup the local system name it is important to setup but not important to be a genuine one.  

$ git config --global user.email "akshaybengani@gmail.com"  
This email will actually be used to give credits of your work since if you are having your github account you can use your github email address therefore it will automatically identify the identity and give credits to you.  

$ git init project1  
This creates a new project  

$ cd project1  
This is to enter into the project directory  

.git is a folder which contains all the git control files of the project and maintains records of all other files in the directory.  
Make sure not to create any other folder in the whole directory named as .git thats it.  

$ git status  
This shows that the git tracks the content status whenever we make changes in the project the status responds to the changes. Git tracks content.  

$ git add file.txt  
It is a suggestion to have this file participate in the git system it is not saying that it is permanently being controlled.  

$ git commit -m "My first commit"  
This is to commit or prepare a historical event using git system.  

$ git remote add origin http://github.com/akshaybengani/Notes.git  
Now in order to get connected with the server/Github just go to github.com and create a new repository same name as the project name and then set the remote of the repository.  

$ git push  
It simply syncronizes the repository with the project.  

Now lets come to the intresting part  
when we need to start contributing to someone else project just follow the steps.  
1 Fork the project repo from the client account.  
2 Now the project have same copy in your github account.  
3 Now just clone your project by using "git clone <URL>"  

$ git clone <URL>  
This will clone your github repository in your local system  

$ git branch -a  
This will display that how many branches are setup in this project.  

$ git branch novclassfeature  
Now a new branch is created in the project.  

$ git checkout novclassfeature  
This will switch the entire content of my local repository to the new branch.  

Note: When you modified anything in one branch it will be only in the branch, as such when we checkout the other branch or master branch   

## References
Twitter : @githubtraining  
Email   : training@github.com  
Website : training.github.com  
Github  : githubtraining  

## Instructors

### Mathew
Open source contributor  
5 years git trainer  
Instructor at Github  

### Brent
Involved with Git for over 4 years  
Git trainer at github  



