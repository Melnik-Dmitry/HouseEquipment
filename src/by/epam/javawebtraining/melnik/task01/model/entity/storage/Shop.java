package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop extends ComercialBuilding {

    private ShopSection microwaveSection;
    private ShopSection multicookerSection;
    private ShopSection toastSection;

    public Shop() {
    }

    public Shop(HouseEquipment[] houseEquipments) {
        super ( new ArrayList<> ( Arrays.asList ( houseEquipments ) ) );
        microwaveSection = new ShopSection ();
        multicookerSection = new ShopSection ();
        toastSection = new ShopSection ();
    }

    public Shop(List<HouseEquipment> houseEquipments) {
        super ( houseEquipments );
    }

    public ShopSection getMicrowaveSection() {
        return microwaveSection;
    }

    public ShopSection getMulticookerSection() {
        return multicookerSection;
    }

    public ShopSection getToastSection() {
        return toastSection;
    }

    public void setMicrowaveSection(ShopSection microwaveSection) {
        this.microwaveSection = microwaveSection;
    }

    public void setMulticookerSection(ShopSection multicookerSection) {
        this.multicookerSection = multicookerSection;
    }

    public void setToastSection(ShopSection toastSection) {
        this.toastSection = toastSection;
    }

    @Override
    public String toString() {
        return "Shop{" + super.toString () + "}";
    }
}
