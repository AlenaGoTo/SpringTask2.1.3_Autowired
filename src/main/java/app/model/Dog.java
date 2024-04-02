package app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // можно использовать для подстановки бина dog в случае если есть несколько бинов одного типа animal
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
