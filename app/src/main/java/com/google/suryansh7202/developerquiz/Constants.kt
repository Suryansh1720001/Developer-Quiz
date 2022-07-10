package com.google.suryansh7202.developerquiz


object Constants {



    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER:String = "correct_answer"
    const val WRONG_ANSWER:String = "wrong_answer"
    const val NOT_SELECTED:String = "not_selected"
    const val QUESTION_CORRECT_OPTION: String = "question_correct_answer"
    const val CURRENT_POSITION: String = "mCurrentPosition"
    const val Progress_Bar_Position: String = "progressBarPosition"
    const val Send_Current_Position: String = "sendCurrentPosition"
    const val SELECTED_QUIZ: String = "selected_quiz"


    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"Identify the incorrect constructor type.",
            R.drawable.bg,
            "Friend constructor","Parameterized constructor","Copy Constructor","None of these",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,"Who invented C++?",
            R.drawable.java1,
            "Dennis Ritchie","Bjarne Stroustrup","Brian Kernighan","Ken Thompson",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,"Which of the following is the correct syntax of including a user defined header files in C++?",
            R.drawable.java1,
            "#include [userdefined]","#include “userdefined”","#include <userdefined.h>","#include <userdefined>",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            4,"Which of the following user-defined header file extension used in c++?",
            R.drawable.java1,
            "hg","cpp","h","hf",
            3
        )
        questionList.add(que4)



        val que5 = Question(
            5,"Which of the following is not a type of Constructor in C++?",
            R.drawable.java1,
            "Default constructor","Parameterized constructor","Copy constructor","Friend constructor",
            4
        )
        questionList.add(que5)


        val que6 = Question(
            6,"Which of the following approach is used by C++?",
            R.drawable.java1,
            "Argentina","benin","Kuwait","Armenia",
            2
        )
        questionList.add(que6)


        val que7 = Question(
            7,"Which of the following approach is used by C++?",
            R.drawable.java1,
            "Left-right","Right-left","Bottom-up","Top-down",
            3
        )
        questionList.add(que7)



        val que8 = Question(
            8,"Which of the following type is provided by C++ but not C?",
            R.drawable.java1,
            "double","float","int","bool",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            9,"By default, all the files in C++ are opened in _________ mode.",
            R.drawable.java1,
            "Binary","VTC","Text","ISCII",
            3
        )
        questionList.add(que9)


        val que10 = Question(
            10,"Which of the following correctly declares an array in C++?",
            R.drawable.java1,
            "array{10};","array array[10];","int array;","int array[10];",

            4
        )
        questionList.add(que10)


        // JAVA QUESTION


        val que11 = Question(
            11,"What is the default value of byte variable?",
            R.drawable.java1,
            "0","0.0","null","undefined",

            1
        )
        questionList.add(que11)



        val que12 = Question(
            12,"This is the parent of Error and Exception classes.",
            R.drawable.java1,
            "MainException","MainError","Catchable","Throwable",

            4
        )

        questionList.add(que12)

        val que13 = Question(
            13,"What will be the output of the following code\n" +
                    "import java.util.LinkedHashSet;\n" +
                    "import java.util.Set;\n" +
                    "public class LinkedHashSetTest {\n" +
                    "public static void main (String args[])\n" +
                    "{\n" +
                    "Set s=new LinkedHashSet();\n" +
                    "s.add(“1”);\n" +
                    "s.add(1);\n" +
                    "s.add(3);\n" +
                    "s.add(2);\n" +
                    "System.out.println(s);\n" +
                    "}\n" +
                    "}",
            R.drawable.java1,
            " [1, 1, 2, 3]"," [1, 2, 2 3[","[1, 1, 3, 2]"," [1, 2, 3]",

            3
        )
        questionList.add(que13)



        val que14 = Question(
            14,"Who is known as father of Java Programming Language?",
            R.drawable.java1,
            "James Gosling","Charel Babbage","Blais Pascal","M. P Java",

            1
        )
        questionList.add(que14)



        val que15 = Question(
            15,"Which of the following correctly declares an array in C++?",
            R.drawable.java1,
            "array{10};","array array[10];","int array;","int array[10];",

            4
        )
        questionList.add(que15)

        val que16 = Question(
            16,"Which provides runtime environment for java byte code to be executed?",
            R.drawable.java1,
            "array{10};","array array[10];","int array;","int array[10];",

            4
        )
        questionList.add(que16)

        val que17 = Question(
            17,"Which provides runtime environment for java byte code to be executed?",
            R.drawable.java1,
            "JVM","JDK","JRE","JAVAC",

            1
        )
        questionList.add(que17)


        val que18 = Question(
            18,"Which of these have highest precedence?",
            R.drawable.java1,
            "()","++","*",">>",

            4
        )
        questionList.add(que18)


        val que19 = Question(
            19,"Which of these is returned by operator '&' ?",
            R.drawable.java1,
            "Integer","Character","Boolean","Float",

            2
        )
        questionList.add(que19)


        val que20 = Question(
            20,"Data type long literals are appended by _____",
            R.drawable.java1,
            "Uppercase L","LONG","Lowercase L","Both A and B",

            4
        )
        questionList.add(que20)


        return questionList
    }
}