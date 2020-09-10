package com.example.madlevel2task2

data class Question(
    var question: String,
    var answer: String
) {
    companion object{
        val QUESTIONS = arrayOf(
            "A val and var are the same.",
            "Mobile Application Development grants 12 EC.",
            "A unit in kotlin corresponds to a void in Java",
            "In kotling 'when' replaces the switch in Java."
        )

        val ANSWERS = arrayOf(
            "false",
            "false",
            "true",
            "true"
        )
    }
}
