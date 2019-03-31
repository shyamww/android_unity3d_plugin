package com.btp.mediaplayerlibrary;

import android.util.Log;

import com.unity3d.player.UnityPlayer;

public class TutorialClass {

    public void lnalm(){
        Log.d("Unity", "Native Logcat Message");
    }
    public void LogNumberSentFromUnity(int number){
        Log.d("Unity", "Number passed is " + number);
    }
    public int AddNumber(int number){
        number +=5;
        return number;
    }

    public void CallAorB(String value)
    {
        if (value.equals("A")) {
            DoSomethingA();
        }
        else {
            DoSomrthingB();
        }
    }

    public void DoSomethingA(){
        //UnityPlayer.UnitySendMessage("MyGameObject", "ChangeTextToA", "1");
        UnityPlayer.UnitySendMessage( "MyGameObject", "ChangeTextToA", "1");
    }

    public void DoSomrthingB(){
        //UnityPlayer.UnitySendMessage("MyGameObject", "ChangeTextToB", "2");
        UnityPlayer.UnitySendMessage( "MyGameObject", "ChangeTextToB", "2");

    }
}
