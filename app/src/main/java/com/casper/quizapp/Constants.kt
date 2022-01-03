package com.casper.quizapp

object Constants{

    fun getQuestions() : ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "What does this road sign mean?",
            R.drawable.ic_bg,
            "Left turns prohibited.",
            "Right turns prohibited.",
            "U-turns prohibited.",
            "U-turns allowed.",
            3)

        questionsList.add(q1)

        val q2 = Questions(
            2,
            "What does this road sign mean?",
            R.drawable.ic_bg,
            "You may not park in the designated area during the posted times.",
            "No parking at any time.",
            "You may park in the designated area during the posted times.",
            "Only weekend parking is allowed.",
            3)

        questionsList.add(q2)

        val q3 = Questions(
            3,
            "What does this road sign mean?",
            R.drawable.ic_bg,
            "There is a stop sign ahead.",
            "There is someone directing traffic ahead.",
            "There are no traffic signals on this road.",
            "There is a traffic signal ahead.",
            4)

        questionsList.add(q3)

        val q4 = Questions(
            4,
            "What does this road sign mean?",
            R.drawable.ic_bg,
            "Watch for traffic signals.",
            "Do not slow down.",
            "Do not block the intersection",
            "Be cautious of pedestrians",
            3)

        questionsList.add(q4)

        val q5 = Questions(
            5,
            "What does this sign mean?",
            R.drawable.ic_bg,
            "Keep a certain distance away.",
            "This lane is closed ahead; merge into another lane.",
            "Follow these signs until you return to your regular route.",
            "There is construction work one kilometre ahead.",
            3)

        questionsList.add(q5)




        return questionsList
    }

}