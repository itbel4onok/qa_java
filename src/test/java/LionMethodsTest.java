import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMethodsTest {
    @Mock
    Feline feline;

    private String defaultLionSex = "Самец";
    private List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void getKittensReturnValue1() throws Exception {
        Lion lion = new Lion(defaultLionSex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnList() throws Exception {
        Lion lion = new Lion(defaultLionSex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedListOfFood);
        Assert.assertEquals(expectedListOfFood, lion.getFood());
    }
}
