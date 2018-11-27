package com.example.ripper.sudukosolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText b11,b12,b13,b14,b15,b16,b17,b18,b19;
    EditText b21,b22,b23,b24,b25,b26,b27,b28,b29;
    EditText b31,b32,b33,b34,b35,b36,b37,b38,b39;
    EditText b41,b42,b43,b44,b45,b46,b47,b48,b49;
    EditText b51,b52,b53,b54,b55,b56,b57,b58,b59;
    EditText b61,b62,b63,b64,b65,b66,b67,b68,b69;
    EditText b71,b72,b73,b74,b75,b76,b77,b78,b79;
    EditText b81,b82,b83,b84,b85,b86,b87,b88,b89;
    EditText b91,b92,b93,b94,b95,b96,b97,b98,b99;

//////////////////// onCreate Method ////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b11 = (EditText) findViewById(R.id.editText11);
        b12 = (EditText) findViewById(R.id.editText12);
        b13 = (EditText) findViewById(R.id.editText13);
        b14 = (EditText) findViewById(R.id.editText14);
        b15 = (EditText) findViewById(R.id.editText15);
        b16 = (EditText) findViewById(R.id.editText16);
        b17 = (EditText) findViewById(R.id.editText17);
        b18 = (EditText) findViewById(R.id.editText18);
        b19 = (EditText) findViewById(R.id.editText19);

        b21 = (EditText) findViewById(R.id.editText21);
        b22 = (EditText) findViewById(R.id.editText22);
        b23 = (EditText) findViewById(R.id.editText23);
        b24 = (EditText) findViewById(R.id.editText24);
        b25 = (EditText) findViewById(R.id.editText25);
        b26 = (EditText) findViewById(R.id.editText26);
        b27 = (EditText) findViewById(R.id.editText27);
        b28 = (EditText) findViewById(R.id.editText28);
        b29 = (EditText) findViewById(R.id.editText29);

        b31 = (EditText) findViewById(R.id.editText31);
        b32 = (EditText) findViewById(R.id.editText32);
        b33 = (EditText) findViewById(R.id.editText33);
        b34 = (EditText) findViewById(R.id.editText34);
        b35 = (EditText) findViewById(R.id.editText35);
        b36 = (EditText) findViewById(R.id.editText36);
        b37 = (EditText) findViewById(R.id.editText37);
        b38 = (EditText) findViewById(R.id.editText38);
        b39 = (EditText) findViewById(R.id.editText39);

        b41 = (EditText) findViewById(R.id.editText41);
        b42 = (EditText) findViewById(R.id.editText42);
        b43 = (EditText) findViewById(R.id.editText43);
        b44 = (EditText) findViewById(R.id.editText44);
        b45 = (EditText) findViewById(R.id.editText45);
        b46 = (EditText) findViewById(R.id.editText46);
        b47 = (EditText) findViewById(R.id.editText47);
        b48 = (EditText) findViewById(R.id.editText48);
        b49 = (EditText) findViewById(R.id.editText49);

        b51 = (EditText) findViewById(R.id.editText51);
        b52 = (EditText) findViewById(R.id.editText52);
        b53 = (EditText) findViewById(R.id.editText53);
        b54 = (EditText) findViewById(R.id.editText54);
        b55 = (EditText) findViewById(R.id.editText55);
        b56 = (EditText) findViewById(R.id.editText56);
        b57 = (EditText) findViewById(R.id.editText57);
        b58 = (EditText) findViewById(R.id.editText58);
        b59 = (EditText) findViewById(R.id.editText59);

        b61 = (EditText) findViewById(R.id.editText61);
        b62 = (EditText) findViewById(R.id.editText62);
        b63 = (EditText) findViewById(R.id.editText63);
        b64 = (EditText) findViewById(R.id.editText64);
        b65 = (EditText) findViewById(R.id.editText65);
        b66 = (EditText) findViewById(R.id.editText66);
        b67 = (EditText) findViewById(R.id.editText67);
        b68 = (EditText) findViewById(R.id.editText68);
        b69 = (EditText) findViewById(R.id.editText69);

        b71 = (EditText) findViewById(R.id.editText71);
        b72 = (EditText) findViewById(R.id.editText72);
        b73 = (EditText) findViewById(R.id.editText73);
        b74 = (EditText) findViewById(R.id.editText74);
        b75 = (EditText) findViewById(R.id.editText75);
        b76 = (EditText) findViewById(R.id.editText76);
        b77 = (EditText) findViewById(R.id.editText77);
        b78 = (EditText) findViewById(R.id.editText78);
        b79 = (EditText) findViewById(R.id.editText79);

        b81 = (EditText) findViewById(R.id.editText81);
        b82 = (EditText) findViewById(R.id.editText82);
        b83 = (EditText) findViewById(R.id.editText83);
        b84 = (EditText) findViewById(R.id.editText84);
        b85 = (EditText) findViewById(R.id.editText85);
        b86 = (EditText) findViewById(R.id.editText86);
        b87 = (EditText) findViewById(R.id.editText87);
        b88 = (EditText) findViewById(R.id.editText88);
        b89 = (EditText) findViewById(R.id.editText89);

        b91 = (EditText) findViewById(R.id.editText91);
        b92 = (EditText) findViewById(R.id.editText92);
        b93 = (EditText) findViewById(R.id.editText93);
        b94 = (EditText) findViewById(R.id.editText94);
        b95 = (EditText) findViewById(R.id.editText95);
        b96 = (EditText) findViewById(R.id.editText96);
        b97 = (EditText) findViewById(R.id.editText97);
        b98 = (EditText) findViewById(R.id.editText98);
        b99 = (EditText) findViewById(R.id.editText99);

        EditText[][] box = {{b11,b12,b13,b14,b15,b16,b17,b18,b19},
                {b21,b22,b23,b24,b25,b26,b27,b28,b29},
                {b31,b32,b33,b34,b35,b36,b37,b38,b39},
                {b41,b42,b43,b44,b45,b46,b47,b48,b49},
                {b51,b52,b53,b54,b55,b56,b57,b58,b59},
                {b61,b62,b63,b64,b65,b66,b67,b68,b69},
                {b71,b72,b73,b74,b75,b76,b77,b78,b79},
                {b81,b82,b83,b84,b85,b86,b87,b88,b89},
                {b91,b92,b93,b94,b95,b96,b97,b98,b99}};

        for(int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                box[i][j].setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {

                        if (hasFocus)
                            v.setBackgroundResource(R.drawable.focus_border_style);
                        else
                            v.setBackgroundResource(R.drawable.lost_focus_border_style);
                    }
                });

            }
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////


    /////////////////// sudokoBoard Method ////////////////////////////////////////

    public int[][] sudokoBoard(){       // Method for values for the 9*9 2-D array from the mainactivity layout

        int[][] board = new int[9][9];

        EditText[][] box = {{b11,b12,b13,b14,b15,b16,b17,b18,b19},
                {b21,b22,b23,b24,b25,b26,b27,b28,b29},
                {b31,b32,b33,b34,b35,b36,b37,b38,b39},
                {b41,b42,b43,b44,b45,b46,b47,b48,b49},
                {b51,b52,b53,b54,b55,b56,b57,b58,b59},
                {b61,b62,b63,b64,b65,b66,b67,b68,b69},
                {b71,b72,b73,b74,b75,b76,b77,b78,b79},
                {b81,b82,b83,b84,b85,b86,b87,b88,b89},
                {b91,b92,b93,b94,b95,b96,b97,b98,b99}};

        for(int i = 0; i < 9; i++){

            for(int j = 0; j < 9; j++){

                if(box[i][j].getText().toString().trim().equals(""))
                    board[i][j] = 0;
                else
                    board[i][j] = Integer.parseInt(box[i][j].getText().toString());

            }
        }

        return board;
    }

    //////////////////////////////////////////////////////////////////////////////////


    /////////////////////// letsStart Method ///////////////////////////////////

    public void letsStart(View v){          // Gets called when 'Solve Btn' is pressed

        int[][] board = this.sudokoBoard();// Gets the 2-D array with the user input values

        if(this.validateSudoko(board)) {
            boolean result = this.solveSudoko(board);
            if (result)
                Toast.makeText(this, "Yipee!!! Got the solution for YOU...", Toast.LENGTH_SHORT).show();
        }
    }

    ////////////////////////////////////////////////////////////////////////////

    public boolean validateSudoko(int[][] board){

        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, sev = 0, eig = 0, nine = 0;
        int m = 0; int n = 3; int k = 0; int l = 3; int count = 1;

        for(int i = 0; i < 9; i++) {        // checking validity of ROW elements
            for(int j = 0; j < 9; j++) {

                int a = board[i][j];

                switch(a) {
                    case 1: one++; break;
                    case 2: two++; break;
                    case 3: three++; break;
                    case 4: four++; break;
                    case 5: five++; break;
                    case 6: six++; break;
                    case 7: sev++; break;
                    case 8: eig++; break;
                    case 9: nine++; break;
                    default:
                }

                if(one > 1 || two > 1 || three >1 || four >1 || five > 1 || six > 1 || sev > 1 || eig > 1 || nine > 1) {
                    Toast.makeText(this, "A Row contains a duplicate element", Toast.LENGTH_LONG).show();
                    return false;
                }
            }
            one = 0; two = 0; three = 0; four = 0; five = 0; six = 0; sev = 0; eig = 0; nine = 0;

        }

            for (int i = 0; i < 9; i++) {                // Checking validity of the column elements
                for (int j = 0; j < 9; j++) {

                    int a = board[j][i];

                    switch (a) {
                        case 1: one++;break;
                        case 2: two++;break;
                        case 3: three++;break;
                        case 4: four++;break;
                        case 5: five++;break;
                        case 6: six++;break;
                        case 7: sev++;break;
                        case 8: eig++;break;
                        case 9: nine++; break;
                        default:
                    }

                    if (one > 1 || two > 1 || three > 1 || four > 1 || five > 1 || six > 1 || sev > 1 || eig > 1 || nine > 1) {
                        Toast.makeText(this, " A Column contains a duplicate element", Toast.LENGTH_LONG).show();
                        return false;
                    }
                }
                one = 0; two = 0; three = 0; four = 0; five = 0; six = 0; sev = 0; eig = 0; nine = 0;

            }
            // checking for the small boxes
        while(count <= 9){
        for(int i = m; i < n; i++){
            for(int j = k; j < l; j++){

                int a = board[i][j];

                switch (a) {
                    case 1: one++;break;
                    case 2: two++;break;
                    case 3: three++;break;
                    case 4: four++;break;
                    case 5: five++;break;
                    case 6: six++;break;
                    case 7: sev++;break;
                    case 8: eig++;break;
                    case 9: nine++; break;
                    default:
                }

                if (one > 1 || two > 1 || three > 1 || four > 1 || five > 1 || six > 1 || sev > 1 || eig > 1 || nine > 1) {
                    Toast.makeText(this, " A Small Box contains a duplicate element", Toast.LENGTH_LONG).show();
                    return false;
                }
            }

        }
            one = 0; two = 0; three = 0; four = 0; five = 0; six = 0; sev = 0; eig = 0; nine = 0;
            count++;

            switch(count){
                case 2:
                    m = 0; n = 3; k = 3; l = 6;
                    break;
                case 3:
                    m = 0; n = 3; k = 6; l = 9;
                    break;
                case 4:
                    m = 3; n = 6; k = 0; l = 3;
                    break;
                case 5:
                    m = 3; n = 6; k = 3; l = 6;
                    break;
                case 6:
                    m = 3; n = 6; k = 6; l =9;
                    break;
                case 7:
                    m = 6; n = 9; k = 0; l = 3;
                    break;
                case 8:
                    m = 6; n = 9; k = 3; l = 6;
                    break;
                case 9:
                    m = 6; n = 9; k = 6; l = 9;
                default:
            }
        }

            return true;
        }

    //////////////// solveSudoko Method solves the solves and provide us with a solution if any //////////////////

    public boolean solveSudoko(int[][] board) {

        // base case
        // If none of the cell is element is zero;
        if (isAnyElementZero(board)) {

            // print the solved array(Suduko solution)

            EditText[][] box = {{b11,b12,b13,b14,b15,b16,b17,b18,b19},
                    {b21,b22,b23,b24,b25,b26,b27,b28,b29},
                    {b31,b32,b33,b34,b35,b36,b37,b38,b39},
                    {b41,b42,b43,b44,b45,b46,b47,b48,b49},
                    {b51,b52,b53,b54,b55,b56,b57,b58,b59},
                    {b61,b62,b63,b64,b65,b66,b67,b68,b69},
                    {b71,b72,b73,b74,b75,b76,b77,b78,b79},
                    {b81,b82,b83,b84,b85,b86,b87,b88,b89},
                    {b91,b92,b93,b94,b95,b96,b97,b98,b99}};

            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {

                    box[row][col].setText(Integer.toString(board[row][col]));

                }

            }

            return true;
        }
        // Recursive case

        int row = row_num(board);			// getting the row and column number of a unassigned cell
        int col = col_num(board);

        for (int num = 1; num <= 9; num++) {		// for inserting possible values i.e from 1-9

            if (isSafe(board, row, col, num)) {		// checking if a num is allowed at this position or not
                board[row][col] = num;				// inserts if the present situation of the board permits

                boolean thikTha = solveSudoko(board);		// recurse to find the next unassigned cell
                if (thikTha) {
                    return true;
                }

                board[row][col] = 0;	// backtrack if the previous call returns a false
            }
        }

        return false;		// returns if none of the number can be placed at that particular cell

    }

    ////////////////////////////////////////////////////////////////////////////////////////////

    ////////////// Method to find the row number of the unassigned cell /////////////////////////////

    public int row_num(int[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0)
                    return row;
            }
        }
        return 0;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    /////////////// Method to find the column number of the unassigned cell /////////////////

    public int col_num(int[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0)
                    return col;
            }
        }
        return 0;
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    /////////////// Method to find if a unassigned cell is remaining in the board or not /////////////////

    public boolean isAnyElementZero(int[][] board) { // base case helper function

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0)
                    return false;
            }
        }
        return true;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////// This method find if a allowed number is safe to be placed or not ///////////////////////////

    public boolean isSafe(int[][] board, int i, int j, int val) { // Implements the bounding functions

        // Checking for the row elements
        for (int col = 0; col < 9; col++) {
            if (board[i][col] == val)
                return false;

        }

        // Checking for the column elements
        for (int row = 0; row < 9; row++) {
            if (board[row][j] == val)
                return false;
        }

        // Checking the small boxes elements
        if (j >= 0 && j < 3) { // For first vertical column block

            if (i >= 0 && i < 3) { // Checking first block

                for (int row = 0; row < 3; row++) {
                    for (int col = 0; col < 3; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }

            if (i >= 3 && i < 6) { // Checking the second block

                for (int row = 3; row < 6; row++) {
                    for (int col = 0; col < 3; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }

            if (i >= 6 && i < 9) { // Checking the Third block

                for (int row = 6; row < 9; row++) {
                    for (int col = 0; col < 3; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }
        }

        if (j >= 3 && j < 6) { // For second vertical column block

            if (i >= 0 && i < 3) { // Checking first block

                for (int row = 0; row < 3; row++) {
                    for (int col = 3; col < 6; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }

            if (i >= 3 && i < 6) { // Checking the second block

                for (int row = 3; row < 6; row++) {
                    for (int col = 3; col < 6; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }

            if (i >= 6 && i < 9) { // Checking the Third block

                for (int row = 6; row < 9; row++) {
                    for (int col = 3; col < 6; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }
        }

        if (j >= 6 && j < 9) { // For Third vertical column block

            if (i >= 0 && i < 3) { // Checking first block

                for (int row = 0; row < 3; row++) {
                    for (int col = 6; col < 9; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }

            if (i >= 3 && i < 6) { // Checking the second block

                for (int row = 3; row < 6; row++) {
                    for (int col = 6; col < 9; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }

            if (i >= 6 && i < 9) { // Checking the Third block

                for (int row = 6; row < 9; row++) {
                    for (int col = 6; col < 9; col++) {
                        if (board[row][col] == val)
                            return false;
                    }
                }
            }
        }

        return true;
    }

    public void resetBtn(View v){

        EditText[][] box = {{b11,b12,b13,b14,b15,b16,b17,b18,b19},
                {b21,b22,b23,b24,b25,b26,b27,b28,b29},
                {b31,b32,b33,b34,b35,b36,b37,b38,b39},
                {b41,b42,b43,b44,b45,b46,b47,b48,b49},
                {b51,b52,b53,b54,b55,b56,b57,b58,b59},
                {b61,b62,b63,b64,b65,b66,b67,b68,b69},
                {b71,b72,b73,b74,b75,b76,b77,b78,b79},
                {b81,b82,b83,b84,b85,b86,b87,b88,b89},
                {b91,b92,b93,b94,b95,b96,b97,b98,b99}};

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                box[row][col].setText("");

            }

        }
    }
}
