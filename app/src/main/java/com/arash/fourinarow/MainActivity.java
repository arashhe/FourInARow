package com.arash.fourinarow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //blue=false red=true
    boolean player = false,win=false;
    String whoWin = "Red";
    int[] gameState = {
            2,2,2,2,2,2,
            2,2,2,2,2,2,
            2,2,2,2,2,2,
            2,2,2,2,2,2,
            2,2,2,2,2,2,
            2,2,2,2,2,2,
            2,2,2,2,2,2
    };
    int[][] winningPosision = {
            {0,1,2,3},{1,2,3,4},{2,3,4,5},{3,4,5,6},
            {7,8,9,10},{8,9,10,11},{9,10,11,12},{10,11,12,13},
            {14,15,16,17},{15,16,17,18},{16,17,18,19},{17,18,19,20},
            {21,22,23,24},{22,23,24,25},{23,24,25,26},{24,25,26,27},
            {28,29,30,31},{29,30,31,32},{30,31,32,33},{31,32,33,34},
            {35,36,37,38},{36,37,38,39},{37,38,39,40},{38,39,40,41},

            {0,7,14,21},{7,14,21,28},{14,21,28,35},
            {1,8,15,22},{8,15,22,29},{15,22,29,36},
            {2,9,16,23},{9,16,23,30},{16,23,30,37},
            {3,10,17,24},{10,17,24,31},{17,24,31,38},
            {4,11,18,25},{11,18,25,32},{18,25,32,39},
            {5,12,19,26},{12,19,26,33},{19,26,33,40},
            {6,13,20,27},{13,20,27,34},{20,27,34,41},

            {0,8,16,24},{1,9,17,25},{2,10,18,26},{3,11,19,27},
            {7,15,23,31},{8,16,24,32},{9,17,25,33},{10,18,26,34},
            {14,22,30,38},{15,23,31,39},{16,24,32,40},{17,25,33,41},

            {35,29,23,17},{36,30,24,18},{37,31,25,19},{38,32,26,20},
            {28,22,16,10},{29,23,17,11},{30,24,18,12},{31,25,19,13},
            {21,15,9,3},{22,16,10,4},{23,17,11,5},{24,18,12,6}
    };


    public void clickImageView (View view){

        //iv6.setBackgroundColor(Color.parseColor("#302E2E"));
        ImageView i1 = (ImageView) view;

        int tagNumber = Integer.parseInt( i1.getTag().toString());

        if(win==false ) {

            if (tagNumber == 0 || tagNumber == 7 || tagNumber == 14 || tagNumber == 21 || tagNumber == 28 || tagNumber == 35) {
                if(gameState[0]==2) {

                    if (gameState[35] == 2) {
                        ImageView a35 = (ImageView) findViewById(R.id.imageView35);
                        i1 = a35;
                    } else if (gameState[28] == 2) {
                        ImageView a28 = (ImageView) findViewById(R.id.imageView28);
                        i1 = a28;
                    } else if (gameState[21] == 2) {
                        ImageView a21 = (ImageView) findViewById(R.id.imageView21);
                        i1 = a21;
                    } else if (gameState[14] == 2) {
                        ImageView a14 = (ImageView) findViewById(R.id.imageView14);
                        i1 = a14;
                    } else if (gameState[7] == 2) {
                        ImageView a7 = (ImageView) findViewById(R.id.imageView07);
                        i1 = a7;
                    } else if (gameState[0] == 2) {
                        ImageView a0 = (ImageView) findViewById(R.id.imageView00);
                        i1 = a0;
                    }
                }

            } else if (tagNumber == 1 || tagNumber == 8 || tagNumber == 15 || tagNumber == 22 || tagNumber == 29 || tagNumber == 36) {
                if (gameState[36] == 2) {
                    ImageView a36 = (ImageView) findViewById(R.id.imageView36);
                    i1 = a36;
                } else if (gameState[29] == 2) {
                    ImageView a29 = (ImageView) findViewById(R.id.imageView29);
                    i1 = a29;
                } else if (gameState[22] == 2) {
                    ImageView a22 = (ImageView) findViewById(R.id.imageView22);
                    i1 = a22;
                } else if (gameState[15] == 2) {
                    ImageView a15 = (ImageView) findViewById(R.id.imageView15);
                    i1 = a15;
                } else if (gameState[8] == 2) {
                    ImageView a8 = (ImageView) findViewById(R.id.imageView08);
                    i1 = a8;
                } else if (gameState[1] == 2) {
                    ImageView a1 = (ImageView) findViewById(R.id.imageView01);
                    i1 = a1;
                }

            } else if (tagNumber == 2 || tagNumber == 9 || tagNumber == 16 || tagNumber == 23 || tagNumber == 30 || tagNumber == 37) {
                if (gameState[37] == 2) {
                    ImageView a37 = (ImageView) findViewById(R.id.imageView37);
                    i1 = a37;
                } else if (gameState[30] == 2) {
                    ImageView a30 = (ImageView) findViewById(R.id.imageView30);
                    i1 = a30;
                } else if (gameState[23] == 2) {
                    ImageView a23 = (ImageView) findViewById(R.id.imageView23);
                    i1 = a23;
                } else if (gameState[16] == 2) {
                    ImageView a16 = (ImageView) findViewById(R.id.imageView16);
                    i1 = a16;
                } else if (gameState[9] == 2) {
                    ImageView a9 = (ImageView) findViewById(R.id.imageView09);
                    i1 = a9;
                } else if (gameState[2] == 2) {
                    ImageView a2 = (ImageView) findViewById(R.id.imageView02);
                    i1 = a2;
                }

            } else if (tagNumber == 3 || tagNumber == 10 || tagNumber == 17 || tagNumber == 24 || tagNumber == 31 || tagNumber == 38) {
                if (gameState[38] == 2) {
                    ImageView a38 = (ImageView) findViewById(R.id.imageView38);
                    i1 = a38;
                } else if (gameState[31] == 2) {
                    ImageView a31 = (ImageView) findViewById(R.id.imageView31);
                    i1 = a31;
                } else if (gameState[24] == 2) {
                    ImageView a24 = (ImageView) findViewById(R.id.imageView24);
                    i1 = a24;
                } else if (gameState[17] == 2) {
                    ImageView a17 = (ImageView) findViewById(R.id.imageView17);
                    i1 = a17;
                } else if (gameState[10] == 2) {
                    ImageView a10 = (ImageView) findViewById(R.id.imageView10);
                    i1 = a10;
                } else if (gameState[3] == 2) {
                    ImageView a3 = (ImageView) findViewById(R.id.imageView03);
                    i1 = a3;
                }
            } else if (tagNumber == 4 || tagNumber == 11 || tagNumber == 18 || tagNumber == 25 || tagNumber == 32 || tagNumber == 39) {
                if (gameState[39] == 2) {
                    ImageView a39 = (ImageView) findViewById(R.id.imageView39);
                    i1 = a39;
                } else if (gameState[32] == 2) {
                    ImageView a32 = (ImageView) findViewById(R.id.imageView32);
                    i1 = a32;
                } else if (gameState[25] == 2) {
                    ImageView a25 = (ImageView) findViewById(R.id.imageView25);
                    i1 = a25;
                } else if (gameState[18] == 2) {
                    ImageView a18 = (ImageView) findViewById(R.id.imageView18);
                    i1 = a18;
                } else if (gameState[11] == 2) {
                    ImageView a11 = (ImageView) findViewById(R.id.imageView11);
                    i1 = a11;
                } else if (gameState[4] == 2) {
                    ImageView a4 = (ImageView) findViewById(R.id.imageView04);
                    i1 = a4;
                }
            } else if (tagNumber == 5 || tagNumber == 12 || tagNumber == 19 || tagNumber == 26 || tagNumber == 33 || tagNumber == 40) {
                if (gameState[40] == 2) {
                    ImageView a40 = (ImageView) findViewById(R.id.imageView40);
                    i1 = a40;
                } else if (gameState[33] == 2) {
                    ImageView a33 = (ImageView) findViewById(R.id.imageView33);
                    i1 = a33;
                } else if (gameState[26] == 2) {
                    ImageView a26 = (ImageView) findViewById(R.id.imageView26);
                    i1 = a26;
                } else if (gameState[19] == 2) {
                    ImageView a19 = (ImageView) findViewById(R.id.imageView19);
                    i1 = a19;
                } else if (gameState[12] == 2) {
                    ImageView a12 = (ImageView) findViewById(R.id.imageView12);
                    i1 = a12;
                } else if (gameState[5] == 2) {
                    ImageView a5 = (ImageView) findViewById(R.id.imageView05);
                    i1 = a5;
                }
            } else if (tagNumber == 6 || tagNumber == 13 || tagNumber == 20 || tagNumber == 27 || tagNumber == 34 || tagNumber == 41) {
                if (gameState[41] == 2) {
                    ImageView a41 = (ImageView) findViewById(R.id.imageView41);
                    i1 = a41;
                } else if (gameState[34] == 2) {
                    ImageView a34 = (ImageView) findViewById(R.id.imageView34);
                    i1 = a34;
                } else if (gameState[27] == 2) {
                    ImageView a27 = (ImageView) findViewById(R.id.imageView27);
                    i1 = a27;
                } else if (gameState[20] == 2) {
                    ImageView a20 = (ImageView) findViewById(R.id.imageView20);
                    i1 = a20;
                } else if (gameState[13] == 2) {
                    ImageView a13 = (ImageView) findViewById(R.id.imageView13);
                    i1 = a13;
                } else if (gameState[6] == 2) {
                    ImageView a6 = (ImageView) findViewById(R.id.imageView06);
                    i1 = a6;
                }
            }

            if(gameState[Integer.parseInt(i1.getTag().toString())] ==2) {
                //i1.setTranslationY(-1000f);
                ImageView iv6 = (ImageView) findViewById(R.id.iv6);
                ImageView iv7 = (ImageView) findViewById(R.id.iv7);
                if (player == false) {
                    i1.setImageResource(R.drawable.blue3);
                    //i1.animate().translationYBy(1000f).setDuration(1000);
                    gameState[Integer.parseInt(i1.getTag().toString())] = 0;
                    iv7.setBackgroundColor(Color.parseColor("#4A4A4A"));
                    iv6.setBackgroundColor(Color.parseColor("#302E2E"));
                } else {
                    i1.setImageResource(R.drawable.red3);
                    //i1.animate().translationYBy(1000f).setDuration(1000);
                    gameState[Integer.parseInt(i1.getTag().toString())] = 1;
                    iv6.setBackgroundColor(Color.parseColor("#4A4A4A"));
                    iv7.setBackgroundColor(Color.parseColor("#302E2E"));
                }
                player = !player;
                EditText bt = (EditText) findViewById(R.id.txtBlueText);
                EditText rt = (EditText) findViewById(R.id.txtRedText);
                for (int[] a : winningPosision) {

                    if (gameState[a[0]] == gameState[a[1]] &&
                            gameState[a[1]] == gameState[a[2]] &&
                            gameState[a[2]] == gameState[a[3]] &&
                            gameState[a[3]] != 2) {
                        win = true;
                        if (gameState[a[0]] == 0)
                            whoWin = bt.getText().toString();
                        else {
                            whoWin = rt.getText().toString();
                        }
                    }
                }
                boolean draw=true;
                for(int r=0;r<42;r++)
                    if(gameState[r]==2)
                        draw = false;

                if(draw==true){
                    win=true;
                    whoWin="Nobody";
                }

            }
        }
        if (win == true) {
            TextView winner = (TextView) findViewById(R.id.txtWinner);
            winner.setText(whoWin + " Wins");
            winner.setVisibility(View.VISIBLE);
            Button b1 = (Button) findViewById(R.id.btnPlayAgain);
            b1.setVisibility(View.VISIBLE);
        }



    }
    public void btnPlayAgainFunc (View view){

        ImageView iv6 = (ImageView) findViewById(R.id.iv6);
        ImageView iv7 = (ImageView) findViewById(R.id.iv7);

        win=false;
        player = !player;
        if(player==false){
            iv6.setBackgroundColor(Color.parseColor("#4A4A4A"));
            iv7.setBackgroundColor(Color.parseColor("#302E2E"));
        }else{
            iv7.setBackgroundColor(Color.parseColor("#4A4A4A"));
            iv6.setBackgroundColor(Color.parseColor("#302E2E"));
        }
        TextView winner = (TextView) findViewById(R.id.txtWinner);
        winner.setVisibility(View.INVISIBLE);
        Button b1 = (Button) findViewById(R.id.btnPlayAgain);
        b1.setVisibility(View.INVISIBLE);

        LinearLayout tempTL = (LinearLayout) findViewById(R.id.tL1);
        for(int i =0 ; i<tempTL.getChildCount();i++) {
            LinearLayout tempTR = (LinearLayout) tempTL.getChildAt(i);
            for (int j = 0; j < tempTR.getChildCount(); j++){
                ((ImageView) tempTR.getChildAt(j)).setImageResource(0);}
        }

        for(int r=0; r<42;r++)
            gameState[r]=2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}