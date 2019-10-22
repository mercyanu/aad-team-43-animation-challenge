package com.example.animateam43

import kotlin.math.round

fun main() {
    val comment = ("Body Mass Index (BMI) is your weight in kilograms divided by the square of your height in metres.\nKeep in mind that weight monitoring is for fitness and wellness ONLY, not for diagnosis or treatment of any medical condition.\nA healthcare professional should ALWAYS be consulted for check-up.")
    println(comment)
    println(" ")

    println("Height (cm): ")
    var height: Float = readLine()!!.toFloat()
    println("Weight (kg): ")
    var weight: Float = readLine()!!.toFloat()

    val H: Float = (height/100)
    val W: Float = (weight)

    var calcB: Float = (W/(H*H))
    var BMI:Float = (round(calcB * 100)/100)

    if (BMI <= 18.5){
        println("You are UNDERWEIGHT!\nYour BMI is " +BMI)
    }

    if (BMI >= 18.6 && BMI <= 24.9) {
        println("You are NORMAL!\nYour BMI is " + BMI)
    }

    if (BMI >= 25.0 && BMI <= 29.9) {
        println("You are OVERWEIGHT!\nYour BMI is " + BMI)
    }
    if (BMI >= 30.0){
        println("You are OBESE!\nYour BMI is " + BMI)
    }

    /*when
    {
        BMI <= 18.5 -> print("You are UNDERWEIGHT!\nYour BMI is " +BMI)
        BMI >= (18.6..24.9) -> print("You are NORMAL!\nYour BMI is " +BMI)
        BMI >= (25.0..29.9) -> print("You are OVERWEIGHT!\nYour BMI is " +BMI)
        BMI >= 30.0 -> print("You are OBESE!\nYour BMI is " +BMI)
        else -> print("Check your inputs and re-calculate!\nThank you!")

    }*/
    //println(round(BMI * 100)/100)
    // for (x in 0 until 10) println(x) // Prints 0 through 9

    /*for (BMI in 0 until 19) println("You are UNDERWEIGHT!")
    for (BMI in 19 until 26) println("You are NORMAL!")
    for (BMI in 26 until 31) println("You are OVERWEIGHT!")
    for (BMI in 31 until 100) println("You are OBESE!")*/

}