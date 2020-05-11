package org.tyaa.designpatterns.creational.abstractfactory;

import org.tyaa.designpatterns.creational.abstractfactory.factory.CocaColaFactory;
import org.tyaa.designpatterns.creational.abstractfactory.factory.PepsiFactory;

public class Program
{
    public static void main(String[] args)
    {
        Client client = null;

        client = new Client(new CocaColaFactory());
        client.run();

        client = new Client(new PepsiFactory());
        client.run();

        // Task
        // Создать третий экземпляр Client,
        // настроить его для работы с банками и газировкой Sprite,
        // для этого предварительно создать классы:
        // 1. Фабрика Sprite
        // 2. Бутылка Sprite
        // 3. Вода Sprite,
        // и затем вызвать метод Run()
    }
}
