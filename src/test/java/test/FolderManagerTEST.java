package test;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sie.mycompany.auxiliares.FolderManager;

/**
 *
 * @author lu
 */
public class FolderManagerTEST {

    public FolderManagerTEST() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void folderManager() throws IOException {
        FolderManager manager = new FolderManager();
        manager.crear("peterfolder", "vanellope.txt", "Probando si hay contenido");
    }

}
