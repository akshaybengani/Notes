# Git Basics what is Git 

## Local Git
Distributed so that connectivity dosent block work.

Basically Git is more popular because it provides version control straight to the local system it dosent need any server to maintain a version control and check of every system.

Easy so that learning its commands can happen progressively.

Even if we need to collaborate with other employees it is easy to get started with them.

## Developer Dana
$ git init myproject
This will create a directory with the version control system files and control files which will track down the files of the project.

$ cd myproject  
This is the project directory where we can put documents images or anything you want.

$ git add .  
This is use to add your project files to the git version control system.

$ git commit -m "Importing all the code"  
This is basically permanently record the files and there time of commitment.

This is the simple version of git as it measures and maintain version control of the file. but actually the case is when we use Collaborative Git.

This is the problem when multiple users are working on the different machines working with same project and even working on the same file.

Git is designed up for Team-centric so that collaboration happens naturally.

## Collaborative History Tracking
<img src="images/1.png" width=auto height=auto>
People work in sequenial fasion and they all are running to work on thier different times and duration
Reality is people are working on same time on same file.
<img src="images/2.png" width=auto height=auto>
It is just overlapping the work and making multiple files by multiple users add more complexity.

## Lets have an example  
Akshay and Shivank are both working on a same project or on the same file.

$ git checkout master  
Akshay uses master branch

$ git commit -m "My new logo"  
Akshay added his work to the server

$ git push  
Akshay Submitted the work to the master branch

Now it comes to Shivank Part  

$ git checkout -b shivankfeature  
Shivank is working on different branch

$ git commit -m "My feature code"  
Now added his work to the new branch

$ git push origin shivankfeature  
Shivank submitted his work to his another branch

$ git pull  
Now the main part we need to merge the code so Shivank just pulled out the master branch code from the server now it is time to merge and it can be easily done by.  
$ git merge shivankfeature  
This will merge all the data and if there are conflicts in both of the users file it will guide you all around the changes made by Akshay and Shivank and what changes to apply.

## Advanced Git

Git is very capable and customizable to advance users.  
Git is Flexible so that it fits your need insteed to the other way around.  
It is powerful to satisfy the scripting needs of the advanced developers.  

$ git add -p MyReport.markdown  
This will add a small part of your code.

$ git commit -m "Added latest Statistics"  
Commit the code to mark down with the server 

$ git log --graph --decorate --abbrev-commit --all --pretty=oneline  
Basically over here you can also add some peice of your code and then commit it and check what other people have done using the log section wven in the terminal.
 








