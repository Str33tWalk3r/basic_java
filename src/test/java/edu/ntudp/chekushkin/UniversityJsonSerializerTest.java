package edu.ntudp.chekushkin;

import edu.ntudp.chekushkin.controller.factories.UniversityFactory;
import edu.ntudp.chekushkin.controller.json.UniversityJsonSerializer;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UniversityJsonSerializerTest extends TestCase {

    public static final String FILE_PATH = "test-university.json";

    public UniversityJsonSerializerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(UniversityJsonSerializerTest.class);
    }

    public void test() {
        var university = UniversityFactory.createTypicalUniversity();

        UniversityJsonSerializer.writeToFile(university, FILE_PATH);
        var newUniversity = UniversityJsonSerializer.readFromFile(FILE_PATH);

        assertEquals(university.getName(), newUniversity.getName());
    }
}
