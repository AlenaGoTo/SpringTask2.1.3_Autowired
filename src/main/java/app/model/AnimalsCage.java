package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog") // для связывания по имени
    private Animal animal; // для связывания по имени еще можно заменить имя переменной на cat или dog

    @Autowired
    private Timer timer; // автоматическое связывание с бином таймера

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime()); // замена вместо new Timer().getTime()
        System.out.println("________________________");
    }
    public Timer getTimer() { // для теста
        return timer;
    }
}
