package com.sudokuapp.game;

public class Grid implements Event{
    private int mHideTable[][]          ;
    private int mVisibleTable[][]       ;
    private int i,j,k                   ;


    public Grid(){

        mHideTable = new int[10][10];
        i = 1;
        j = 1;
        k = 1;

        for (i = 1; i < 10; i++){
            for (j = 1; j < 10; j++){
                if (k > 9 & i !=1) {
                    k = 4;
                    if (i == 4)
                        k = 2;
                    if (i == 7)
                        k = 3;
                }
                mHideTable[i][j] = k++;
            }
        }

    }

    public int[][] getmHideTable(){
        return this.mHideTable;
    }

    public int[][] getmVisibleTable(){
        return this.mVisibleTable;
    }

    private void transTable(int mTable[][]){

    }

    private void swapArea(int mArea[][]){

    }

    private void buildVisibleTable(int Table[][]){

    }

    @Override
    public void update() {

    }
}
