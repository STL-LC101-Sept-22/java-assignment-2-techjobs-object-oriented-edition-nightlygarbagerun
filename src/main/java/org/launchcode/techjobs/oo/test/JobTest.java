package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorTestsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3.getName() instanceof String);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer());
        assertEquals("Desert", testJob3.getLocation());
        assertEquals("Quality control", testJob3.getPositionType());
        assertEquals("Persistence", testJob3.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob3.equals(testJob4));
    }



}
