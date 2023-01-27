package application;

import application.view.InitialView;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        InitialView.startProgram();
    }
}