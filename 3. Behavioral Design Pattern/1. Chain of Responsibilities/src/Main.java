//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //corPattern
        //sabse pehle chain create kardo

        AbstractHandler pressureHandler = new PressureIssueHandler(null);
        EngineIssueHandler engineIssueHandler = new EngineIssueHandler(pressureHandler);
                       //request re4ady karo
        PressureIssueRequest pressureIssueRequest = new PressureIssueRequest();

        engineIssueHandler.handleRequest(pressureIssueRequest);

    }
}