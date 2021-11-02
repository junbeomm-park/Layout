package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class FrameLayoutExamActivity extends AppCompatActivity {
    LinearLayout img1;
    LinearLayout img2;
    LinearLayout img3;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout_exam);
        img1 = findViewById(R.id.login);
        img2 = findViewById(R.id.sign);
        img3 = findViewById(R.id.detail);

    }

    //버튼이 클릭될 때 호출되는 메소드
    public void loginclick(View v) {
        imagechange();
    }

    //버튼을 선택할때마다 이미지가 교체되어 보이도록 구현
    public void imagechange() {

        img1.setVisibility(View.VISIBLE);
        //View.INVISIBLE은 FrameLayout에 추가 되어 있는 뷰를 화면에 표시 X
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        Log.d("index", "현재index값====>" + index);
        index = 1;


    }

    public void signclick(View v) { imagechange2();}


        //버튼을 선택할때마다 이미지가 교체되어 보이도록 구현
        public void imagechange2 () {

                //View.VISIBLE은 FrameLayout에 추가 되어 있는 뷰를 화면에 표시
                img1.setVisibility(View.INVISIBLE);
                //View.INVISIBLE은 FrameLayout에 추가 되어 있는 뷰를 화면에 표시 X
                img2.setVisibility(View.VISIBLE);
                img3.setVisibility(View.INVISIBLE);
                Log.d("index", "현재index값====>" + index);
                index = 1;

            }

            public void detailclick(View v) { imagechange3();}


            //버튼을 선택할때마다 이미지가 교체되어 보이도록 구현
            public void imagechange3 () {

                //View.VISIBLE은 FrameLayout에 추가 되어 있는 뷰를 화면에 표시
                img1.setVisibility(View.INVISIBLE);
                //View.INVISIBLE은 FrameLayout에 추가 되어 있는 뷰를 화면에 표시 X
                img2.setVisibility(View.INVISIBLE);
                img3.setVisibility(View.VISIBLE);
                Log.d("index", "현재index값====>" + index);
                index = 1;

            }
        }

