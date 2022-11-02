# Go Fitness
## Go Fitness is a health and wellness software product that helps users keep track of calories and Exercise.
## I built this software to show a good viriaty of all the skills I have learned at Southwest Technical College.
## To run this software you will need to put the 8 java files from the Final folder into an IED. Remember to put the files in the same project and package. Find the Pictures folder in The Final Folder in this Repository, add all the pictures in that folder to the Src Folder in your IED. Go to the Run java file in your IED and run it. 
[Code](Code.png)        
[Running](Running.png)
## A small sample of Code that I am proud of Is this for loop. It simply changes many different variables and updates a Grid Pane in 8 lines of code and I think that's cool. 
```
for(int i = 0; i < imageView.length; i++) {
			imageView[i].setFitWidth(300);
			imageView[i].setFitHeight(200);
			gp.add(imageView[i], 0, i);
			label[i].setFont(Font.font("Times New roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
			label[i].setTextFill(Color.WHITE);
			gp.add(label[i], 1, i);
		}
```
