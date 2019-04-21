package ITProjects;

public final class CalculatorController {

    public static void start() {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();

        theView.addSinusListener(new CalculateListener("sinus", theView, theModel));
        theView.addCosinusListener(new CalculateListener("cosinus", theView, theModel));
        theView.addTangensListener(new CalculateListener("tangens", theView, theModel));
        theView.addCotangensListener(new CalculateListener("cotangens", theView, theModel));
        theView.addArcSinusListener(new CalculateListener("arcsinus", theView, theModel));
        theView.addArcCosinusListener(new CalculateListener("arccosinus", theView, theModel));
        theView.addArcTangensListener(new CalculateListener("arctangens", theView, theModel));
        theView.addArcCotangensListener(new CalculateListener("arccotangens", theView, theModel));
    }

}