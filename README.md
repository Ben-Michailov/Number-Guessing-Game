# Number-Guessing-Game

Description:

Users are shown a welcome screen and can press a button to start a game. The app will then randomly choose a number between 1 and 30. The user is prompted to designate how many attempts they have, with a limit of 10, then they are prompted to guess the number. After each guess, the app records that as an attempt. If the user’s guess is correct, the user is congratulated and prompted to enter their name in an input box. The user’s name will be stored in the app and the number of attempts that it took the user to get the answer correctly (as well as player-chosen guesses), and display them on a leaderboard. If the user’s answer is incorrect, the number of attempts used is increased by 1 and the user guesses again as long as the user has not exceeded their designated amount of guesses. If the player uses all their attempts, the game restarts. The app checks whether the user guessed correctly or not and follows the procedure outlined above.

Requirements:
1. User is shown welcome message upon starting app and presented with three buttons labelled: ‘Start Game’, ‘Leaderboard’ and ‘Sign in’
2. If the user taps ‘Start Game’ the user will be presented three options for difficulty (easy, medium, and hard) the game will begin and the user is brought to the main screen. 
3. If the user taps ‘Leaderboard’ the app displays the leaderboard. There are three leaderboards, one for each difficulty.
4. If the user taps ‘Sign in’ the user can sign into their account or create an account.
5. The main screen has an input box that allows user to enter amount of guesses the user will have (max 10)
6. App generates random number depending on difficulty (easy = between 1 and 10, medium = between 1 and 30, hard = between 1 and 50) and prompts user to enter guess
7. User can enter a guess between 1 and 30 in an input box, the app then tells the user whether or not their guess was correct.
8. If the user is incorrect, then the user’s guesses left will deplete by 1, and the user will be prompted to try again until all their attempts are used. 
9. If the user is correct, the game will allow the user to sign in (if they haven’t already) or create an account. 
10. App displays the amount of guesses the user has used and the amount of guesses the user assigned themselves (i.e. 3 attempts out of a total 5), and adds it to the leaderboard associated with the user’s account’s username and the difficulty they beat (if the score is better than the user’s previous score for the difficulty, the worse score will be replaced).
11. App displays the leaderboard of all players and the winner.The ranking of the leaderboard is based on the best ratio of guesses taken to guesses allowed (i.e. 1/1 is best, and 2/5 is better than 2/10)
12. App will give an option to play again or return to the home screen
