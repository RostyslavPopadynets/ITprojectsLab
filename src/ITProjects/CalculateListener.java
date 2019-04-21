package ITProjects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateListener implements ActionListener {

    private final CalculatorView theView;
    private final CalculatorModel theModel;
    private final String name;

    public CalculateListener(String name, CalculatorView theView, CalculatorModel theModel) {
        this.name = name;
        this.theView = theView;
        this.theModel = theModel;
    }

    public void actionPerformed(ActionEvent e) {
        double number;

        try {
            number = theView.getNumber();
            switch (name) {
                case "sinus":
                    theModel.sinus(number);
                    theView.setResult(theModel.getResult());
                    break;
                case "cosinus":
                    theModel.cosinus(number);
                    theView.setResult(theModel.getResult());
                    break;
                case "tangens":
                    theModel.tangens(number);
                    theView.setResult(theModel.getResult());
                    break;
                case "cotangens":
                    theModel.cotangens(number);
                    theView.setResult(theModel.getResult());
                    break;
                case "arcsinus":
                    theModel.arcsinus(number);
                    theView.setResult(theModel.getResult());
                    break;
                case "arccosinus":
                    theModel.arccosinus(number);
                    theView.setResult(theModel.getResult());
                    break;
                case "arctangens":
                    theModel.arctangens(number);
                    theView.setResult(theModel.getResult());
                    break;
                case "arccotangens":
                    theModel.arccotangens(number);
                    theView.setResult(theModel.getResult());
                    break;
            }

        } catch (NumberFormatException ex) {
            theView.displayErrorMessage("Wrong data");
        }
    }

}