package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PosterManagerTest {

    @Test

    public void addNewMovie() {

        PosterManager manager = new PosterManager();

        manager.add("Блэдшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");


        String[] expected = {"Блэдшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли.Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }



    @Test

    public void moreThanTheLimit() {

        PosterManager manager = new PosterManager();

        manager.setLimit(3);

        manager.add("Блэдшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void lessThanTheLimit() {

        PosterManager manager = new PosterManager();

        manager.setLimit(9);

        manager.add("Блэдшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка","Джентельмены","Отель Белград","Вперёд","Блэдшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void equalThanTheLimit() {

        PosterManager manager = new PosterManager();

        manager.setLimit(7);

        manager.add("Блэдшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка","Джентельмены","Отель Белград","Вперёд","Блэдшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void noLimit() {

        PosterManager manager = new PosterManager();



        manager.add("Блэдшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка","Джентельмены","Отель Белград"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
