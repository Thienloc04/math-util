package com.thienloc.mathutil.core.test;

import com.thienloc.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //Test case structure: ID, Description. Steps/Producedures
    //                      Expected Result, Status (Passed, Failed
    //                      Bug ID (Bugzilla, Jira)

    @Test
    public void tesFactorialGivenWrongArguementsThrowException() {

        //MathUtility.getFactrial(-5); Chưa bắt xem có ngoại lệ như kì vọng hay ko
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactrial(-1);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactrial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactrial(-100);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactrial(21);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactrial(22);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactrial(50);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactrial(100);});

    }

    //Test case #4: check getFactorial() with n = -1 -2 -3 -4 -5 21 22 23 24
    @Test
    public void tesFactorialGivenWrongArguementMinus5ThrowException() {

        //MathUtility.getFactrial(-5); Chưa bắt xem có ngoại lệ như kì vọng hay ko
        assertThrows(IllegalArgumentException.class,
                () -> {
                    MathUtility.getFactrial(-5);
                });

    }   //Thấy ngoại lệ mừng rơi nước mắt
    //Vì hàm thiết kế rằng đưa n < 0 hoặc n > 20 thì ngoại lệ phải đc ném ra
    //Vậy nếu hàm ném ngoại lệ khi n = -5 rõ ràng hàm đúng, hàm đúng thì phải xanh
    //Xanh vì hàm trả về ngoại lệ đúng như kì vọng

    //Test case #3 (gộp): check getFactorial() with n = 2 3 4 5 6...
    @Test
    public void tesFactorialGivenRightArguementsReturnsWell(){

        assertEquals(1, MathUtility.getFactrial(0));
        assertEquals(1, MathUtility.getFactrial(1));
        assertEquals(2, MathUtility.getFactrial(2));
        assertEquals(6, MathUtility.getFactrial(3));
        assertEquals(24, MathUtility.getFactrial(4));
        assertEquals(120, MathUtility.getFactrial(5));
        assertEquals(720, MathUtility.getFactrial(6));
    }   //bad smells = đoạn code bốc mùi ( Robert c. Martin - Clean code)
        //code bị lặp lại, trộn lộn xộn test data và lệnh kiểm thử
    //ta cần tinh chỉnh, tối ưu code - REFACTOR, REFACTORING

    //TEST CASE #2:  check getFactorial() with n = 1

    @Test
    public void tesFactorialGivenRightArguement1ReturnsWell(){

        assertEquals(1, MathUtility.getFactrial(1));
    }

    //Test case #1: check getFactorial() with n = 0;
    //....



    @Test
    public void tesFactorialGivenRightArguement0ReturnsWell(){
        long expectedValue = 1; //hy vọng 0! trả về 1
        long actualValue = MathUtility.getFactrial(0); //giá trị hàm trả về 10

        //SO SÁNH 2 THẰNG EXPECTED VS. ACTUAL
        assertEquals(expectedValue,actualValue);
    }



}