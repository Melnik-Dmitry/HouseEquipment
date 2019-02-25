package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;
import by.epam.javawebtraining.melnik.task01.view.Print;

public class PrintCreator {

    public static Print createPrint() {
        return new ConsolePrint ();
    }
}
