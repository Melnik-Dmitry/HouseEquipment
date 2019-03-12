package by.epam.javawebtraining.melnik.task01.model.exception.technicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class EndArrayException extends ProjectException {

	 public EndArrayException() {
	 }

	 public EndArrayException(String message) {
		  super ( message );
	 }

	 public EndArrayException(Throwable cause) {
		  super ( cause );
	 }
}
