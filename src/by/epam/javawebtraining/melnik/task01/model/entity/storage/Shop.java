package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop extends ComercialBuilding {

    private ShopSection microwaveSection;
    private ShopSection multicookerSection;
    private ShopSection toastSection;

    public Shop() {
        microwaveSection = new ShopSection();
        multicookerSection = new ShopSection();
        toastSection = new ShopSection();
    }

    public Shop(HouseEquipment[] houseEquipments) {
        super(new ArrayList<>(Arrays.asList(houseEquipments)));
        microwaveSection = new ShopSection();
        multicookerSection = new ShopSection();
        toastSection = new ShopSection();
    }

    public Shop(List<HouseEquipment> houseEquipments) {
        super(houseEquipments);
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

    public void setMicrowaveSection(ShopSection microwaveSection) throws NullLinkException {

        if (microwaveSection == null) {
            throw new NullLinkException();
        }
        this.microwaveSection = microwaveSection;
    }

    public void setMulticookerSection(ShopSection multicookerSection) throws NullLinkException {

        if (multicookerSection == null) {
            throw new NullLinkException();
        }
        this.multicookerSection = multicookerSection;
    }

    public void setToastSection(ShopSection toastSection) throws NullLinkException {

        if (toastSection == null) {
            throw new NullLinkException();
        }
        this.toastSection = toastSection;
    }

    @Override
    public String toString() {
        return "Shop{" + super.toString() + "}";
    }
}
