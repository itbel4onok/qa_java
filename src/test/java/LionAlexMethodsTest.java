import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionAlexMethodsTest {
    private Feline feline = new Feline();
    private List<String> expectedListOfFriend = List.of("Марти", "Глория", "Мелман");

    @Test
    public void getKittensReturnValue0() throws Exception {
        LionAlex lionALex = new LionAlex(feline);
        Assert.assertEquals(0, lionALex.getKittens());
    }

    @Test
    public void getFriendsReturnList() throws Exception {
        LionAlex lionALex = new LionAlex(feline);
        Assert.assertEquals(expectedListOfFriend, lionALex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnNY() throws Exception {
        LionAlex lionALex = new LionAlex(feline);
        Assert.assertEquals("Нью-Йорский зоопарк", lionALex.getPlaceOfLiving());
    }
}
