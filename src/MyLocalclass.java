public class MyLocalclass {
       /* Create a new branch : git branch ahmet
    Check the branches: git branch -> you should see ahmet branch
    Switch to the feature branch : git checkout ahmet
    Now I’m on the feature branch. All changes I make will be only on this branch
    Create a new class and write some code on this branch
            MyLocalClass1
    Create a new version on the branch
    git add .
    git commit -m “my local commit 1"
    git push --->>> NOTE : Gives error. First push must be done using below code
    git push --set-upstream origin ahmet
    Check if your codes are in remote repository
    Question 1: Does ahmet branch have the codes we just pushed? YESSSSSSS
    VII.Question 2: Does master have the codes we just pushed? NOOOOO. WE HAVE TO MERGE ALL CODES TO MASTER.NEXT SLIDE
*/

    public static void main(String[] args) {
        System.out.println("I am on my local branck");
    }
}


