package org.example;

public class Main {
    public static void main(String[] args) {
        ConfigManager config1 = ConfigManager.getInstance();
        System.out.println("URL do Banco Inicial: " + config1.getConfig("db.url"));

        ConfigManager config2 = ConfigManager.getInstance();
        config2.setConfig("app.timeout", "5000");

        System.out.println("Timeout acessado por config1: " + config1.getConfig("app.timeout"));

        System.out.println("As instâncias são iguais? " + (config1 == config2));
    }
}