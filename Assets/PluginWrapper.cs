using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class PluginWrapper : MonoBehaviour
{
    public Text myText;
    private AndroidJavaObject javaClass;

    // Start is called before the first frame update
    void Start()
    {
        javaClass = new AndroidJavaObject("com.btp.mediaplayerlibrary.TutorialClass");
        javaClass.Call("lnalm");
        javaClass.Call("LogNumberSentFromUnity", 1000);
        myText.text = javaClass.Call<int>("AddNumber", 10).ToString();

    }

    // Update is called once per frame
    void Update()
    {
        
    }
    public void CallJavaFunction(string value)
    {
        javaClass.Call("CallAorB", value);
    }

    public void ChangeTextToA(string value) {
        myText.text = "A" + value;
    }
    public void ChangeTextToB(string value)
    {
        myText.text = "B" + value;
    }
}
