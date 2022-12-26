package task3;

import adapter.task3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {
    private DataBase db1;
    private БазаДаних db2;
    private Authorization auth1;
    private Авторизація auth2;

    @BeforeEach
    public void init() {
        db1 = new DataBase();
        db2 = new БазаДаних();
        auth1 = new Authorization();
        auth2 = new Авторизація();
    }

    @Test
    public void testDb() {
        assertEquals(db1.getUserData(), db2.отриматиДаніКористувача());
        assertEquals(db1.getStaticData(), db2.отриматиСтатистичніДані());
    }

    @Test
    public void testAuth() {
        assertEquals(auth1.authorize(db1), auth2.авторизуватися(db2));
    }
}

