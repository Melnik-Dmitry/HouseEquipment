package by.epam.javawebtraining.melnik.task01.serialization;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class ProjectSerialization<T> {

	 public void writeProjectEntity(String filePath, T equipment) {

		  ObjectOutputStream objectOutputStream = null;

		  try {
				objectOutputStream =
						  new ObjectOutputStream (
									 new BufferedOutputStream (
												new FileOutputStream ( filePath )
									 )
						  );

				objectOutputStream.writeObject ( equipment );
		  } catch (IOException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } finally {
				if (objectOutputStream != null) {
					 try {
						  objectOutputStream.flush ();
						  objectOutputStream.close ();
					 } catch (IOException e) {
						  appLogger.error ( e );
						  e.printStackTrace ();
					 }
				}
		  }
	 }

	 public void writeProjectEntityArray(String filePath, T[] equipments) {

		  ObjectOutputStream objectOutputStream = null;

		  try {
				objectOutputStream =
						  new ObjectOutputStream (
									 new BufferedOutputStream (
												new FileOutputStream ( filePath )
									 )
						  );

				objectOutputStream.writeObject ( equipments );
		  } catch (IOException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } finally {
				if (objectOutputStream != null) {
					 try {
						  objectOutputStream.flush ();
						  objectOutputStream.close ();
					 } catch (IOException e) {
						  appLogger.error ( e );
						  e.printStackTrace ();
					 }
				}
		  }
	 }
}

