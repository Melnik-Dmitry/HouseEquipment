package by.epam.javawebtraining.melnik.task01.util;

public class EquipmentCreatorOnWarehouse {

//    private static MyList<HouseEquipment> createEquipmentList(int amountOfCreatedEquipment) {

//        MyList<HouseEquipment> equipmentList = new ArrayList<>(amountOfCreatedEquipment);
//
//        for (int i = 0; i < amountOfCreatedEquipment; i++) {
//            HouseEquipmentType houseEquipmentType = RandomTypeOfHouseEquipment.makeHouseEquipmentType();
//            HouseEquipment addedEquipment = CreatorHouseEquipment.createHouseEquipment(houseEquipmentType);
//            equipmentList.add(addedEquipment);
//        }
//        return equipmentList;
//    }
//
//    public static void addEquipmentOnWarehose(Building warehouse, int amountOfEquipment)
//            throws NullLinkException, MethodParameterException {
//
//        new CheckBuildingParameters().IsNull(warehouse);
//        if (amountOfEquipment <= 0) {
//            throw new MethodParameterException();
//        }
//
//        for (HouseEquipment he : createEquipmentList(amountOfEquipment)) {
//            try {
//                warehouse.getEquipments ().add( he);
//            } catch (NullLinkException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
