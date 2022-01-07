package com.casper.quizapp

object Constants{

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWER : String = "correct_answers"


    fun getQuestions() : ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "What does this road sign mean?",
            R.drawable.g1_1,
            "Left turns prohibited.",
            "Right turns prohibited.",
            "U-turns prohibited.",
            "U-turns allowed.",
            3)

        questionsList.add(q1)

        val q2 = Questions(
            2,
            "What does this road sign mean?",
            R.drawable.g1_2,
            "You may not park in the designated area during the posted times.",
            "No parking at any time.",
            "You may park in the designated area during the posted times.",
            "Only weekend parking is allowed.",
            3)

        questionsList.add(q2)

        val q3 = Questions(
            3,
            "What does this road sign mean?",
            R.drawable.g1_3,
            "There is a stop sign ahead.",
            "There is someone directing traffic ahead.",
            "There are no traffic signals on this road.",
            "There is a traffic signal ahead.",
            4)

        questionsList.add(q3)

        val q4 = Questions(
            4,
            "What does this road sign mean?",
            R.drawable.g1_4,
            "Watch for traffic signals.",
            "Do not slow down.",
            "Do not block the intersection",
            "Be cautious of pedestrians",
            3)

        questionsList.add(q4)

        val q5 = Questions(
            5,
            "What does this sign mean?",
            R.drawable.g1_5,
            "Keep a certain distance away.",
            "This lane is closed ahead; merge into another lane.",
            "Follow these signs until you return to your regular route.",
            "There is construction work one kilometre ahead.",
            3)

        questionsList.add(q5)


        //NEW

        val q6 = Questions(
            6,
            "What does this sign mean?",
            R.drawable.g1_6,
            "No stopping",
            "No parking.",
            "Bicycles allowed on this road.",
            "No bicycles allowed on this road .",
            4)

        questionsList.add(q6)

        val q7 = Questions(
            7,
            "What does this road sign mean?",
            R.drawable.g1_7,
            "Moveable bridge ahead.",
            "Narrow road ahead.",
            "Hotel.",
            "Airport.",
            1)

        questionsList.add(q7)

        val q8 = Questions(
            8,
            "What does this road sign mean?",
            R.drawable.g1_8,
            "No stopping.",
            "No trucks.",
            "No parking.",
            "No passing.",
            4)

        questionsList.add(q8)

        val q9 = Questions(
            9,
            "What does this sign mean?",
            R.drawable.g1_9,
            "An emergency vehicle.",
            "A fast moving vehicle.",
            "A vehicle carrying dangerous goods.",
            "A slow moving vehicle.",
            4)

        questionsList.add(q9)

        val q10 = Questions(
            10,
            "What does this road sign mean?",
            R.drawable.g1_10,
            "Airplanes land on this road.",
            "This is a route to an airport.",
            "Airplanes fly low overhead.",
            "This is landing area for helicopters.",
            2)

        questionsList.add(q10)



        return questionsList
    }

}