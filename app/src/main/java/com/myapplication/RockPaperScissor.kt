package com.myapplication
fun main() {
    var computerChoice=""
    var playerChoice=""
    println("Rock,Paper or Scissor? Enter yout Choice!")
    playerChoice=readln()
    val randomNumber=(1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice="Rock"
        }
        2 -> {
            computerChoice="Paper"
        }
        3 -> {
            computerChoice="Scissor"
        }
    }
    println(computerChoice)
    val winner=when{
        playerChoice==computerChoice -> "Tie"
        playerChoice=="Rock" && computerChoice=="Scissor" -> "Player"
        playerChoice=="Paper" && computerChoice=="Rock" -> "Player"
        playerChoice=="Scissor" && computerChoice=="Paper" -> "Player"
        else -> "Computer"
    }
    when (winner) {
        "Tie" -> {
            println("It's a Tie")
        }
        "Player" -> {
            println("Congratulations! You Won the Game")
        }
        "Computer" -> {
            println("Oops! You Lose")
        }
    }
}