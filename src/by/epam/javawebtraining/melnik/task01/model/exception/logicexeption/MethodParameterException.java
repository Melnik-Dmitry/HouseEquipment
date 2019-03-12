package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class MethodParameterException extends ProjectException {

//    "Method parameter isn't valid"

    public MethodParameterException() {
        super();
    }

    public MethodParameterException(String message) {
        super ( message );
    }
}
