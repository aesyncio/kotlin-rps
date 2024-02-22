fun main(){
    var wins = 0
    var loses = 0
    var ties = 0
    var os = System.getProperty("os.name")

    ttt(wins,loses,ties,os)
}

fun ttt(wins: Int,loses: Int,ties: Int, os: String){  	
    if(os == "Windows"){
        // no idea how to clean the terminal on windows without running cls
    } else {
	print("\u001b[H\u001b[2J")
    }

    println("[[[[ Welcome to Rock-Paper-Scissors ]]]]")
    println("[[[[ My First Kotlin Project ]]]]")
    println("[[[[       Wins: $wins       ]]]]")
    println("[[[[       Loses: $loses     ]]]]")
    println("[[[[       Ties: $ties       ]]]]")
    print("[!] Choose one (rock, paper, scissors): ")
    var choiceArray = arrayOf("rock", "paper", "scissors")
    var botChoice = choiceArray.random()
    var userChoice = readln()
    
    if(userChoice in choiceArray){ 
     if(userChoice == "rock" && botChoice == "scissors"){
	 println("[!] You won because the bot chose $botChoice! Press enter to continue")
	 readln()
	 var wins = wins + 1
	 ttt(wins,loses,ties,os)
     } else if(userChoice == "scissors" && botChoice == "rock"){
         println("[!] You lost because the bot chose $botChoice! Press enter to continue")
	 readln()
	 var loses = loses + 1
	 ttt(wins,loses,ties,os)
     } else if(userChoice == "rock" && botChoice == "paper"){
         println("[!] You lost because the bot chose $botChoice! Press enter to continue")
	 readln()
	 var loses = loses + 1
	 ttt(wins,loses,ties,os)
     } else if(userChoice == "paper" && botChoice == "rock"){
         println("[!] You won because the bot chose $botChoice! Press enter to continue")
	 readln()
	 var wins = wins + 1
	 ttt(wins,loses,ties,os)
 } else if(userChoice == "paper" && botChoice == "scissors"){
	 println("[!] You lost because the bot chose $botChoice! Press enter to continue")
	 readln()
	 var loses = loses + 1
	 ttt(wins,loses,ties,os)
 } else if(userChoice == "scissors" && botChoice == "paper"){
         println("[!] You won because the bot chose $botChoice! Press enter to continue")
	 readln()
	 var wins = wins + 1
	 ttt(wins,loses,ties,os)
     } else if(userChoice == botChoice){
         println("[!] Tie! Bot also chose $botChoice! Press enter to continue")
	 readln()
	 var ties = ties + 1
	 ttt(wins,loses,ties,os)
     }
    } else {
     println("[!] '$userChoice' is not a valid option, press enter to continue")
     readln()
     ttt(wins,loses,ties,os)
    }	     
}
