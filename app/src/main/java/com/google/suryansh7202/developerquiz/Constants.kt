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
            15,"What feature of OOP has a super-class sub-class concept?",
            R.drawable.java1,
            "Hierarchical inheritance","Single inheritance","Multiple inheritances","Multilevel inheritance",

            1
        )
        questionList.add(que15)

        val que16 = Question(
            16,"Modulus operator (%) can be applied to which of these?",
            R.drawable.java1,
            "Integers","Floating - point numbers","Both A and B","None of These",

            3
        )
        questionList.add(que16)

        val que17 = Question(
            17,"Which of these is not a bitwise operator?",
            R.drawable.java1,
            "&' Operator","&=' Operator","|=' Operator","<=' Operator",

            4
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




        // PYTHON QUIZ


        val que21 = Question(
            21,"What is the output of the following code? " +
                    "import math\n" +
                    " \n" +
                    "   def main():\n" +
                    "      math.cos(math.pi)\n" +
                    "main()\n" +
                    "   print(main())",
            R.drawable.java1,
            "-1","None","Error","Math.pi not defined",

            2
        )
        questionList.add(que21)


        val que22 = Question(
            22,"Syntax error in python is detected by _________at _______",
            R.drawable.java1,
            "compiler/ compile time","compiler/ run time","interpreter/ run timee","interpreter/ compile time",

            3
        )
        questionList.add(que22)


        val que23 = Question(
            23,"Select the correct function among them which can be used to write the data to perform for a binary output?",
            R.drawable.java1,
            "Write","Output.binary","Dump","Binary.output",

            3
        )
        questionList.add(que23)


        val que24 = Question(
            24,"Which of the following is used to define a block of code in Python language?",
            R.drawable.java1,
            "Indentation","Key","Brackets","All of the mentioned",

            1
        )
        questionList.add(que24)


        val que25 = Question(
            25,"Which code can be used as an input dialog named ''Is this a character? ''",
            R.drawable.java1,
            " Tkinter.messagebox.showinfo(''showinfo'' , ''Is this a character? '')","Tkinter.messagebox.askyesno(''askyesno'' , ''Is this a character? '')",
            "Tkinter.messagebox.showerror(''showerror'' , ''Is this a character? '')","Tkinter.messagebox.showwarning(''showwarning'' , ' 'Is this a character? '')",

            2
        )
        questionList.add(que25)


        val que26 = Question(
            26,"What will be the output of the following Python code snippet if x=1?\n" +
                    "x<<2",
            R.drawable.java1,
            "4","2","1","8",

            1
        )
        questionList.add(que26)


        val que27 = Question(
            27,"Which of the following is the truncation division operator in Python?",
            R.drawable.java1,
            "|","//","/","%",

            2
        )
        questionList.add(que27)


        val que28 = Question(
            28,"Which of the following functions is a built-in function in python?",
            R.drawable.java1,
            "factorial()","print()","seed()","sqrt()",

            2
        )
        questionList.add(que28)



        val que29 = Question(
            29,"What will be the output of the following Python function?\n" +
                    "\n" +
                    "min(max(False,-3,-4), 2,7)",
            R.drawable.java1,
            "-4","-3","2","False",

            4
        )
        questionList.add(que29)


        val que30 = Question(
            30,"Which one of the following is not a keyword in Python language?",
            R.drawable.java1,
            "pass","eval","assert","nonlocal",

            2
        )
        questionList.add(que30)




        // C language QUIZ




        val que31 = Question(
            31,"Identify the C compiler of UNIX.",
            R.drawable.java1,
            "gcc","cc","Borland","vc++",

            2
        )
        questionList.add(que31)



        val que32 = Question(
            32,"Which standard library function can return a pointer to the last occurrence of a character in a string?\n" +
                    "\n",
            R.drawable.java1,
            "stchar()","strrchr()","strchar() & stchar()","strrchar()",

            2
        )
        questionList.add(que32)






        val que33 = Question(
            33,"Which of the following variable cannot be used by switch-case statement?",
            R.drawable.java1,
            "char","int","float","Double",

            3
        )
        questionList.add(que33)




        val que34 = Question(
            34," In C programming language, a function prototype is a declaration of the function that just specifies the function’s interface (function's name, argument types and return type) and extracts the body of the function. By defining the function, we get to know what action a particular function is going to perform.",
            R.drawable.java1,
            "True","None of these","False","110",

            1
        )
        questionList.add(que34)




        val que35 = Question(
            35,"hat is the output of the following program?\n" +
                    "\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "main()\n" +
                    "{ \n" +
                    "   char *s = \"Abc\";\n" +
                    "   \n" +
                    "   while(*s)\n" +
                    "      printf(\"%c\", *s++);\n" +
                    "}",
            R.drawable.java1,
            "Abc","bc","Compile error","Runtime error",

            1
        )
        questionList.add(que35)




        val que36 = Question(
            36,"Keywords cannot be used as ____",
            R.drawable.java1,
            "Variables","Variables or constant names","Constant names","None of the above",

            2
        )
        questionList.add(que36)




        val que37 = Question(
            37,"____ are declared within the body of a function.",
            R.drawable.java1,
            "Variables","Local variables","Main functions","Arrays",

            2
        )
        questionList.add(que37)




        val que38 = Question(
            38,"____ is an effective tool for programming scientific, mathematical and engineering computations.",
            R.drawable.java1,
            "Parameter","Main function","Recursion","Local variable",

            3
        )
        questionList.add(que38)




        val que39 = Question(
            39,"The formatting character should be preceded by a ____ symbol.",
            R.drawable.java1,
            "+","/","%","-",

            3
        )
        questionList.add(que39)


        val que40 = Question(
            40,"The functions that are defined according to our requirements are called ____",
            R.drawable.java1,
            "Good functions","Modules","User defined functions","Library functions",

            3
        )
        questionList.add(que40)



        //  HTML QUIZ


        val que41 = Question(
            41,"There are ___ levels of heading in HTML",
            R.drawable.java1,
            "Three","Four","Five","Six",

            4
        )
        questionList.add(que41)


        val que42 = Question(
            42,"There are _____ level of heading in html",
            R.drawable.java1,
            "three","four","five","six",

            4
        )
        questionList.add(que42)


        val que43 = Question(
            43,"The purpose of markup is to",
            R.drawable.java1,
            "add hypertext capabilities","enhance the document","both A & B","none of the above",

            3
        )
        questionList.add(que43)


        val que44 = Question(
            44,"Which of the following is true? ",
            R.drawable.java1,
            "BR tag is used to have a blank line","In tables, the header cell is centred by default and the data cells are right-aligned","The <TR> is used to create a data cell","All of the above",

            1
        )
        questionList.add(que44)




        val que45 = Question(
            45,"Which of the following tags do not require a terminator?",
            R.drawable.java1,
            "<u>","<br>","<b>","None of above",

            2
        )
        questionList.add(que45)



        val que46 = Question(
            46,"For a particular font its size attribute can be an absolute value ranging form",
            R.drawable.java1,
            "1-10","1-9","1-8","1-7",

            1
        )
        questionList.add(que46)


        val que47 = Question(
            47,"Which one of the following tags is used to insert graphics in the webpage",
            R.drawable.java1,
            "<image>","<images>","<img>","<imgs>",

            3
        )
        questionList.add(que47)


        val que48 = Question(
            48,"html comment should be enclosed between",
            R.drawable.java1,
            "<!– and — >","<! And !>","<!— and –“”","none of the above",

            1
        )
        questionList.add(que48)


        val que49 = Question(
            49,"The _____ element can be used to identify your html file to the outside world",
            R.drawable.java1,
            "title","body","head","None of these",

            4
        )
        questionList.add(que49)



        val que50 = Question(
            50,"CGI stand for",
            R.drawable.java1,
            "Command Gate Interface","Common Gateway Interface","Common Gate input","None of the above",

            2
        )
        questionList.add(que50)



        // CSS QUIZ


        val que51 = Question(
            51, "If we want define style for an unique element, then which css selector will we use ?",
            R.drawable.java1,
            "Id","text","class","name",

            1
        )
        questionList.add(que51)


        val que52 = Question(
            52,"If we don't want to allow a floating div to the left side of an element, which css property will we use ?",
            R.drawable.java1,
            "margin","clear","float","padding",

            2
        )
        questionList.add(que52)

        val que53 = Question(
            53,"If we want to wrap a block of text around an image, which css property will we use ?",
            R.drawable.java1,
            "wrap","push","float","align",

            3
        )
        questionList.add(que53)



        val que54 = Question(
            54,"If we want to show an Arrow as cursor, then which value we will use ?",
            R.drawable.java1,
            "pointer","default","arrow","arr",

            2
        )
        questionList.add(que54)


        val que55 = Question(
            55,"Which of the following properties will we use to display border around a cell without any content ?",
            R.drawable.java1,
            "empty-cell","blank-cell","noncontent-cell","void-cell",

            1
        )
        questionList.add(que55)


        val que56 = Question(
            56,"Which attribute can be added to many HTML / XHTML elements to identify them as a member of a specific group ?",
            R.drawable.java1,
            "Id","class","div","span",

            2
        )
        questionList.add(que56)

        val que57 = Question(
            57,"Can we define the text direction via css property ?",
            R.drawable.java1,
            "Yes, we can","No, we can't","None","Nothing describe",

            1
        )
        questionList.add(que57)

        val que58 = Question(
            58,"When we write <img src=\"img.png\">, what \"img.png\" inside double quote implies?",
            R.drawable.java1,
            "element","attribute","value","operator",

            3
        )
        questionList.add(que58)

        val que59 = Question(
            59,"How can we write comment along with CSS code ?",
            R.drawable.java1,
            "/* a comment */","// a comment //","/ a comment /","<' a comment'>",

            1
        )
        questionList.add(que59)

        val que60 = Question(
            60,"What should be the table width, so that the width of a table adjust to the current width of the browser window?",
            R.drawable.java1,
            "640 pixels","100%","full-screen","1024 px",

            2
        )
        questionList.add(que60)


        // JAVA SCRIPT QUIZ



        val que61 = Question(
            61," NaN stands for_________.",
            R.drawable.java1,
            "Nano","NanTech","Not  a number","New attactedNematic",

            61
        )
        questionList.add(que61)


        val que62 = Question(
            62,"______ side java script statements embedded in  a HTML Page can respond to user events such as mouse-clicks, forms input and page navigation.",
            R.drawable.java1,
            "client","Server","Website","Live wire",

            1
        )
        questionList.add(que62)

        val que63 = Question(
            63,"++ operator in Java Script is ____ Operator.",
            R.drawable.java1,
            "Unary","Positive","Increment","Addition",

            1
        )
        questionList.add(que63)


        val que64 = Question(
            64,"A translator is described as ________ software.",
            R.drawable.java1,
            "Application"," System","Utility","Open Source",

            2
        )
        questionList.add(que64)


        val que65 = Question(
            65,"Storing numbers, dates or other values are ______ used for in java script program.",
            R.drawable.java1,
            "String","Codes","Variables","Functions",

            3
        )
        questionList.add(que65)



        val que66 = Question(
            66,"When a user views a page containing a java script program, which machine actually executes the script?",
            R.drawable.java1,
            "The user’s machine running offline","The user’s machine running  a web browser","The user’s machine running on a website","The users cookies used by a website",

            2
        )
        questionList.add(que66)


        val que67 = Question(
            67,". _________attribute can hold the java script version.",
            R.drawable.java1,
            "var","language","script","type",

            2
        )
        questionList.add(que67)

        val que68 = Question(
            68,"________side image maps can be used with java script.",
            R.drawable.java1,
            "client ","Server","Website","Live wire",

            1
        )
        questionList.add(que68)


        val que69 = Question(
            69,"Java script is an ________scripting language.",
            R.drawable.java1,
            "object oriented","client oriented ","network oriented","server oriented",

            1
        )
        questionList.add(que69)

        val que70 = Question(
            70," ____ tag can handle mouse events in Netscape",
            R.drawable.java1,
            "<a>","<onclick>","<net>","<control",

            1
        )
        questionList.add(que70)


        // REACT JS QUIZ

        val que71 = Question(
            71,"In React what is used to pass data to a component from outside?",
            R.drawable.java1,
            "setState","render with arguments","props","PropTypes",

            3
        )
        questionList.add(que71)


        val que72= Question(
            72,"In which directory React Components are saved?",
            R.drawable.java1,
            "Inside js/components/","Inside vendor/components/","Inside external/components/","Inside vendor/",

            1
        )
        questionList.add(que72)



        val que73 = Question(
            73,"At the highest level, React components have lifecycle events that fall into\n",
            R.drawable.java1,
            "Initialization","State/Property Updates","Destruction","All of these",

            4
        )
        questionList.add(que73)



        val que74 = Question(
            74,"How many elements does a react component return?",
            R.drawable.java1,
            "2 Elements","2 Elements","Multiple Elements","None of These",
            2
        )
        questionList.add(que74)



        val que75 = Question(
            75,"How do you write an inline style specifying the font-size:12px and color:red; in JSX",
            R.drawable.java1,
            "style={{font-size:12,color:'red'}}","style={{fontSize:'12px',color:'red'}}","style={fontSize:'12px',color:'red'}","style={{font-size:12px,color:'red'}}",

            3
        )
        questionList.add(que75)



        val que76 = Question(
            76,"What is a good use case for using a function while rendering a dynamic list of items",
            R.drawable.java1,
            "If we need to compute a value based on properties of items in the loop.","None. Functions should not be used while rendering a dynamic list.","To make the code shorter",
            "None of these",

            1
        )
        questionList.add(que76)



        val que77 = Question(
            77,"Which of the following is correct syntax for a button click event handler, foo?",
            R.drawable.java1,
            "<button onclick=this.foo()>","<button onClick={this.foo()}>","<button onclick=this.foo>","<button onClick={foo}>",

            3
        )
        questionList.add(que77)


        val que78 = Question(
            78,"Which method is not part of ReactDOM?",
            R.drawable.java1,
            "ReactDOM.destroy()","ReactDOM.hydrate()","ReactDOM.createPortal()","ReactDOM.findDOMNode()",

            2
        )
        questionList.add(que78)


        val que79 = Question(
            79,"What is a controlled input element?",
            R.drawable.java1,
            "An input element with the controlled flag","An input element that is controlled by the value of another input element",
            "An input element that can only accept a list of characters","An input element whose value is being controlled by a component’s state",

            4
        )
        questionList.add(que79)


        val que80 = Question(
            80,"What is the second argument for setState useful for?",
            R.drawable.java1,
            "To invoke code after the setState operation is done","To replace the state completely instead of the default merge action",
            "To access the previous state before the setState operation","None of the above",

            1
        )
        questionList.add(que80)







        return questionList
    }
}