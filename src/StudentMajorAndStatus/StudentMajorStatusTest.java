package StudentMajorAndStatus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentMajorStatusTest {
    @Test
    public void testThatCharacterSetUp(){
        String result = StudentMajorStatus.studentMajorMethod("M1");
        assertEquals(result, "Mathematics freshman");
    }
    @Test
    public void testThatCharacter2(){
        String result = StudentMajorStatus.studentMajorMethod("M3");
        assertEquals("Mathematics junior", result);
    }
    @Test
    public void testThatCharacter3(){
        String result = StudentMajorStatus.studentMajorMethod("C4");
        assertEquals("Computer Science senior", result);
    }
    @Test
    public void testThatForInvalidCharacters(){
        String result = StudentMajorStatus.studentMajorMethod("T3");
        assertEquals("Invalid input", result);
    }
    @Test
    public void testCharacterIsWorking(){
        String result = StudentMajorStatus.studentMajorMethod("I4");
        assertEquals("Information Technology senior", result);
    }
    @Test
    public void testThatStatusAndMajorWillBeConvertedToUpperCaseToOutputMajorAndStatus(){
        String result = StudentMajorStatus.studentMajorMethod("i4");
        assertEquals("Information Technology senior", result);
    }
    @Test
    public void testSomething(){
        String result = StudentMajorStatus.studentMajorMethod("i6");
        assertEquals("Invalid input", result);
    }
}