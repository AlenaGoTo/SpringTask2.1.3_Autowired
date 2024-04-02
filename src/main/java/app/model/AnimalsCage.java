package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired // автоматическое связывание с бином Animal
    @Qualifier("dog") // для связывания по имени, можно заменить имя переменной на cat или dog
    private Animal animal;

    @Autowired // автоматическое связывание с бином таймера
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime()); // замена вместо new Timer().getTime()
        System.out.println("________________________");
    }
    public Timer getTimer() { // для MainTest
        return timer;
    }
}
