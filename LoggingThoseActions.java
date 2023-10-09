import java.util.*;
import java.io.*;

public class LoggingThoseActions {
    ArrayList<String> lines = new ArrayList<String>();
    Scanner console = new Scanner(System.in);
    File log;
    
    public static void main(String[] args) {
        new LoggingThoseActions().run();
    }
    
    private void run() {    
        System.out.println("""
            You have 3 options
            
                1) Add line
                2) View lines
                3) Delete line
            """);    
        chooseOption();
    }
    
    private void chooseOption() {        
        System.out.print("What do you want to do (0 to exit)? [1-3]: ");
        
        String choice = console.nextLine().strip();
		switch (choice) {
			case "0":
				break;
			case "1":
				addLine();
				break;
			case "2":
				viewLines();
				break;
			case "3":
				deleteLine();
				break;
			default:
				System.out.println("Input must be an integer between 0 and 3.");
				chooseOption();
        
    }
    
    private void addLine() {
        System.out.print("Write new line: ");
        String newLine = console.nextLine();
        lines.add(newLine);
        
    }
    
    private void viewLines() {
        
    }
    
    private void deleteLine() {
        
    }
}