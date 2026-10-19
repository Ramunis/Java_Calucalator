package com.example.javacalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    double accum=0;
    Integer opper=0;
    Integer f =0;
    @FXML
    private Label welcomeText;

    @FXML
    private TextField tex;


    @FXML
    protected void onHelloButtonClick() {

       // welcomeText.setText("Welcome to JavaFX Application!");

        if (f==0)
        {
            opper=0;
       }
        else
       {
            DoOpper();
            opper=0;
            f=0;
        }
    }

    @FXML
    protected void onCommandCClick() {

        tex.setText("0");
        accum=0;
        opper=0;
        f=0;
    }


    @FXML
    protected void onCommandPlusClick() {

        if (f==0)
        {
            opper=1;
        }
        else
        {
            DoOpper();
            opper=1;
            f=0;
        }

    }

    @FXML
    protected void onCommandMinusClick() {

        if (f==0)
        {
            opper=2;
        }
        else
        {
            DoOpper();
            opper=2;
            f=0;
        }

    }

    @FXML
    protected void onCommandMultipleClick() {

        if (f==0)
        {
            opper=3;
        }
        else
        {
            DoOpper();
            opper=3;
            f=0;
        }

    }

    @FXML
    protected void onCommandDivideClick() {

        if (f==0)
        {
            opper=4;
        }
        else
        {
            DoOpper();
            opper=4;
            f=0;
        }

    }

    @FXML
    protected void onCommandSquareClick() {

        //if (f==0)
        //{
        //    opper=5;
        //}
        //else
        //{
        //    DoOpper();
        //    opper=5;
        //    f=0;
        //}
        if (accum!=0) {
            tex.setText(String.valueOf(Math.pow(accum,2)));
            accum = Math.pow(accum,2);

        }
        else
        {
            double numb = 0;

            numb = Double.parseDouble(tex.getText());

            tex.setText(String.valueOf(Math.pow(numb,2)));
            accum = Math.pow(numb,2);
        }

    }

    @FXML
    protected void onCommandRootClick() {

        //if (f==0)
        //{
        //    opper=6;
        //}
        //else
        //{
           // DoOpper();
          //  opper=6;
            //f=0;
        //}
        //case 5: accum = Math.pow(numb,2); break;
        //case 6: accum = Math.sqrt(numb); break;

        if (accum!=0) {
            tex.setText(String.valueOf(Math.sqrt(accum)));
            accum = Math.sqrt(accum);

        }
        else
        {
            double numb = 0;

            numb = Double.parseDouble(tex.getText());

            tex.setText(String.valueOf(Math.sqrt(numb)));
            accum = Math.sqrt((numb));
        }

    }

    @FXML
    protected void onCommandZClick() {

        if (tex.getText()=="0")
        {
            tex.setText("0.");
            f=1;
        }
        if (tex.getText() != "0")
        {
            tex.setText(tex.getText()+".");
        }

    }

    @FXML
    protected void onCommand0Click() {

        if (f==0)
        {
            tex.setText("0");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"0");
            }
        }

    }

    @FXML
    protected void onCommand1Click() {

        if (f==0)
        {
            tex.setText("1");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"1");
            }
            else
            {
                tex.setText("1");
            }
        }

    }

    @FXML
    protected void onCommand2Click() {

        if (f==0)
        {
            tex.setText("2");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"2");
            }
            else
            {
                tex.setText("2");
            }
        }

    }

    @FXML
    protected void onCommand3Click() {

        if (f==0)
        {
            tex.setText("3");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"3");
            }
            else
            {
                tex.setText("3");
            }
        }

    }

    @FXML
    protected void onCommand4Click() {

        if (f==0)
        {
            tex.setText("4");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"4");
            }
            else
            {
                tex.setText("4");
            }
        }

    }

    @FXML
    protected void onCommand5Click() {

        if (f==0)
        {
            tex.setText("5");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"5");
            }
            else
            {
                tex.setText("5");
            }
        }

    }

    @FXML
    protected void onCommand6Click() {

        if (f==0)
        {
            tex.setText("6");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"6");
            }
            else
            {
                tex.setText("6");
            }
        }

    }

    @FXML
    protected void onCommand7Click() {

        if (f==0)
        {
            tex.setText("7");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"7");
            }
            else
            {
                tex.setText("7");
            }
        }

    }

    @FXML
    protected void onCommand8Click() {

        if (f==0)
        {
            tex.setText("8");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"8");
            }
            else
            {
                tex.setText("8");
            }
        }
    }

    @FXML
    protected void onCommand9Click() {

        if (f==0)
        {
            tex.setText("9");
            f=1;
        }
        else
        {
            if (tex.getText() != "0")
            {
                tex.setText(tex.getText()+"9");
            }
            else
            {
                tex.setText("9");
            }
        }
    }

    public void DoOpper()
    {
        double numb=0;

        numb = Double.parseDouble(tex.getText());

        switch(opper){
            case 0: accum = numb; break;
            case 1: accum = accum+numb; break;
            case 2: accum = accum-numb; break;
            case 3: accum = accum*numb; break;
            case 4: accum = accum/numb; break;
            //case 5: accum = Math.pow(numb,2); break;
            //case 6: accum = Math.sqrt(numb); break;
        }
        tex.setText(String.valueOf(accum));
    }

}