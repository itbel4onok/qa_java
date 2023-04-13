import com.example.Lion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionConstructTest {
    private String sex;
    private boolean hasMane;
    private String object;

    public LionConstructTest(String sex, boolean hasMane, String object) {
        this.sex = sex;
        this.hasMane = hasMane;
        this.object = object;
    }

    @Parameterized.Parameters(name = "Class Lion, sex: {0}")
    public static Object[][] getLionSexData() {
        return new Object[][] {
                { "Самец", true, "hasMane" },
                { "Самка", false, "hasMane" },
                { "Другое", false, "Exception" },
        };
    }

    @Test
    public void LionDifferentSex() {
        Feline feline = new Feline();
        Lion lion;
        String message = "Некорректное значение поля ";
        try{
            lion = new Lion(sex, feline);
            Assert.assertEquals(message + object, hasMane, lion.doesHaveMane());
        }
        catch(Exception ex){
            Assert.assertEquals(message + object, "Используйте допустимые значения " +
                    "пола животного - самец или самка", ex.getMessage());
        }
    }

}
