package javaTester;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Topic_01_Data_Type {
    // Kiểu dữ kiệu trong Java - chia ra làm 2 nhóm

    // I - Kiểu dữ liệu nguyên thủy (Primitive Type)
    // 8 loại
    // Số nguyên : byte - short - int - long
    // Số nguyên đại diện cho kiểu số không có phần thập phân ( Ví dụ nhân viên trong 1cty/ học sinh trong 1 lớp/trường...)
    byte bNumber = 40 ;
    short sNumber = 2000;
    int iNumber = 16562637;
    long lNumber = 4425388;


    // Số thực : float - double
    // Số thực đại diện cho kiểu số có phần thập phân ( Ví dụ lương hoặc điểm số..)
    float fNumber = 9.5f;
    double dNumber = 83.700876d;
    // Kí tự : char - Đại diện cho 1 kí tự
    char c = 'M';
    char d = 'T';

    // Logic : boolean
    boolean status = true;

    // II- Kiểu dữ liệu tham chiếu (Reference Type)
    // Class
    FirefoxDriver firefoxDriver = new FirefoxDriver();
    Select select = new Select(firefoxDriver.findElement(By.className("")));
    Topic_01_Data_Type topic01 = new Topic_01_Data_Type();

    // Interface
    WebDriver driver;
    JavascriptExecutor jsExecutor;

    // Object
    Object name = "AutomationFC";

    // Array ( Kiểu nguyên thủy/ tham chiếu)
    int[] studentAge = {15, 20, 8};
    String[] studentName = {"AutomationTesting", " FC"};

    // Collection : List/ Set/ Queue
    List<String> studentAderess = new ArrayList<String>();
    List<String> studentCity = new LinkedList<>();
    List<String> studentPhone = new Vector<>();

    // String - Chuỗi kí tự
    String fullName = " Nguyễn Văn Trỗi";
    // Cách khai báo biến để lưu trữ 1 loại dữ liệu nào đó
    // Thứ nhất quan tâm tới Acess Modifier : Phạm vi truy cập ( Public/ Private/ protected/ default)
    // Thứ 2 : Kiểu dữ liệu
    // Thứ 3 : Tên biến
    // Thứ 4 : Giá trị của biến - gán vào với phép =
    // Nếu như không gán sẽ có giá trị mặc định bằng O hoặc null


}
