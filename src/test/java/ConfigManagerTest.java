import org.example.ConfigManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConfigManagerTest {

    @Test
    void testSingletonReturnsSameInstance() {
        ConfigManager instance1 = ConfigManager.getInstance();
        ConfigManager instance2 = ConfigManager.getInstance();

        assertSame(instance1, instance2, "O padrão Singleton deve retornar a exata mesma instância em memória.");
    }

    @Test
    void testSetAndGetConfiguration() {
        ConfigManager config = ConfigManager.getInstance();
        config.setConfig("api.key", "12345XYZ");

        assertEquals("12345XYZ", config.getConfig("api.key"), "O valor retornado deve ser idêntico ao valor configurado.");
    }

    @Test
    void testDefaultConfigurationIsLoaded() {
        ConfigManager config = ConfigManager.getInstance();

        assertEquals("admin", config.getConfig("db.user"), "A configuração padrão deve ser carregada na inicialização.");
    }
}