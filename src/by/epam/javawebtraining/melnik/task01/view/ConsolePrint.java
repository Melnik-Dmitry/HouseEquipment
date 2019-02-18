package by.epam.javawebtraining.melnik.task01.view;

public class ConsolePrint implements Print{

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
