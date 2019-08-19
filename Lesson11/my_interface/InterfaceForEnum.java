package by.it_academy.Lesson11.my_interface;

import java.io.Serializable;

public interface InterfaceForEnum extends Serializable {
    String getName();
    int getStartOfRelease();
    int getPrice();
    int getEndOfRelease();
}
