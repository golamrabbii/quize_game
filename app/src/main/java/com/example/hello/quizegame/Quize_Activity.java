package com.example.hello.quizegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quize_Activity extends AppCompatActivity {


    private QuizeQuestions mQuizeQuestions = new QuizeQuestions();




    private TextView Scoreview;
    private TextView Questionview;
    private Button Choice1;
    private Button Choice2;
    private Button Choice3;
    private Button exit;

    private String answer;
    private String question;
    private int score=0;
    private int questionnumber=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize);


        Scoreview = (TextView)findViewById(R.id.score);
        Questionview = (TextView)findViewById(R.id.question);
        Choice1 = (Button)findViewById(R.id.option1);
        Choice2 = (Button)findViewById(R.id.option2);
        Choice3 = (Button)findViewById(R.id.option3);
        exit = (Button) findViewById(R.id.quite);



        updateQuestion();
        Choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Choice1.getText() == answer)
                {
                    score=score+1;
                    updateScore(score);
                    updateQuestion();

                    Toast.makeText(Quize_Activity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Quize_Activity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });


        Choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Choice2.getText() == answer)
                {
                    score=score+1;
                    updateScore(score);
                    updateQuestion();

                    Toast.makeText(Quize_Activity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Quize_Activity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });


        Choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Choice3.getText() == answer)
                {
                    score=score+1;
                    updateScore(score);
                    updateQuestion();

                    Toast.makeText(Quize_Activity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Quize_Activity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }

    private void updateQuestion()
    {

        Questionview.setText(mQuizeQuestions.getQuestion(questionnumber));
        Choice1.setText(mQuizeQuestions.getChoice1(questionnumber));
        Choice2.setText(mQuizeQuestions.getChoice2(questionnumber));
        Choice3.setText(mQuizeQuestions.getChoice3(questionnumber));




        answer = mQuizeQuestions.getCorrect(questionnumber);
        questionnumber++;
    }



    private void updateScore(int p)
    {
        Scoreview.setText(""+score);
    }


}
