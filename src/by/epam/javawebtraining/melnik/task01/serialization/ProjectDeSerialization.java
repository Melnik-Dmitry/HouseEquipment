package by.epam.javawebtraining.melnik.task01.serialization;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class ProjectDeSerialization<T> {

	 public T readProjectEntity(String filePath) {

		  T o = null;
		  ObjectInputStream objectOutputStream = null;
		  try {
				objectOutputStream =
						  new ObjectInputStream (
									 new BufferedInputStream (
												new FileInputStream ( filePath )
									 )
						  );

				o = (T) objectOutputStream.readObject ();
		  } catch (IOException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (ClassNotFoundException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } finally {
				if (objectOutputStream != null) {
					 try {
						  objectOutputStream.close ();
					 } catch (IOException e) {
						  appLogger.error ( e );
						  e.printStackTrace ();
					 }
				}
		  }
		  return o;
	 }

	 public T[] readProjectEntityArray(String filePath) {

		  T[] o = null;
		  ObjectInputStream objectOutputStream = null;
		  try {
				objectOutputStream =
						  new ObjectInputStream (
									 new BufferedInputStream (
												new FileInputStream ( filePath )
									 )
						  );

				o = (T[]) objectOutputStream.readObject ();
		  } catch (IOException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (ClassNotFoundException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } finally {
				if (objectOutputStream != null) {
					 try {
						  objectOutputStream.close ();
					 } catch (IOException e) {
						  appLogger.error ( e );
						  e.printStackTrace ();
					 }
				}
		  }
		  return o;
	 }
}

