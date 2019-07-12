package com.example.hello.quizegame;

public class QuizeQuestions {

    private String Questions[] = {
        "What is the capital of Bangladesh?",
            "What is the national flower of Bangladesh?",
            "Main Religion in Bangladesh is-",
            "International Calling Code of Bangladesh is-",
            "106 x 106 - 94 x 94 = ?",






    };


    private String Choices[][]={
            {"Dhaka","Rajshahi","Khulna"},
            {"Water Lily","Rose","Tulip"},
            {"Islam","Hindu","Christian"},
            {"+550","+660","+880"},
            {"2004","2400","2040"},




    };


    private  String Correct[] = {"Dhaka","Water Lily","IslAM","+880","2400"};


    public String getQuestion(int a)
    {
        String question = Questions[a];
        return question;
    }

    public String getChoice1(int a)
    {
        String choice1 = Choices[a][0];
        return choice1;
    }


    public String getChoice2(int a)
    {
        String choice2 = Choices[a][1];
        return choice2;
    }

    public String getChoice3(int a)
    {
        String choice3 = Choices[a][2];
        return choice3;
    }

    public String getCorrect(int a)
    {
        String answer = Correct[a];
        return answer;
    }


}



