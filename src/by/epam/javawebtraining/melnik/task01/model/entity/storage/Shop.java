package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.validation.CheckBuildingParameters;

import java.util.Objects;

public class Shop extends Building {

    private ShopSection microwaveSection;
    private ShopSection multicookerSection;
    private ShopSection toastSection;

    public Shop() {
        super();
        microwaveSection = new ShopSection();
        multicookerSection = new ShopSection();
        toastSection = new ShopSection();
    }

    public Shop(HouseEquipment[] houseEquipments) {
        super(houseEquipments);
        microwaveSection = new ShopSection();
        multicookerSection = new ShopSection();
        toastSection = new ShopSection();
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

    public void setMicrowaveSection(ShopSection microwaveSection) throws InvalidParameterException {

        new CheckBuildingParameters().IsNull(microwaveSection);
        this.microwaveSection = microwaveSection;
    }

    public void setMulticookerSection(ShopSection multicookerSection) throws InvalidParameterException {

        new CheckBuildingParameters().IsNull(multicookerSection);
        this.multicookerSection = multicookerSection;
    }

    public void setToastSection(ShopSection toastSection) throws InvalidParameterException {

        new CheckBuildingParameters().IsNull(toastSection);
        this.toastSection = toastSection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        if (!super.equals(o)) return false;
        Shop shop = (Shop) o;
        return microwaveSection.equals(shop.microwaveSection) &&
                multicookerSection.equals(shop.multicookerSection) &&
                toastSection.equals(shop.toastSection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), microwaveSection, multicookerSection, toastSection);
    }

    @Override
    public String toString() {
        return "Shop{" + super.toString() + "}";
    }
}
