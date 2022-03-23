package eu.tutorials.quizapp

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWER:String="correct_answer"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What is the name of Movie ?",
            R.drawable.pk,
            "kuch kuch hota hai", "pk",
            "Armenia", "Austria", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What is the name of Movie ?",
            R.drawable.ddlj,
            "kuch kuch hota hai", "pk",
            "ddlj", "hum apke hai kon", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What is the name of Movie ?",
            R.drawable.golmal,
            "kuch kuch hota hai", "pk",
            "ddlj", "golmal", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is the name of Movie ?",
            R.drawable.kabirsingh,
            "kuch kuch hota hai", "kabir Singh",
            "ddlj", "golmal", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to ? ",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is the name of Movie ?",
            R.drawable.pushpa,
            "kuch kuch hota hai", "kabir Singh",
            "pushpa", "golmal", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is the name of Movie ?",
            R.drawable.yediwani,
            "Ye jawani hai Diwani", "kabir Singh",
            "ddlj", "golmal", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What is the name of Movie ?",
            R.drawable.ic_flag_of_india,
            "INDIA", "New Zealand",
            "Tuvalu", "United States of America", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What is the name of Movie ?",
            R.drawable.bahubali2,
            "Ye jawani hai Diwani", "kabir Singh",
            "golmal", "bahubali", 4
        )

        questionsList.add(que10)

        return questionsList
    }
    // END
}
// END