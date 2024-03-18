package com.example.quizapp

object Constants {

    const val USER_NAME: String =" user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Questions> {

        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1, "Can you name these fruits and vegetables ? ",
            R.drawable.apple,
            "Apple", "Mango",
            "Banana", "Orange",
            1

        )
        questionList.add(que1)

        //que2
        val que2 = Questions(
            2, "Can you name these fruits and vegetables ? ",
            R.drawable.bananas,
            "grapes", "mushrooms",
            "peas", "Banana",
            4
        )
        questionList.add(que2)

        //que3

        val que3 = Questions(
            3, "Can you name these fruits and vegetables ?",
            R.drawable.peas,
            "apple", "orange",
            "peas", "tomato",
            3
        )
        questionList.add(que3)

        //que4
        val que4 = Questions(
            4, "Can you name these fruits and vegetables ?",
            R.drawable.grapes,
            "grapes", "peas",
            "lemon", "strawberry",
            1
        )
        questionList.add(que4)

        //que5
        val que5 = Questions(
            5, "Can you name these fruits and vegetables ?",
            R.drawable.lemon,
            "grapes", "apple",
            "lemon", "tomato",
            3
        )
        questionList.add(que5)

        //que6
        val que6 = Questions(
            6, "Can you name these fruits and vegetables ?",
            R.drawable.tomato,
            "apple", "bananas",
            "tomato", "strawberry",
            3
        )
        questionList.add(que6)

        //que7

        val que7 = Questions(
            7, "Can you name these fruits and vegetables ?",
            R.drawable.potatoes,
            "tomato", "potatoes",
            "lemon", "strawberry",
            2
        )
        questionList.add(que7)

        //que8
        val que8 = Questions(
            8, "Can you name these fruits and vegetables ?",
            R.drawable.strawberry,
            "potatoes", "peas",
            "apple", "strawberry",
            4
        )
        questionList.add(que8)

        //que9
        val que9 = Questions(
            9, "Can you name these fruits and vegetables ?",
            R.drawable.carrot,
            "carrot", "peas",
            "lemon", "mushrooms",
            1
        )
        questionList.add(que9)

        //que10
        val que10 = Questions(
            10, "Can you name these fruits and vegetables ?",
            R.drawable.mushrooms,
            "lemon", "apple",
            "mushrooms", "potatoes",
            3
        )
        questionList.add(que10)

        return questionList
    }
}