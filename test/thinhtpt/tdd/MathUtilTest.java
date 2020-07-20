/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thinhtpt.tdd;

import static thinhtpt.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MathUtilTest {

    public MathUtilTest() {
    }

    @Test //báo cho JVM biết đây là hàm main, trong hàm này chứa các lệnh để chưa các code chính của mình phía MathUtil, ta test các tình huống thành công: 
    //cF(5) ---> 120
    public void testSuccessfullKey() {
        assertEquals(30, 30);
        //tao kì vọng có 30 xem mày đưa vào thực tế là bao nhiêu
        // 50 :
        //nếu 2 đứa khớp nhau, mày xử lí như dự kiến, đèn xanh, thông đường
        //ko khớp, ko như dự kiến : đèn đỏ ---> toang code mày
        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));
        assertEquals(1, computeFactorial(1));
        assertEquals(1, computeFactorial(0));
        assertEquals(2, computeFactorial(2));
        //muốn xanh: all xanh, nếu tất cả xanh, 1 đỏ ---> đỏ 
    }

    @Test(expected = IllegalArgumentException.class) //annotation, mốt dấu hiệu để báo cho JVM và thư viện.jar liên quan biết để làm cái gì
    //hàm này chứa các tình huống cà chớn, vd cf(-5), cf(16)
    public void testFailedCase() {
        //tao kì vọng mày ném ra ngoại lệ thì coi như code tao ngon :3, vì -5 éo tính dc, phải chửi hoyyyyy
        //ngoại lệ ko phải là 1 value để có thể so sánh dc, nên mình hổng có xài hàm assesrtEquals() dc vì hàm này cần 2 value expected và actual
        //trong khi đó ngoại lệ ko ohải là actual value để so sánh
        //ta phải xài chiêu khác khi bắt ngoại lệ coi có đúng là ngoại lệ mình cần hem ?? :>
        computeFactorial(-5);
        computeFactorial(16); // giai thừa tăng rất nhanh, không chơi quá 15
    }
    //code có thể bị lỗi nhưng Clean And Build luôn ra file.jar nếu code ko sai syntax
    //----> nguy hiểm
    //----> disable Clean And Build khi test còn màu đỏ
    //----> TỨC LÀ CÒN ERROR LOGIC
    //NHỚ 2 con số: 1005 NetBeans 8, 1204: NetBeans 10 Up
    //khi chơi với AntMan
}
