package by.epam.javawebtraining.melnik.task01.serialization;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectSerialization <T> {

    public void writeProjectEntity(String filePath, T equipment) {

        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream =
                    new ObjectOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(filePath)
                            )
                    );

            objectOutputStream.writeObject(equipment);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.flush();
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void writeProjectEntityArray (String filePath, T [] equipments) {

        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream =
                    new ObjectOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(filePath)
                            )
                    );

            objectOutputStream.writeObject(equipments);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.flush();
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

