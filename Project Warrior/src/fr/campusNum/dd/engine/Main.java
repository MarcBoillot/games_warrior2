package fr.campusNum.dd.engine;

import fr.campusNum.dd.BDD.DataBase;
import fr.campusNum.dd.BDD.DataBaseException;


public class Main {
    public static void main(String[] args) throws DataBaseException {
        System.out.println("Début du jeu");
        Menu menu = new Menu();
        menu.createChar();
        DataBase.getHeroes();
    }
}