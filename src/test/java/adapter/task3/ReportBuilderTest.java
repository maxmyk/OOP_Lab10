package adapter.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportBuilderTest {
    @Test
    public void testRB() {
        Database db = new Database();
        ReportBuilder rb = new ReportBuilder(db);
        assertTrue(rb instanceof ReportBuilder);
    }
}