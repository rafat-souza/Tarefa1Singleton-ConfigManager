package org.example;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private final Map<String, String> configs;

    private ConfigManager() {
        configs = new HashMap<>();
        configs.put("db.url", "jdbc:postgresql://localhost:5432/producao");
        configs.put("db.user", "admin");
    }

    private static class InstanceHolder {
        private static final ConfigManager INSTANCE = new ConfigManager();
    }

    public static ConfigManager getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public String getConfig(String key) {
        return configs.get(key);
    }

    public void setConfig(String key, String value) {
        configs.put(key, value);
    }
}